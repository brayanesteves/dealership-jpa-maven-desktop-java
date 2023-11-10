package com.halconbit.dealership.jpa.maven.desktop.java.persistence;

import com.halconbit.dealership.jpa.maven.desktop.java.logic.Rol;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.halconbit.dealership.jpa.maven.desktop.java.logic.User;
import com.halconbit.dealership.jpa.maven.desktop.java.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Brayan Esteves
 */
public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public RolJpaController() {
        this.emf = Persistence.createEntityManagerFactory("DealershipPersistenceUnit");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rol rol) {
        if (rol.getListUsers() == null) {
            rol.setListUsers(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedListUsers = new ArrayList<User>();
            for (User listUsersUserToAttach : rol.getListUsers()) {
                listUsersUserToAttach = em.getReference(listUsersUserToAttach.getClass(), listUsersUserToAttach.getId());
                attachedListUsers.add(listUsersUserToAttach);
            }
            rol.setListUsers(attachedListUsers);
            em.persist(rol);
            for (User listUsersUser : rol.getListUsers()) {
                Rol oldRolOfListUsersUser = listUsersUser.getRol();
                listUsersUser.setRol(rol);
                listUsersUser = em.merge(listUsersUser);
                if (oldRolOfListUsersUser != null) {
                    oldRolOfListUsersUser.getListUsers().remove(listUsersUser);
                    oldRolOfListUsersUser = em.merge(oldRolOfListUsersUser);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId());
            List<User> listUsersOld = persistentRol.getListUsers();
            List<User> listUsersNew = rol.getListUsers();
            List<User> attachedListUsersNew = new ArrayList<User>();
            for (User listUsersNewUserToAttach : listUsersNew) {
                listUsersNewUserToAttach = em.getReference(listUsersNewUserToAttach.getClass(), listUsersNewUserToAttach.getId());
                attachedListUsersNew.add(listUsersNewUserToAttach);
            }
            listUsersNew = attachedListUsersNew;
            rol.setListUsers(listUsersNew);
            rol = em.merge(rol);
            for (User listUsersOldUser : listUsersOld) {
                if (!listUsersNew.contains(listUsersOldUser)) {
                    listUsersOldUser.setRol(null);
                    listUsersOldUser = em.merge(listUsersOldUser);
                }
            }
            for (User listUsersNewUser : listUsersNew) {
                if (!listUsersOld.contains(listUsersNewUser)) {
                    Rol oldRolOfListUsersNewUser = listUsersNewUser.getRol();
                    listUsersNewUser.setRol(rol);
                    listUsersNewUser = em.merge(listUsersNewUser);
                    if (oldRolOfListUsersNewUser != null && !oldRolOfListUsersNewUser.equals(rol)) {
                        oldRolOfListUsersNewUser.getListUsers().remove(listUsersNewUser);
                        oldRolOfListUsersNewUser = em.merge(oldRolOfListUsersNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<User> listUsers = rol.getListUsers();
            for (User listUsersUser : listUsers) {
                listUsersUser.setRol(null);
                listUsersUser = em.merge(listUsersUser);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

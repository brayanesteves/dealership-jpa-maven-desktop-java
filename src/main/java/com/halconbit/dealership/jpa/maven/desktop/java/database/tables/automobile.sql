CREATE TABLE IF NOT EXISTS `dealership`.`AUTOMOBILE` (
    `ID`            INT    (255) NOT NULL AUTO_INCREMENT COMMENT '',
    `BRAND`         VARCHAR(50)  NOT NULL                COMMENT '',
    `COLOR`         VARCHAR(20)  NOT NULL                 COMMENT '',
    `ENGINE`        VARCHAR(20)      NULL,
    `LICENSE`       VARCHAR(20)      NULL,
    `MODEL`         VARCHAR(20)      NULL,
    `NUMBEROFDOORS` INT    (2)       NULL,
    PRIMARY KEY (`ID`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='';
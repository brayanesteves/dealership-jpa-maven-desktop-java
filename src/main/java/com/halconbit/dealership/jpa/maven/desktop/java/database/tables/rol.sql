CREATE TABLE IF NOT EXISTS `dealership`.`ROL` (
    `ID`          INT    (255) NOT NULL AUTO_INCREMENT COMMENT '',
    `NAME`        VARCHAR(10)  NOT NULL                COMMENT '',
    `DESCRIPTION` VARCHAR(20)  NOT NULL                COMMENT '',
    PRIMARY KEY (`ID`)
) ENGINE='InnoDB' DEFAULT CHARSET='utf8' COLLATE='utf8_bin' COMMENT='';
/*use bsac;

CREATE TABLE `role`(
  `roleId` integer(10) PRIMARY KEY  NOT NULL AUTO_INCREMENT,
  `user` binary(1) DEFAULT 0,
  `tutor` binary(1) DEFAULT 0,
  `admin` binary(1) DEFAULT 0
);

CREATE TABLE `user`(
  `userId` integer(10) PRIMARY KEY  NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20),
  `lastName` varchar(20),
  `login` varchar(20),
  `password` integer(10),
  `roleId` integer(10) NOT NULL,
  FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`) ON DELETE CASCADE
);

LOCK TABLES `role` WRITE;
INSERT INTO `role` VALUES
(1,1,0,0),(2,0,1,0),(3,0,0,1);
UNLOCK TABLES;

lock tables user write;
insert into user values
(1, "Gavin", "Belson", "GavinBelson", 101, 1),
(2, "Peter", "Gregory", "PeetGreg", 102, 3),
(3, "Richard", "Hendrics", "RichHen", 103, 2),
(4, "Gilfoy", "Canadian", "Canadaonelove", 104, 1),
(5, "Denesh", "Pakistan", "Pakistani", 105, 3);
unlock tables;*/
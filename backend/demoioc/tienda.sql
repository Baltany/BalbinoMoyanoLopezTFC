--Adminer 4.8 .1 MySQL 8.0 .32 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
    `idAddress` int NOT NULL AUTO_INCREMENT,
    `postalCode` int NOT NULL,
    `street` varchar(60)NOT NULL,
    `country` varchar(20)NOT NULL,
    `portal` varchar(20)NOT NULL,
    `city` varchar(20)NOT NULL,
    `number` int NOT NULL,
    PRIMARY KEY(`idAddress`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `address` (
    `idAddress`,
    `postalCode`,
    `street`,
    `country`,
    `portal`,
    `city`,
    `number`
)VALUES(1, 14900, 'Montoro', 'España', '', 'Lucena', 6);

DROP TABLE IF EXISTS `clothes`;
CREATE TABLE `clothes` (
    `idClothes` int NOT NULL AUTO_INCREMENT,
    `size` enum('XXS', 'XS', 'S', 'M', 'L', 'XL', 'XXL', 'MEASURE')NOT NULL,
    `description` varchar(20)NOT NULL,
    `category` enum('SHIRT', 'JEANS', 'JERSEY', 'HOODIE', 'SHORT')NOT NULL,
    `image` varchar(200)NOT NULL,
    `price` double NOT NULL,
    `color` enum('BLUE', 'RED', 'GREY', 'BEIGE', 'BLACK', 'WHITE', 'GREEN', 'YELLOW')NOT NULL,
    `stock` int NOT NULL,
    PRIMARY KEY(`idClothes`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `clothes` (
    `idClothes`,
    `size`,
    `description`,
    `category`,
    `image`,
    `price`,
    `color`,
    `stock`
)VALUES(
    1,
    'XS',
    'Heroes del Silencio',
    'SHIRT',
    'IMAGE NOT FOUND',
    5.99,
    'BEIGE',
    15
);

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
    `idOrder` int NOT NULL AUTO_INCREMENT,
    `totalPrice` double NOT NULL,
    `orderDate` date NOT NULL,
    `clothes` int NOT NULL,
    `user` int NOT NULL,
    PRIMARY KEY(`idOrder`),
    KEY `clothes` (`clothes`),
    KEY `user` (`user`),
    CONSTRAINT `order_ibfk_1` FOREIGN KEY(`clothes`)REFERENCES `clothes` (`idClothes`),
    CONSTRAINT `order_ibfk_2` FOREIGN KEY(`user`)REFERENCES `user` (`idUser`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `order` (`idOrder`, `totalPrice`, `orderDate`, `clothes`, `user`)VALUES(
    1,
    5.99,
    '2023-07-20',
    1,
    1
);

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `idUser` int NOT NULL AUTO_INCREMENT,
    `fisrtName` varchar(20)NOT NULL,
    `lastName` varchar(20)NOT NULL,
    `username` varchar(20)NOT NULL,
    `email` varchar(40)NOT NULL,
    `password` varchar(20)NOT NULL,
    `userType` enum('ADMIN', 'CLIENT', 'CUSTOMER')NOT NULL,
    `dni` varchar(20)NOT NULL,
    `address` int NOT NULL,
    PRIMARY KEY(`idUser`),
    KEY `address` (`address`),
    CONSTRAINT `user_ibfk_1` FOREIGN KEY(`address`)REFERENCES `address` (`idAddress`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `user` (
    `idUser`,
    `fisrtName`,
    `lastName`,
    `username`,
    `email`,
    `password`,
    `userType`,
    `dni`,
    `address`
)VALUES(
    1,
    'Balbino',
    'Moyano',
    'baltany',
    'bmoylop0903@g.educaand.es',
    'admin',
    'ADMIN',
    '50624949s',
    1
);

--2023 - 07 - 20 12 : 26 : 09
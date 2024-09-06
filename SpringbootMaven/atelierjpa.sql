-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 06 sep. 2024 à 11:48
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `atelierjpa`
--

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE `chambre` (
  `ID` bigint(20) NOT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `NUMERO` bigint(20) DEFAULT NULL,
  `PRIX` double DEFAULT NULL,
  `HOTEL_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `chambre`
--

INSERT INTO `chambre` (`ID`, `NOM`, `NUMERO`, `PRIX`, `HOTEL_ID`) VALUES
(1, 'Standard Room', 101, 150, 1),
(2, 'Deluxe Room', 102, 200, 1),
(3, 'Royal Suite', 103, 350, 1),
(4, 'Standard Room', 201, 120, 2),
(5, 'Deluxe Room', 202, 180, 2),
(6, 'Standard Room', 301, 130, 3),
(7, 'Deluxe Room', 302, 210, 3),
(8, 'Penthouse Suite', 303, 400, 3),
(9, 'Standard Room', 401, 140, 4),
(10, 'Executive Suite', 402, 220, 4),
(11, 'Standard Room', 501, 160, 5),
(12, 'Deluxe Room', 502, 210, 5),
(13, 'Presidential Suite', 503, 500, 5),
(14, 'Standard Room', 601, 130, 6),
(15, 'Junior Suite', 602, 180, 6),
(16, 'Standard Room', 701, 110, 7),
(17, 'Deluxe Room', 702, 160, 7),
(18, 'Corner Suite', 703, 250, 7),
(19, 'Eco Room', 801, 90, 8),
(20, 'Standard Room', 802, 140, 8),
(21, 'Deluxe Room', 803, 190, 8),
(22, 'Single Room', 901, 100, 9),
(23, 'Double Room', 902, 150, 9),
(24, 'Standard Room', 1001, 120, 10),
(25, 'Deluxe Room', 1002, 170, 10),
(26, 'Luxury Suite', 1003, 300, 10);

-- --------------------------------------------------------

--
-- Structure de la table `chambre_reservation`
--

CREATE TABLE `chambre_reservation` (
  `reservations_ID` bigint(20) NOT NULL,
  `chambres_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `ID` bigint(20) NOT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`ID`, `NOM`, `PRENOM`) VALUES
(1, 'Smith', 'John'),
(2, 'Doe', 'Jane'),
(3, 'Brown', 'Michael'),
(4, 'Taylor', 'Laura'),
(5, 'Johnson', 'David'),
(6, 'Lee', 'Sarah'),
(7, 'White', 'James'),
(8, 'Harris', 'Emma'),
(9, 'Martin', 'Robert'),
(10, 'Thompson', 'Lucy'),
(11, 'Garcia', 'Maria'),
(12, 'Martinez', 'Jose'),
(13, 'Robinson', 'Lisa'),
(14, 'Clark', 'Mark'),
(15, 'Rodriguez', 'Carlos'),
(16, 'Lewis', 'Elizabeth'),
(17, 'Walker', 'William'),
(18, 'Hall', 'Patricia'),
(19, 'Allen', 'Dorothy'),
(20, 'Young', 'Thomas');

-- --------------------------------------------------------

--
-- Structure de la table `hotel`
--

CREATE TABLE `hotel` (
  `ID` bigint(20) NOT NULL,
  `CODEPOSTAL` bigint(20) DEFAULT NULL,
  `LOCALITE` varchar(255) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `NUM` bigint(20) DEFAULT NULL,
  `RUE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `hotel`
--

INSERT INTO `hotel` (`ID`, `CODEPOSTAL`, `LOCALITE`, `NOM`, `NUM`, `RUE`) VALUES
(1, 10001, 'New York', 'Grand Empire Hotel', 101, '5th Avenue'),
(2, 94102, 'San Francisco', 'Bay Hotel', 202, 'Market Street'),
(3, 90015, 'Los Angeles', 'Sunset Hotel', 303, 'Sunset Boulevard'),
(4, 33131, 'Miami', 'Ocean View Resort', 404, 'Brickell Avenue'),
(5, 60601, 'Chicago', 'Windy City Inn', 505, 'Michigan Avenue'),
(6, 75201, 'Dallas', 'Starlight Suites', 606, 'Elm Street'),
(7, 89109, 'Las Vegas', 'Desert Sands Hotel', 707, 'Vegas Boulevard'),
(8, 2116, 'Boston', 'Historic Boston Hotel', 808, 'Boylston Street'),
(9, 98101, 'Seattle', 'Rainy City Hotel', 909, 'Pine Street'),
(10, 20005, 'Washington', 'Capital Inn', 1010, 'K Street NW');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `ID` bigint(20) NOT NULL,
  `DATEDEBUT` date DEFAULT NULL,
  `DATEFIN` date DEFAULT NULL,
  `CLIENT_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Structure de la table `sequence`
--

CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', 50);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_CHAMBRE_HOTEL_ID` (`HOTEL_ID`);

--
-- Index pour la table `chambre_reservation`
--
ALTER TABLE `chambre_reservation`
  ADD PRIMARY KEY (`reservations_ID`,`chambres_ID`),
  ADD KEY `FK_CHAMBRE_RESERVATION_chambres_ID` (`chambres_ID`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_RESERVATION_CLIENT_ID` (`CLIENT_ID`);

--
-- Index pour la table `sequence`
--
ALTER TABLE `sequence`
  ADD PRIMARY KEY (`SEQ_NAME`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD CONSTRAINT `FK_CHAMBRE_HOTEL_ID` FOREIGN KEY (`HOTEL_ID`) REFERENCES `hotel` (`ID`);

--
-- Contraintes pour la table `chambre_reservation`
--
ALTER TABLE `chambre_reservation`
  ADD CONSTRAINT `FK_CHAMBRE_RESERVATION_chambres_ID` FOREIGN KEY (`chambres_ID`) REFERENCES `chambre` (`ID`),
  ADD CONSTRAINT `FK_CHAMBRE_RESERVATION_reservations_ID` FOREIGN KEY (`reservations_ID`) REFERENCES `reservation` (`ID`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_RESERVATION_CLIENT_ID` FOREIGN KEY (`CLIENT_ID`) REFERENCES `client` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

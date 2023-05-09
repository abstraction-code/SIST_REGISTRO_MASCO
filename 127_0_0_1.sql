-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 09-05-2023 a las 18:51:41
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro_mascotas`
--
CREATE DATABASE IF NOT EXISTS `registro_mascotas` DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci;
USE `registro_mascotas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dueno`
--
-- Creación: 29-04-2023 a las 05:31:53
-- Última actualización: 09-05-2023 a las 17:31:12
--

DROP TABLE IF EXISTS `dueno`;
CREATE TABLE IF NOT EXISTS `dueno` (
  `ID_DUENO` int NOT NULL AUTO_INCREMENT,
  `CELDUENO` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `NOMBRE` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`ID_DUENO`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `dueno`
--

INSERT INTO `dueno` (`ID_DUENO`, `CELDUENO`, `NOMBRE`) VALUES
(11, '58569965', 'Ari');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--
-- Creación: 29-04-2023 a las 05:31:53
-- Última actualización: 09-05-2023 a las 18:33:04
-- Última revisión: 29-04-2023 a las 05:31:53
--

DROP TABLE IF EXISTS `mascota`;
CREATE TABLE IF NOT EXISTS `mascota` (
  `NUM_CLIENTE` int NOT NULL AUTO_INCREMENT,
  `ALERGICO` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `ATENCION_ESPECIAL` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `NOMBRE` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `OBSERVACIONES` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `RAZA` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `UNDUENO_ID_DUENO` int DEFAULT NULL,
  PRIMARY KEY (`NUM_CLIENTE`),
  KEY `FK_MASCOTA_UNDUENO_ID_DUENO` (`UNDUENO_ID_DUENO`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`NUM_CLIENTE`, `ALERGICO`, `ATENCION_ESPECIAL`, `NOMBRE`, `OBSERVACIONES`, `RAZA`, `UNDUENO_ID_DUENO`) VALUES
(11, 'No', 'No', 'Ari', 'Perro Cochino', 'Mil Leches', 11);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

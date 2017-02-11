-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 10, 2017 at 07:11 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `agenda`
--

-- --------------------------------------------------------

--
-- Table structure for table `contacto`
--

CREATE TABLE IF NOT EXISTS `contacto` (
`IDContacto` int(11) NOT NULL,
  `Nombre` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `ApellidoP` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `ApellidoM` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `FechadeN` date DEFAULT NULL,
  `IDMedioC` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `deportista`
--

CREATE TABLE IF NOT EXISTS `deportista` (
`IDDeportista` int(11) NOT NULL,
  `Genero` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `Deporte` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `IDOcupacion` int(11) DEFAULT NULL,
  `IDContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
`IDDoc` int(11) NOT NULL,
  `Especialidad` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `NombreHospital` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `DireccHospital` varchar(150) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `IDOcupacion` int(11) DEFAULT NULL,
  `IDContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
`IDEstudiante` int(11) NOT NULL,
  `LugardeN` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `Carrera` varchar(70) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `Correo` varchar(70) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `IDOcupacion` int(11) DEFAULT NULL,
  `IDContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `licenciado`
--

CREATE TABLE IF NOT EXISTS `licenciado` (
`IDLicenciado` int(11) NOT NULL,
  `HorarioAtencion` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `TelefonoOficina` int(11) NOT NULL,
  `IDOcupacion` int(11) DEFAULT NULL,
  `IDContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mediodecontacto`
--

CREATE TABLE IF NOT EXISTS `mediodecontacto` (
`IDMedioC` int(11) NOT NULL,
  `Celular` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Casa` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Mail` varchar(150) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ocupacion`
--

CREATE TABLE IF NOT EXISTS `ocupacion` (
`IDOcupacion` int(11) NOT NULL,
  `Ocupacion` varchar(150) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
`IDPersona` int(11) NOT NULL,
  `Domicilio` varchar(150) COLLATE utf8_spanish2_ci NOT NULL,
  `Ocupacion` varchar(150) COLLATE utf8_spanish2_ci NOT NULL,
  `ContactoPref` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `IDOcupacion` int(11) DEFAULT NULL,
  `IDContacto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contacto`
--
ALTER TABLE `contacto`
 ADD PRIMARY KEY (`IDContacto`), ADD KEY `IDMedioC` (`IDMedioC`);

--
-- Indexes for table `deportista`
--
ALTER TABLE `deportista`
 ADD PRIMARY KEY (`IDDeportista`), ADD KEY `IDOcupacion` (`IDOcupacion`), ADD KEY `IDContacto` (`IDContacto`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
 ADD PRIMARY KEY (`IDDoc`), ADD KEY `IDOcupacion` (`IDOcupacion`), ADD KEY `IDContacto` (`IDContacto`);

--
-- Indexes for table `estudiante`
--
ALTER TABLE `estudiante`
 ADD PRIMARY KEY (`IDEstudiante`), ADD KEY `IDOcupacion` (`IDOcupacion`), ADD KEY `IDContacto` (`IDContacto`);

--
-- Indexes for table `licenciado`
--
ALTER TABLE `licenciado`
 ADD PRIMARY KEY (`IDLicenciado`), ADD KEY `IDOcupacion` (`IDOcupacion`), ADD KEY `IDContacto` (`IDContacto`);

--
-- Indexes for table `mediodecontacto`
--
ALTER TABLE `mediodecontacto`
 ADD PRIMARY KEY (`IDMedioC`);

--
-- Indexes for table `ocupacion`
--
ALTER TABLE `ocupacion`
 ADD PRIMARY KEY (`IDOcupacion`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
 ADD PRIMARY KEY (`IDPersona`), ADD KEY `IDOcupacion` (`IDOcupacion`), ADD KEY `IDContacto` (`IDContacto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contacto`
--
ALTER TABLE `contacto`
MODIFY `IDContacto` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `deportista`
--
ALTER TABLE `deportista`
MODIFY `IDDeportista` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
MODIFY `IDDoc` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `estudiante`
--
ALTER TABLE `estudiante`
MODIFY `IDEstudiante` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `licenciado`
--
ALTER TABLE `licenciado`
MODIFY `IDLicenciado` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `mediodecontacto`
--
ALTER TABLE `mediodecontacto`
MODIFY `IDMedioC` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ocupacion`
--
ALTER TABLE `ocupacion`
MODIFY `IDOcupacion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
MODIFY `IDPersona` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `contacto`
--
ALTER TABLE `contacto`
ADD CONSTRAINT `contacto_ibfk_1` FOREIGN KEY (`IDMedioC`) REFERENCES `mediodecontacto` (`IDMedioC`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `deportista`
--
ALTER TABLE `deportista`
ADD CONSTRAINT `deportista_ibfk_1` FOREIGN KEY (`IDOcupacion`) REFERENCES `ocupacion` (`IDOcupacion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `deportista_ibfk_2` FOREIGN KEY (`IDContacto`) REFERENCES `contacto` (`IDContacto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`IDOcupacion`) REFERENCES `ocupacion` (`IDOcupacion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `doctor_ibfk_2` FOREIGN KEY (`IDContacto`) REFERENCES `contacto` (`IDContacto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `estudiante`
--
ALTER TABLE `estudiante`
ADD CONSTRAINT `estudiante_ibfk_1` FOREIGN KEY (`IDOcupacion`) REFERENCES `ocupacion` (`IDOcupacion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `estudiante_ibfk_2` FOREIGN KEY (`IDContacto`) REFERENCES `contacto` (`IDContacto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `licenciado`
--
ALTER TABLE `licenciado`
ADD CONSTRAINT `licenciado_ibfk_1` FOREIGN KEY (`IDOcupacion`) REFERENCES `ocupacion` (`IDOcupacion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `licenciado_ibfk_2` FOREIGN KEY (`IDContacto`) REFERENCES `contacto` (`IDContacto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `persona`
--
ALTER TABLE `persona`
ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`IDOcupacion`) REFERENCES `ocupacion` (`IDOcupacion`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `persona_ibfk_2` FOREIGN KEY (`IDContacto`) REFERENCES `contacto` (`IDContacto`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

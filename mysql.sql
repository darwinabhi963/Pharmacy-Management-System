-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.16 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5249
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ipproject
CREATE DATABASE IF NOT EXISTS `ipproject` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ipproject`;

-- Dumping structure for table ipproject.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `ADMINNO` int(20) NOT NULL,
  `ADMINNAME` varchar(20) NOT NULL,
  `ADMINAGE` int(5) NOT NULL,
  `ADMINGENDER` varchar(10) NOT NULL,
  `ADMINDEPT` varchar(20) NOT NULL,
  `ADMINMOB` mediumtext NOT NULL,
  `ADMINADD` varchar(300) DEFAULT NULL,
  `ADMINMAIL` varchar(50) NOT NULL,
  PRIMARY KEY (`ADMINNO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.cart
CREATE TABLE IF NOT EXISTS `cart` (
  `SNO` int(10) NOT NULL,
  `MEDNAME` varchar(50) NOT NULL,
  `MEDCOMP` varchar(50) NOT NULL,
  `MEDPRICE` decimal(10,2) NOT NULL,
  `MEDMFD` date NOT NULL,
  `MEDEXP` date NOT NULL,
  `MEDMANF` varchar(50) NOT NULL,
  `MEDDOSE` varchar(10) NOT NULL,
  `SCHEDULEDHDRUG` varchar(10) NOT NULL,
  `QUANTITY` int(10) NOT NULL,
  `TOTAL` decimal(10,2) NOT NULL,
  `CUSNAME` varchar(20) NOT NULL,
  PRIMARY KEY (`SNO`),
  UNIQUE KEY `MEDNAME` (`MEDNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.creditcard
CREATE TABLE IF NOT EXISTS `creditcard` (
  `EXPMM` int(2) DEFAULT NULL,
  `EXPYYYY` int(4) DEFAULT NULL,
  `CVV` int(3) DEFAULT NULL,
  `CARDNO` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `CUSNAME` varchar(20) NOT NULL,
  `CUSAGE` int(5) NOT NULL,
  `CUSGENDER` varchar(10) NOT NULL,
  `CUSMOB` mediumtext NOT NULL,
  `CUSADD` varchar(300) DEFAULT NULL,
  `CUSMAIL` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.debitcard
CREATE TABLE IF NOT EXISTS `debitcard` (
  `EXPMM` int(2) DEFAULT NULL,
  `EXPYYYY` int(4) DEFAULT NULL,
  `CVV` int(3) DEFAULT NULL,
  `CARDNO` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.feedback
CREATE TABLE IF NOT EXISTS `feedback` (
  `CUSNAME` varchar(20) NOT NULL,
  `FEEDBACK` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.medicines
CREATE TABLE IF NOT EXISTS `medicines` (
  `MEDID` int(20) NOT NULL,
  `MEDNAME` varchar(30) NOT NULL,
  `MEDFUNC` varchar(50) NOT NULL,
  `MEDCOMP` varchar(30) NOT NULL,
  `MEDPRICE` decimal(10,2) NOT NULL,
  `MEDMFD` date NOT NULL,
  `MEDEXP` date NOT NULL,
  `MEDMANF` varchar(40) NOT NULL,
  `MEDDOSE` varchar(20) NOT NULL,
  `SCHEDULEDHDRUG` varchar(5) NOT NULL,
  `STOCK` int(100) DEFAULT NULL,
  PRIMARY KEY (`MEDID`),
  UNIQUE KEY `MEDNAME` (`MEDNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.netbanking
CREATE TABLE IF NOT EXISTS `netbanking` (
  `USERNAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  `ACCOUNTNO` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `ORDERID` int(20) NOT NULL,
  `CUSNAME` varchar(50) NOT NULL,
  `ORDERPRICE` decimal(10,2) NOT NULL,
  `PLACEDATE` date NOT NULL,
  `DELIVERYDATE` date NOT NULL,
  `NOOFITEMS` int(255) NOT NULL,
  PRIMARY KEY (`ORDERID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
-- Dumping structure for table ipproject.users
CREATE TABLE IF NOT EXISTS `users` (
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `DEPT` varchar(20) NOT NULL,
  `EMAILID` varchar(20) DEFAULT NULL,
  `MOBILENO` mediumtext,
  PRIMARY KEY (`USERNAME`),
  UNIQUE KEY `PASSWORD` (`PASSWORD`),
  UNIQUE KEY `EMAILID` (`EMAILID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2021 at 09:39 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlch_dien_tu`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `ID_Bill` int(11) NOT NULL,
  `Price_Bill` double NOT NULL,
  `Day_Bill` varchar(20) NOT NULL,
  `ID_Product` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `catago`
--

CREATE TABLE `catago` (
  `ID_Catago` int(11) NOT NULL,
  `Name_Combo_Catago` varchar(20) NOT NULL,
  `Price_Combo_Catago` double NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ID_Customer` int(11) NOT NULL,
  `Name_Customer` varchar(30) NOT NULL,
  `Sex` varchar(3) NOT NULL,
  `Adress` varchar(40) NOT NULL,
  `Phone_Number` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID_Customer`, `Name_Customer`, `Sex`, `Adress`, `Phone_Number`) VALUES
(1, 'Văn Toàn', 'Nam', '30/7 Quận 7', '09740862485'),
(2, 'Văn Vinh', 'Nam', '310/45 Quận 1', '01254789654'),
(3, 'WhoVin', 'Nam', '32/32/32 Quận 2', '01254786587'),
(4, 'DanceKhoa', 'Nu', '30 cần thơ', '09874568745'),
(5, 'HaiLong', 'Nam', 'An bình Quận 5', '01254789654'),
(6, 'Nguyễn Triệu Minh Kh', 'Nam', '421 Thạnh Xuân 22, Quận 12', '04587885826');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ID_Product` int(11) NOT NULL,
  `Name_Product` varchar(20) NOT NULL,
  `Price_Product` int(11) NOT NULL,
  `Amount_Product` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID_Product`, `Name_Product`, `Price_Product`, `Amount_Product`) VALUES
(1, 'Laptop Asus', 15000000, 50),
(2, 'Laptop Gaming MSI', 26000000, 20),
(3, 'Thùng PC chip i8', 15000000, 15),
(4, 'Tản nhiệt nước', 10000000, 50),
(5, 'Tản nhiệt gió', 8000000, 50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`ID_Bill`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

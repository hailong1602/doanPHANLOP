-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 17, 2021 lúc 04:51 PM
-- Phiên bản máy phục vụ: 10.4.19-MariaDB
-- Phiên bản PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlch_dien_tu`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `ID_Bill` int(11) NOT NULL,
  `ID_Customer` int(11) NOT NULL,
  `ID_Catago` int(11) NOT NULL,
  `Price_Bill` double NOT NULL,
  `Day_Bill` varchar(20) NOT NULL,
  `Total_Discout_Bill` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill_detail`
--

CREATE TABLE `bill_detail` (
  `ID_Bill` int(11) NOT NULL,
  `ID_Product` int(11) NOT NULL,
  `Amount_Bill` int(11) NOT NULL,
  `Price_Bill` double NOT NULL,
  `Total_Discout_Bill` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `ID_Cart` int(11) NOT NULL,
  `ID_Product` int(11) NOT NULL,
  `ID_Customer` int(11) NOT NULL,
  `ID_Session` int(11) NOT NULL,
  `Amount_Product_Cart` int(11) NOT NULL,
  `Name_Product` varchar(20) NOT NULL,
  `Price_Product` double NOT NULL,
  `img_path` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `catago`
--

CREATE TABLE `catago` (
  `ID_Catago` int(11) NOT NULL,
  `ID_Product` int(11) NOT NULL,
  `Name_Combo_Catago` varchar(20) NOT NULL,
  `Price_Combo_Catago` double NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `catago`
--

INSERT INTO `catago` (`ID_Catago`, `ID_Product`, `Name_Combo_Catago`, `Price_Combo_Catago`, `Status`) VALUES
(1, 1, 'Khuyến mãi noel', 20000000, '1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customer`
--

CREATE TABLE `customer` (
  `ID_Customer` int(11) NOT NULL,
  `Name_Customer` varchar(30) NOT NULL,
  `Sex` varchar(3) NOT NULL,
  `Adress` varchar(40) NOT NULL,
  `Phone_Number` varchar(12) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=FIXED;

--
-- Đang đổ dữ liệu cho bảng `customer`
--

INSERT INTO `customer` (`ID_Customer`, `Name_Customer`, `Sex`, `Adress`, `Phone_Number`) VALUES
(1, 'Văn Toàn', 'Nam', '30/7 Quận 7', '09740862485'),
(2, 'Văn Vinh', 'Nam', '310/45 Quận 1', '01254789654'),
(3, 'WhoVin', 'Nam', '32/32/32 Quận 2', '01254786587'),
(4, 'DanceKhoa', 'Nu', '30 cần thơ', '09874568745'),
(5, 'HaiLong', 'Nam', 'An bình Quận 5', '01254789654'),
(6, 'Nguyễn Triệu Minh Khôi Nguyên', 'Nam', '421 Thạnh Xuân 22, Quận 12', '04587885826');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `ID_Product` int(11) NOT NULL,
  `Name_Product` varchar(20) NOT NULL,
  `Price_Product` int(11) NOT NULL,
  `Description_Product` varchar(1000) NOT NULL,
  `Amount_Product` int(11) NOT NULL,
  `img_path` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 ROW_FORMAT=FIXED;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`ID_Product`, `Name_Product`, `Price_Product`, `Description_Product`, `Amount_Product`, `img_path`) VALUES
(1, 'Laptop Asus', 15000000, 'Laptop Asus  thiết kế nhỏ gọn, vẻ ngoài năng động, phong cách đơn giản nhưng lại cực kỳ thời trang và tinh tế, cùng với vỏ ngoài phủ tông', 50, 'laptopAsus.jpg'),
(2, 'Laptop Gaming MSI', 26000000, '', 20, 'laptopMSI.jpg'),
(3, 'Thùng PC chip i8', 15000000, '', 15, 'CPUAsus'),
(4, 'Tản nhiệt nước', 10000000, '', 50, 'tannhietnuoc.jpg'),
(5, 'Tản nhiệt gió', 8000000, '', 50, 'tannhietgio.jpg'),
(6, 'Laptop Acer', 16000000, 'Laptop Acer Aspire sở hữu thiết kế tinh tế với phần lớn khung máy được làm từ sợi plastic tổng hợp có độ bền cao, chống chịu va đập mạnh và chịu nhiệt tốt. Toàn bộ phần đế máy, nơi gần như tất cả phần cứng được lưu trữ có khung chắn chắn và chỉ cong nhẹ xảy ra khi áp dụng lực.', 50, 'laptopAcer.jpg'),
(7, ':Laptop Dell', 14000000, 'Nếu bạn đang kiếm tìm một chiếc laptop hỗ trợ chuyên nghiệp cho công việc thì Dell Vostro V5581 là sản phẩm lý tưởng nhất', 50, 'laptopDell.jpg'),
(8, 'Màn hình Dell', 3000000, 'Màn hình CUP', 100, 'manhinhDell.jpg'),
(9, 'Màn hình MSI', 11000000, 'Màn hình MSI', 15, 'manhinhMSI.jpg'),
(10, 'ổ quang SSD', 12000000, 'Ổ quang từ SSD', 50, 'SSD.jpg'),
(11, 'Ổ cứng HDD', 8000000, 'Ổ cứng HDD', 50, 'HDD.jpg');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`ID_Bill`),
  ADD UNIQUE KEY `ID_Bill` (`ID_Bill`),
  ADD KEY `ID_Customer` (`ID_Customer`),
  ADD KEY `ID_Catago` (`ID_Catago`);

--
-- Chỉ mục cho bảng `bill_detail`
--
ALTER TABLE `bill_detail`
  ADD PRIMARY KEY (`ID_Bill`),
  ADD KEY `ID_Product` (`ID_Product`);

--
-- Chỉ mục cho bảng `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`ID_Cart`),
  ADD KEY `ID_Product` (`ID_Product`),
  ADD KEY `ID_Customer` (`ID_Customer`);

--
-- Chỉ mục cho bảng `catago`
--
ALTER TABLE `catago`
  ADD PRIMARY KEY (`ID_Catago`),
  ADD UNIQUE KEY `ID_Catago` (`ID_Catago`),
  ADD KEY `ID_Product` (`ID_Product`);

--
-- Chỉ mục cho bảng `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID_Customer`),
  ADD UNIQUE KEY `ID_Customer` (`ID_Customer`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ID_Product`),
  ADD UNIQUE KEY `ID_Product` (`ID_Product`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`ID_Catago`) REFERENCES `catago` (`ID_Catago`);

--
-- Các ràng buộc cho bảng `bill_detail`
--
ALTER TABLE `bill_detail`
  ADD CONSTRAINT `bill_detail_ibfk_1` FOREIGN KEY (`ID_Bill`) REFERENCES `bill` (`ID_Bill`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

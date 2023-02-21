-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 03 Haz 2022, 17:17:50
-- Sunucu sürümü: 8.0.29
-- PHP Sürümü: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `akbil_otomasyon_database`
--
CREATE DATABASE IF NOT EXISTS `akbil_otomasyon_database` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci;
USE `akbil_otomasyon_database`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_gorus`
--

CREATE TABLE `tbl_gorus` (
  `kart_no` int NOT NULL,
  `tür` varchar(10) COLLATE utf8mb4_turkish_ci NOT NULL,
  `kategori` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `mesaj` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_kul`
--

CREATE TABLE `tbl_kul` (
  `id` int NOT NULL,
  `telefon` varchar(12) COLLATE utf8mb4_turkish_ci NOT NULL,
  `sifre` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `kart_no` varchar(12) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tbl_kul`
--

INSERT INTO `tbl_kul` (`id`, `telefon`, `sifre`, `kart_no`) VALUES
(1, '05554443322', '1234', '123456');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_login`
--

CREATE TABLE `tbl_login` (
  `Id` int NOT NULL,
  `Telefon` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci NOT NULL,
  `Sifre` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tbl_login`
--

INSERT INTO `tbl_login` (`Id`, `Telefon`, `Sifre`) VALUES
(3, '12125220835', '123456'),
(6, '5055055500', 'mali'),
(8, '12125220834', '123456'),
(9, '1252225552', 'saat');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_sorgu`
--

CREATE TABLE `tbl_sorgu` (
  `gecmis` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tbl_sorgu`
--

INSERT INTO `tbl_sorgu` (`gecmis`) VALUES
('2022-06-01'),
('2022-06-11');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tbl_user`
--

CREATE TABLE `tbl_user` (
  `kart_no` int NOT NULL,
  `bakiye` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tbl_user`
--

INSERT INTO `tbl_user` (`kart_no`, `bakiye`) VALUES
(123454321, 0),
(123456, 15);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `tbl_gorus`
--
ALTER TABLE `tbl_gorus`
  ADD PRIMARY KEY (`kart_no`);

--
-- Tablo için indeksler `tbl_kul`
--
ALTER TABLE `tbl_kul`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `tbl_login`
--
ALTER TABLE `tbl_login`
  ADD PRIMARY KEY (`Id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `tbl_kul`
--
ALTER TABLE `tbl_kul`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `tbl_login`
--
ALTER TABLE `tbl_login`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2023 at 03:52 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicappointment`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_appointment`
--

CREATE TABLE `tbl_appointment` (
  `a_id` int(10) NOT NULL,
  `d_id` int(10) NOT NULL,
  `p_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_doctor`
--

CREATE TABLE `tbl_doctor` (
  `d_id` int(10) NOT NULL,
  `d_lastname` varchar(100) NOT NULL,
  `d_firstname` varchar(100) NOT NULL,
  `d_middle` varchar(50) NOT NULL,
  `d_gender` varchar(20) NOT NULL,
  `d_status` varchar(20) NOT NULL,
  `d_address` varchar(100) NOT NULL,
  `d_contact` varchar(50) NOT NULL,
  `d_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_doctor`
--

INSERT INTO `tbl_doctor` (`d_id`, `d_lastname`, `d_firstname`, `d_middle`, `d_gender`, `d_status`, `d_address`, `d_contact`, `d_email`) VALUES
(1, 'sad123123', 'sad', 'dsga', 'dsgaha', 'haha', 'cxvdsgahaa', 'dsgaha', 'dsgha'),
(2, 'sf', 'saf', 'fas', 'fsa', 'gd', 'sg', 'hr', 'gh'),
(3, 'fgf', 'cv', 'dsfs', 'dsf', 'dsf', 'fsdf', 'fds', 'fdsf'),
(4, 'jh', 'jh', 'hj', 'hhj', 'bn', 'nb', 'bn', 'bnb'),
(5, 'jh11', 'jh', 'hj', 'hhj', 'bn', 'nb', 'bn', 'bnb111'),
(6, 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd'),
(7, 'asd', 'asd', 'asd', 'Male', 'Widow', 'asd', 'asd', 'asd');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `p_id` int(10) NOT NULL,
  `p_lastname` varchar(100) NOT NULL,
  `p_firstname` varchar(100) NOT NULL,
  `p_middle` varchar(50) NOT NULL,
  `p_gender` varchar(20) NOT NULL,
  `p_status` varchar(20) NOT NULL,
  `p_email` varchar(50) NOT NULL,
  `p_address` varchar(100) NOT NULL,
  `p_contact` varchar(20) NOT NULL,
  `p_date` varchar(100) NOT NULL,
  `p_time` varchar(20) NOT NULL,
  `p_remark` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`p_id`, `p_lastname`, `p_firstname`, `p_middle`, `p_gender`, `p_status`, `p_email`, `p_address`, `p_contact`, `p_date`, `p_time`, `p_remark`) VALUES
(11, 'qwe', 'qwe', 'qwe', 'Male', 'Widow', 'qwe', 'qwe', 'qwe', '', 'qwe', 'qwe'),
(12, 'qweqwe', 'qwe', 'qweq', 'Female', 'Engaged', 'qwe', 'qwe', 'qwe', 'qwe', 'weqwe', 'qweq'),
(13, 'asd', 'asd', 'asd', 'Female', 'Single', 'asd', 'asd', 'asd', 'asd', 'asd', 'asdas'),
(14, '213', '123', '123', 'Male', 'Engaged', '123', '123', '123', 'Jun 21, 2023', '123', '123'),
(15, '123213123', '123213123', '1231231', 'Female', 'Single', '123123123', '123123123', '123123123', 'Jun 19, 2023', '12312312', '3123123123'),
(16, 'bnm', 'bnm', 'bnm', 'Male', 'Single', 'bnm', 'bnm', 'bnm', 'Jun 4, 2023', 'bnm', 'bnm');

-- --------------------------------------------------------

--
-- Table structure for table `user_db`
--

CREATE TABLE `user_db` (
  `u_id` int(10) NOT NULL,
  `u_firstname` varchar(100) NOT NULL,
  `u_lastname` varchar(100) NOT NULL,
  `u_username` varchar(100) NOT NULL,
  `u_contact` varchar(20) NOT NULL,
  `u_password` varchar(100) NOT NULL,
  `u_pic` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_db`
--

INSERT INTO `user_db` (`u_id`, `u_firstname`, `u_lastname`, `u_username`, `u_contact`, `u_password`, `u_pic`) VALUES
(1, 'judy', 'tapere', 'juday', '959548485448', 'judy123', ''),
(2, 'hah', 'haha', 'hatdog', '0837493248', 'hatdog123', ''),
(3, 'hatdog', 'hatdog', 'hatdog', 'hatdog', 'hatdog', ''),
(4, 'judyyyy', 'judyyyy', 'judyyyy', 'judyyyy', '$2a$10$vQASmZGn5yDOoFLBALZ1YOSZtVTE8tO2lnMzt7hfaWPnF8m8YfLk2', 'C:\\\\Users\\\\SCC-PC19\\\\Pictures\\\\rr.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `appoint_doctor` (`d_id`),
  ADD KEY `appoint_patient` (`p_id`);

--
-- Indexes for table `tbl_doctor`
--
ALTER TABLE `tbl_doctor`
  ADD PRIMARY KEY (`d_id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `user_db`
--
ALTER TABLE `user_db`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  MODIFY `a_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_doctor`
--
ALTER TABLE `tbl_doctor`
  MODIFY `d_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `p_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `user_db`
--
ALTER TABLE `user_db`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD CONSTRAINT `appoint_doctor` FOREIGN KEY (`d_id`) REFERENCES `tbl_doctor` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `appoint_patient` FOREIGN KEY (`p_id`) REFERENCES `tbl_patient` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

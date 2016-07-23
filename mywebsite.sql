-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 23, 2016 at 06:40 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mywebsite`
--

-- --------------------------------------------------------

--
-- Table structure for table `myblog`
--

CREATE TABLE IF NOT EXISTS `myblog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `blogTitle` varchar(255) NOT NULL,
  `blogSummary` text NOT NULL,
  `blog` text NOT NULL,
  `date` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `myblog`
--

INSERT INTO `myblog` (`id`, `blogTitle`, `blogSummary`, `blog`, `date`) VALUES
(1, 'sdfas', 'asdfa', 'fasdf', 'asdf'),
(2, 'Hello world', 'this is my first blog', 'this is the blog which i created.', '18th june'),
(3, 'jjjj', 'uuuu', 'yyyy', '7767'),
(4, 'jjjj', 'uuuu', 'yyyy', '7767'),
(5, 'jjjj', 'uuuu', 'yyyy', '7767'),
(6, 'Hello world', 'this is my first blog', 'this is the blog which i created.', '18th june');

-- --------------------------------------------------------

--
-- Table structure for table `super_user`
--

CREATE TABLE IF NOT EXISTS `super_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `super_user`
--

INSERT INTO `super_user` (`id`, `username`, `password`) VALUES
(1, 'vaindream', 'rabiulalam');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

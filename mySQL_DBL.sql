CREATE DATABASE `sys` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;CREATE TABLE `bookings` (
  `flight_num` varchar(10) NOT NULL,
  `customerid` int(11) NOT NULL,
  `bookingid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`bookingid`),
  KEY `newcustomerID_idx` (`customerid`),
  CONSTRAINT `customerID` FOREIGN KEY (`customerid`) REFERENCES `customer` (`newcustomerid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `customer` (
  `newcustomerID` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `street` varchar(60) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `state` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `zip` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `username_field` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password_field` varchar(16) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `SSN` int(9) NOT NULL,
  `security_question` varchar(75) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `security_answer` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  UNIQUE KEY `newcustomerID` (`newcustomerID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `flights` (
  `flight_num` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `departure_time` time NOT NULL,
  `arrival_time` time NOT NULL,
  `departure_city` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `arrival_city` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `seats_available` decimal(1,0) NOT NULL,
  PRIMARY KEY (`flight_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

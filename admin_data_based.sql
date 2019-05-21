-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: admin_data_based
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `examination`
--

DROP TABLE IF EXISTS `examination`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examination` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `atlas_od` longblob,
  `atlas_os` longblob,
  `atlas_ou` longblob,
  `bot_od` varchar(255) DEFAULT NULL,
  `bot_os` varchar(255) DEFAULT NULL,
  `camera_od` longblob,
  `camera_od3d` longblob,
  `camera_os` longblob,
  `camera_os3d` longblob,
  `corneen_od` longblob,
  `corneen_os` longblob,
  `date_of_survey` date NOT NULL,
  `field_view_ou` longblob,
  `format_file_atlas_od` varchar(255) DEFAULT NULL,
  `format_file_atlas_os` varchar(255) DEFAULT NULL,
  `format_file_atlas_ou` varchar(255) DEFAULT NULL,
  `format_file_camera_od` varchar(255) DEFAULT NULL,
  `format_file_camera_od3d` varchar(255) DEFAULT NULL,
  `format_file_camera_os` varchar(255) DEFAULT NULL,
  `format_file_camera_os3d` varchar(255) DEFAULT NULL,
  `format_file_corneen_od` varchar(255) DEFAULT NULL,
  `format_file_corneen_os` varchar(255) DEFAULT NULL,
  `format_file_field_view_ou` varchar(255) DEFAULT NULL,
  `format_file_gdx_od` varchar(255) DEFAULT NULL,
  `format_file_gdx_os` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_od1` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_od2` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_od3` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_od4` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_os1` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_os2` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_os3` varchar(255) DEFAULT NULL,
  `format_file_hickness_of_cornea_os4` varchar(255) DEFAULT NULL,
  `format_file_hrt_od` varchar(255) DEFAULT NULL,
  `format_file_hrt_os` varchar(255) DEFAULT NULL,
  `format_file_hrt_ou` varchar(255) DEFAULT NULL,
  `format_file_humphrey_od` varchar(255) DEFAULT NULL,
  `format_file_humphrey_os` varchar(255) DEFAULT NULL,
  `format_file_macula_od1` varchar(255) DEFAULT NULL,
  `format_file_macula_od2` varchar(255) DEFAULT NULL,
  `format_file_macula_od3` varchar(255) DEFAULT NULL,
  `format_file_macula_od3d1` varchar(255) DEFAULT NULL,
  `format_file_macula_od3d2` varchar(255) DEFAULT NULL,
  `format_file_macula_od3d3` varchar(255) DEFAULT NULL,
  `format_file_macula_od3d4` varchar(255) DEFAULT NULL,
  `format_file_macula_od4` varchar(255) DEFAULT NULL,
  `format_file_macula_os1` varchar(255) DEFAULT NULL,
  `format_file_macula_os2` varchar(255) DEFAULT NULL,
  `format_file_macula_os3` varchar(255) DEFAULT NULL,
  `format_file_macula_os3d1` varchar(255) DEFAULT NULL,
  `format_file_macula_os3d2` varchar(255) DEFAULT NULL,
  `format_file_macula_os3d3` varchar(255) DEFAULT NULL,
  `format_file_macula_os3d4` varchar(255) DEFAULT NULL,
  `format_file_macula_os4` varchar(255) DEFAULT NULL,
  `format_file_macula_ou` varchar(255) DEFAULT NULL,
  `format_file_sight_od` varchar(255) DEFAULT NULL,
  `format_file_sight_os` varchar(255) DEFAULT NULL,
  `format_file_vizus_od` varchar(255) DEFAULT NULL,
  `format_file_vizus_os` varchar(255) DEFAULT NULL,
  `fosfen_os` varchar(255) DEFAULT NULL,
  `gdx_od` longblob,
  `gdx_os` longblob,
  `hickness_of_cornea_od1` longblob,
  `hickness_of_cornea_od2` longblob,
  `hickness_of_cornea_od3` longblob,
  `hickness_of_cornea_od4` longblob,
  `hickness_of_cornea_os1` longblob,
  `hickness_of_cornea_os2` longblob,
  `hickness_of_cornea_os3` longblob,
  `hickness_of_cornea_os4` longblob,
  `hrt_od` longblob,
  `hrt_os` longblob,
  `hrt_ou` longblob,
  `humphrey_od` longblob,
  `humphrey_os` longblob,
  `macula_od1` longblob,
  `macula_od2` longblob,
  `macula_od3` longblob,
  `macula_od3d1` longblob,
  `macula_od3d2` longblob,
  `macula_od3d3` longblob,
  `macula_od3d4` longblob,
  `macula_od4` longblob,
  `macula_os1` longblob,
  `macula_os2` longblob,
  `macula_os3` longblob,
  `macula_os3d1` longblob,
  `macula_os3d2` longblob,
  `macula_os3d3` longblob,
  `macula_os3d4` longblob,
  `macula_os4` longblob,
  `macula_ou` longblob,
  `sight_od` longblob,
  `sight_os` longblob,
  `vizus_od` longblob,
  `vizus_os` longblob,
  `patient_id` int(11) NOT NULL,
  `worker_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`patient_id`,`worker_id`),
  KEY `fk_examination_patient1_idx` (`patient_id`),
  KEY `fk_examination_worker1_idx` (`worker_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examination`
--

LOCK TABLES `examination` WRITE;
/*!40000 ALTER TABLE `examination` DISABLE KEYS */;
/*!40000 ALTER TABLE `examination` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `additional_information` varchar(255) DEFAULT NULL,
  `apartment` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `house` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `oblast` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL,
  `settlement` varchar(255) DEFAULT NULL,
  `sex` int(11) NOT NULL,
  `street` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `worker_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`worker_id`),
  KEY `FKfc9fylnf33oa1a3c6wgrgqpw3` (`worker_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treatment`
--

DROP TABLE IF EXISTS `treatment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treatment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `application_of_laser_treatment` int(11) DEFAULT NULL,
  `application_of_laser_treatment_text` varchar(255) DEFAULT NULL,
  `bb_injection` int(11) DEFAULT NULL,
  `bb_injection_text` varchar(255) DEFAULT NULL,
  `beta_blockers` int(11) DEFAULT NULL,
  `beta_blockers_text` varchar(255) DEFAULT NULL,
  `bm_injection` int(11) DEFAULT NULL,
  `bm_injection_text` varchar(255) DEFAULT NULL,
  `cyclodegradation` int(11) DEFAULT NULL,
  `cyclodegradation_text` varchar(255) DEFAULT NULL,
  `date_of_treatment` date NOT NULL,
  `info_text_area` varchar(255) DEFAULT NULL,
  `iridectomy` int(11) DEFAULT NULL,
  `iridectomy_text` varchar(255) DEFAULT NULL,
  `myotics` int(11) DEFAULT NULL,
  `myotics_text` varchar(255) DEFAULT NULL,
  `oral_injections` int(11) DEFAULT NULL,
  `oral_injections_text` varchar(255) DEFAULT NULL,
  `pb_injection` int(11) DEFAULT NULL,
  `pb_injection_text` varchar(255) DEFAULT NULL,
  `physiotherapy` int(11) DEFAULT NULL,
  `physiotherapy_text` varchar(255) DEFAULT NULL,
  `prostaglandins` int(11) DEFAULT NULL,
  `prostaglandins_text` varchar(255) DEFAULT NULL,
  `rear_sclerectomy` int(11) DEFAULT NULL,
  `rear_sclerectomy_text` varchar(255) DEFAULT NULL,
  `sinusothrabuculotomy` int(11) DEFAULT NULL,
  `sinusothrabuculotomy_text` varchar(255) DEFAULT NULL,
  `sinusotrabuculotomy_with_basaliridectomy` int(11) DEFAULT NULL,
  `sinusotrabuculotomy_with_basaliridectomy_text` varchar(255) DEFAULT NULL,
  `trabeculotomy` int(11) DEFAULT NULL,
  `trabeculotomy_text` varchar(255) DEFAULT NULL,
  `examination_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`examination_id`),
  KEY `fk_treatment_examination1_idx` (`examination_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treatment`
--

LOCK TABLES `treatment` WRITE;
/*!40000 ALTER TABLE `treatment` DISABLE KEYS */;
/*!40000 ALTER TABLE `treatment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `worker`
--

DROP TABLE IF EXISTS `worker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `worker` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `institution` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `access_database_type` varchar(45) NOT NULL,
  `account_status` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idПрацівники_UNIQUE` (`id`),
  CONSTRAINT `fk_worker_patient1` FOREIGN KEY (`id`) REFERENCES `patient` (`worker_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `worker`
--

LOCK TABLES `worker` WRITE;
/*!40000 ALTER TABLE `worker` DISABLE KEYS */;
INSERT INTO `worker` VALUES (1,'admin admin admin','2000-01-01','admin','admin','+380000000000','admin@admin.com','5','2090-01-01','',''),(2,'Чумбей Назар Миколайович','1997-09-29','Лікарня № 3','Лікар','+380680073283','nazzichumbey@gmail.com','22','2019-10-27','',''),(3,'Миндюк Юлія Миколаївна','1993-11-11','Лікарня №3','Спеціаліст','+380966375130','yuliachumbei@i.ua','13','2019-11-17','',''),(4,'Григоришин Іван Андрійович','1987-08-16','Лікар №3','Додавання пацієнта','+380951354862','olegG12@ukr.net','4','2019-06-04','',''),(5,'Гринішак Софія Ярославівна','1972-06-16','Лікарня №3','Гол. лікар','+380671568432','sofiaGrinishak@gmail.com','5','2020-06-09','',''),(6,'Багдад Іран Алькаїда','1995-11-03','Лікарня №4','Лікар','+380648246852','sdfdsf@dfs.sdf','4','2020-11-03','',''),(7,'Дмитрук Інна Дмитрівна','1980-02-29','іваів','івавіа','+380680000000','dfsd@fd.sdf','2','2019-11-10','',''),(9,'Камінський Юрій Михайлович','1958-04-25','Окл','Обласний глаукоматолог','+380989252041','yurkamin@gmail.com','1','2035-11-10','','');
/*!40000 ALTER TABLE `worker` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-19 16:56:25

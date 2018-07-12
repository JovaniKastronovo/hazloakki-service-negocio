CREATE DATABASE `hazloakki` /*!40100 DEFAULT CHARACTER SET latin1 */;

use hazloakki;

CREATE TABLE `negocio` (
  `id` varchar(250) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `id_categoria` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `domicilio` varchar(45) DEFAULT NULL,
  `latitud` varchar(45) DEFAULT NULL,
  `longitud` varchar(45) DEFAULT NULL,
  `id_metodo_pago` varchar(45) DEFAULT NULL,
  `tarjeta_credito` varchar(45) DEFAULT NULL,
  `servicio_domicilio` varchar(45) DEFAULT NULL,
  `estacionamiento` varchar(45) DEFAULT NULL,
  `wifi` varchar(45) DEFAULT NULL,
  `reservaciones` varchar(45) DEFAULT NULL,
  `modo_llevar` varchar(45) DEFAULT NULL,
  `estatus` varchar(45) DEFAULT NULL,
  `internet` bit(1) NOT NULL,
  `version` bigint(20) DEFAULT NULL,
  `id_cuenta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

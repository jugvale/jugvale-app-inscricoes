/*
 * Script do banco de dados da aplicação de inscrições para eventos do JUG-Vale
 * 
 * Esse script pode estar incompleto e deverá ser feito e testado no código Java
 */

/*
 * Criação do banco de dados. 
 * */
CREATE database IF NOT EXISTS `jugvale_app_inscricoes` CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `jugvale_app_inscricoes`;

/*
 * Cria tabelas base
 * */
CREATE  TABLE IF NOT EXISTS `jugvale_app_inscricoes`.`tipo_evento` (
  `tpe_id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL ,
  `descricao` VARCHAR(200) NULL ,
  PRIMARY KEY (`tpe_id`) );
  
  
  
/*
 * Script do banco de dados da aplica��o de inscri��es para eventos do JUG-Vale
 * 
 * Esse script pode estar incompleto e dever� ser feito e testado no c�digo Java
 */

/*
 * Cria��o do banco de dados. 
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
  
  
  
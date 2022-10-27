/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  03969402000
 * Created: 06/10/2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento ;
USE estacionamento;

CREATE TABLE vaga (
idVaga int NOT NULL AUTO_INCREMENT,
numero int NOT NULL,
rua varchar(100) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga));


CREATE TABLE motorista ( 
idMotorista int NOT NULL AUTO_INCREMENT,
nome varchar (100) NOT NULL,
genero varchar (20) NOT NULL,
RG int NOT NULL, 
CPF int NOT NULL, 
celular int NOT NULL,
email varchar (50) NOT NULL,
senha varchar (10) NOT NULL, 
PRIMARY KEY (idMotorista));




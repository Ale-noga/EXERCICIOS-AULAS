CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE classe (
idclasse INT NOT NULL AUTO_INCREMENT UNIQUE,
posicao VARCHAR(45) NOT NULL,
titulo VARCHAR(45) NOT NULL,
requisito INT NOT NULL,
PRIMARY KEY (idclasse));

CREATE TABLE  personagem(
idpers INT NOT NULL AUTO_INCREMENT UNIQUE,
PRIMARY KEY (idpers),
fk_idclasse INT,
FOREIGN KEY (fk_idclasse) REFERENCES classe(idclasse),
nome VARCHAR(45) NOT NULL,
idade INT NOT NULL,
tipo VARCHAR(45) NOT NULL,
natureza VARCHAR(45) NOT NULL,
nivel INT NOT NULL,
atk INT NOT NULL,
def INT NOT NULL
)
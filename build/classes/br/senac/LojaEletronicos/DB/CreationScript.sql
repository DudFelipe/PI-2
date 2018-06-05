CREATE DATABASE Loja;
USE Loja;

CREATE TABLE Cliente (
    idCliente int not null auto_increment,
    nome varchar(256) not null,
    dataDeNascimento date,
    sexo varchar(10),
    CPF varchar(14) not null,
    RG varchar(14),
    estadoCivil varchar(20),
    endereco varchar(256),
    numero int,
    CEP varchar(10),
    bairro varchar(256),
    complemento varchar(20),
    cidade varchar(256),
    telefoneFixo varchar(20),
    celular varchar(20),
    email varchar(128),
    prefContato int,
    PRIMARY KEY (CodCliente)
);



/*INSERT INTO Departamento (CodDepto, DescDepto) VALUES (1, 'Financeiro');*/

CREATE DATABASE Loja;
USE Loja;

CREATE TABLE Cliente (
    idCliente int not null auto_increment,
    nome varchar(256) not null,
    dataDeNascimento date,
    sexo varchar(10),
    CPF varchar(14),
    
    PRIMARY KEY (CodCliente)
);



/*INSERT INTO Departamento (CodDepto, DescDepto) VALUES (1, 'Financeiro');*/

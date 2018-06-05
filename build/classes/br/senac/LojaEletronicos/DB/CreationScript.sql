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
    PRIMARY KEY (idCliente)
);

CREATE TABLE Produto (
    idProduto int not null auto_increment,
    nome varchar(128) not null,
    fabricante varchar(128),
    modelo varchar(128),
    preco float(12,2) not null,
    quantidade int not null default 0,
    dimensoes varchar(128),
    PRIMARY KEY (idProduto)
);

CREATE TABLE ItemDaVenda (
    idItemDaVenda int not null auto_increment,
    produto int not null,
    quantidade int not null default 1,
    PRIMARY KEY (idItemDaVenda)
    FOREIGN KEY (produto) REFERENCES Produto (idProduto)
);
/*INSERT INTO Departamento (CodDepto, DescDepto) VALUES (1, 'Financeiro');*/

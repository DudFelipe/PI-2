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
    enabled boolean,
    PRIMARY KEY (idCliente)
);

CREATE TABLE Produto (
    idProduto int not null auto_increment,
    nome varchar(128) not null,
    fabricante varchar(128),
    modelo varchar(128),
    preco float(12,2) not null,
    quantidade int not null default 0,
    codBarras long not null,
    dimensoes varchar(128),
    enabled boolean,
    PRIMARY KEY (idProduto)
);

CREATE TABLE Venda (
    numeroDoPedido int not null auto_increment,
    dataVenda date,
    idCliente int not null,
    valorTotal float(12,2) not null default 0.00,
    Primary Key (numeroDoPedido)
);

CREATE TABLE ItemDaVenda (
    idItemDaVenda int not null auto_increment,
    venda int not null,
    produto int not null,
    quantidade int not null default 1,
    PRIMARY KEY (idItemDaVenda),
    FOREIGN KEY (venda) REFERENCES Venda (numeroDoPedido),
    FOREIGN KEY (produto) REFERENCES Produto (idProduto)
);


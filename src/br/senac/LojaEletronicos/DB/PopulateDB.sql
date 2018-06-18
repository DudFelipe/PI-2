INSERT INTO Cliente (idCliente, nome, dataDeNascimento, sexo, CPF, RG, estadoCivil, endereco, 
    numero, CEP, bairro, complemento, cidade, telefoneFixo, celular, email, prefContato, enabled) 
	VALUES (1,"Robson Oliveira",str_to_date('1997-04-27','%Y-%m-%e'),"MASCULINO",222222222222,4123659,"SOLTEIRO(A)","Alameda Rodolfo Braga",22,13245678,"Vila Europa","A","SÃO PAULO",123456798,123465798,"robson97@mail.com",3,1);

INSERT INTO Cliente (idCliente, nome, dataDeNascimento, sexo, CPF, RG, estadoCivil, endereco, 
	numero, CEP, bairro, complemento, cidade, telefoneFixo, celular, email, prefContato, enabled) 
	VALUES (2,"Varlkiria Arantes",str_to_date('1972-12-22','%Y-%m-%e'),"FEMININO",333333333333,1234567,"CASADO(A)","Rua Conselheiro Arruda",55,46578944,"Raia","","RIO DE JANEIRO",46789123,465798132,"val@correo.com",2,1
);

INSERT INTO Produto (idProduto, nome, fabricante, modelo, preco, quantidade, codBarras, dimensoes, enabled)
	VALUES (1,"TV 29p","Zensan","Rara",12.50,12,"134567823","12A12L2P",1);
    
INSERT INTO Produto (idProduto, nome, fabricante, modelo, preco, quantidade, codBarras, dimensoes, enabled)
	VALUES (2,"Radiorelogio","Sonio","Joy",1.50,18,"13546543","1A1L2P",1);
    
INSERT INTO Produto (idProduto, nome, fabricante, modelo, preco, quantidade, codBarras, dimensoes, enabled)
	VALUES (3,"Celular","Motoca","R15",1222.59,26,"134946123","0.2A1.2L0.2P",1);
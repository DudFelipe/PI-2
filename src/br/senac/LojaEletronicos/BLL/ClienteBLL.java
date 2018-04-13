
package br.senac.LojaEletronicos.BLL;

import br.senac.LojaEletronicos.Modelos.Cliente;

public class ClienteBLL {
    public String validaCliente(Cliente c){
        if(c.getNome().trim().length() == 0){
            return "O campo NOME é um campo obrigatório!";
        }
        
        if(c.getDataNascimento().trim().length() == 0){
            return "O campo DATA DE NASCIMENTO é um campo obrigatório!";
        }
        
        if(c.getSexo().trim().length() == 0){
            return "O campo SEXO é um campo obrigatório!";
        }
        
        if(c.getCPF().trim().length() == 0){
            return "O campo CPF é um campo obrigatório!";
        }
        
        if(c.getRG().trim().length() == 0){
            return "O campo RG é um campo obrigatório!";
        }
        
        if(c.getEstadoCivil().trim().length() == 0){
            return "O campo ESTADO CIVIL é um campo obrigatório!";
        }
        
        if(c.getTelefoneFixo().trim().length() == 0 && c.getCelular().trim().length() == 0){
            return "Você deve preencher pelo menos um dos campos TELEFONE FIXO e CELULAR!";
        }
     
        if(c.getEmail().trim().length() == 0){
            return "O campo EMAIL é um campo obrigatório!";
        } 
        
        if(c.getPrefContato() == -1){
            return "Você deve selecionar uma preferência de contato!";
        }
        
        return null;
    }
}

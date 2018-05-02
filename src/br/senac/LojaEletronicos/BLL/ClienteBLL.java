
package br.senac.LojaEletronicos.BLL;

import br.senac.LojaEletronicos.Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteBLL {
    public static List<String> validaCliente(Cliente c){
        
        List<String> erros = new ArrayList<String>();
        
        if(c.getNome().trim().length() == 0){
            //return "O campo NOME é um campo obrigatório!";
            erros.add("O campo NOME é um campo obrigatório!");
        }
        /*if(c.getDataNascimento() == null){
            //return "O campo DATA DE NASCIMENTO é um campo obrigatório!";
            erros.add("\nO campo DATA DE NASCIMENTO é um campo obrigatório!\n");
        }*/
        
        if(c.getSexo().equals("SELECIONE...")){
            //return "O campo SEXO é um campo obrigatório!";
            erros.add("\nO campo SEXO é um campo obrigatório!");
        }
        
        if(c.getCPF().trim().length() == 0){
            //return "O campo CPF é um campo obrigatório!";
            erros.add("\nO campo CPF é um campo obrigatório!");
        }
        
        if(c.getRG().trim().length() == 0){
            //return "O campo RG é um campo obrigatório!";
            erros.add("\nO campo RG é um campo obrigatório!");
        }
        
        if(c.getEstadoCivil().equals("SELECIONE...")){
            //return "O campo ESTADO CIVIL é um campo obrigatório!";
            erros.add("\nO campo ESTADO CIVIL é um campo obrigatório!");
        }
        
        if(c.getEndereco().trim().length() == 0){
            //return "O campo ENDEREÇO é um campo obrigatório!";
            erros.add("\nO campo ENDEREÇO é um campo obrigatório!");
        }
        
        if(c.getNumero() <= 0){
            //return "O número digitado é inválido";
            erros.add("\nO número digitado é inválido!");
        }
        
        if(c.getCEP().trim().length() == 0){
            //return "O campo CEP é um campo obrigatório!";
            erros.add("\nO campo CEP é um campo obrigatório!");
        }
        
        if(c.getBairro().trim().length() == 0){
            //return "O campo BAIRRO é um campo obrigatório!";
            erros.add("\nO campo BAIRRO é um campo obrigatório!");
        }
        
        if(c.getBairro().trim().length() == 0){
            //return "O campo BAIRRO é um campo obrigatório!";
            erros.add("\nO campo BAIRRO é um campo obrigatório!");
        }
        if(c.getCidade().equals("SELECIONE...")){
            //return "O campo CIDADE é um campo obrigatório!";
            erros.add("\nO campo CIDADE é um campo obrigatório!");
        }
        
        if(c.getTelefoneFixo().trim().length() == 0 && c.getCelular().trim().length() == 0){
            //return "Você deve preencher pelo menos um dos campos TELEFONE FIXO e CELULAR!";
            erros.add("\nVocê deve preencher pelo menos um dos campos TELEFONE FIXO e CELULAR!");
        }
     
        if(c.getEmail().trim().length() == 0){
            //return "O campo EMAIL é um campo obrigatório!";
            erros.add("\nO campo EMAIL é um campo obrigatório");
        }

        if(!c.getEmail().contains("@")){
            //return "O email digitado não é válido!";
            erros.add("\nO email digitado não é válido!");
        }
        
        if(c.getPrefContato() == -1){
            //return "Você deve selecionar uma preferência de contato!";
            erros.add("\nVocê deve selecionar uma preferência de contato!");
        }
        
        if(c.getTelefoneFixo().length() > 0 && c.getPrefContato() != 1){
            erros.add("\nO campo CELULAR não foi preenchido!");
        }
        
        if(c.getCelular().length() > 0 && c.getPrefContato() != 2){
            erros.add("\nO campo TELEFONE FIXO não foi preenchido!");
        }
        
        return erros;
    }
}

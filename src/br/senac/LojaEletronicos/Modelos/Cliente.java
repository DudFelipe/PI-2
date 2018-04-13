
package br.senac.LojaEletronicos.Modelos;

import java.util.Date;

public class Cliente {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String CPF;
    private String RG;
    private String estadoCivil;
    private String telefoneFixo;
    private String celular;
    private String email;
    private int prefContato;

    public Cliente(){
        nome = "";
        dataNascimento = "";
        sexo = "";
        CPF = "";
        RG = "";
        estadoCivil = "";
        telefoneFixo = "";
        celular = "";
        email = "";
        prefContato = -1;
    }
    
    public void mostraCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Telefone fixo: " + telefoneFixo);
        System.out.println("Celular: " + celular);
        System.out.println("Email: " + email);
        System.out.println("Preferência de contato: " + prefContato);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrefContato() {
        return prefContato;
    }

    public void setPrefContato(int prefContato) {
        this.prefContato = prefContato;
    }
}

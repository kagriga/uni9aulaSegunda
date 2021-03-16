
package br.uninove;


public class Pessoa {
    //Atributos da classe
    
    private String nome;
    private String cpf;
    private int idade;
    
    // Construtores
    // Assinatura; Pessoa(String String Int)
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    //Contrutor padrão "é necessário forçar"
    public Pessoa() { 
    
    };
    //modificadores de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}

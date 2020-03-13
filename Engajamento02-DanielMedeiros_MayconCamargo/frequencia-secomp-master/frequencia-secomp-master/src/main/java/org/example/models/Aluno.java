package org.example.models;

//Esta classe não será necessário utilizar, pois dentro da classe App.java a implementação fica mais eficaz e legível
public class Aluno {
    private String nome;
    private String ra;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}

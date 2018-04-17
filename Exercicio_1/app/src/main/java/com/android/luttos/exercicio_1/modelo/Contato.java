package com.android.luttos.exercicio_1.modelo;

/**
 * Created by Luttos on 16/04/18.
 */

public class Contato {
    private String Nome;
    private int Telefone;
    private String Email;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Contato(){}

    public Contato(String Nome, int Telefone){
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    public Contato(String Nome, int Telefone, String Email){
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    public Contato(String Nome, String Email){
        this.Nome = Nome;
        this.Email = Email;
    }
}

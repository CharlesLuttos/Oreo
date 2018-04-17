package com.android.luttos.exercicioactivityintent;

/**
 * Created by Luttos on 15/04/18.
 */

public class Student {
    private int matricula;
    private String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Student(){}

    public Student(int matricula){
        this.matricula = matricula;
    }

    public Student(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
}

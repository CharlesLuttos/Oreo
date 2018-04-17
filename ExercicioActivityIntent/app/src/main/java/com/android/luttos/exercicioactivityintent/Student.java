package com.android.luttos.exercicioactivityintent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Luttos on 15/04/18.
 */

public class Student implements Parcelable{
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

    private Student(Parcel from){
        matricula = from.readInt();
        nome = from.readString();
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>(){
        public Student createFromParcel(Parcel in){
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Student(){}

    public Student(int matricula){
        this.matricula = matricula;
    }

    public Student(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(matricula);
        dest.writeString(nome);
    }
}

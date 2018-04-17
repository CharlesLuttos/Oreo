package com.android.luttos.exercicioactivityintent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
    EditText txtMatricula;
    EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtNome = findViewById(R.id.txtNome);
        txtMatricula = findViewById(R.id.txtMatricula);
    }

    public void cadastroAluno(View view){
        Intent returnIntent = new Intent(this, MainActivity.class);
        int matricula = Integer.parseInt(txtMatricula.getText().toString());
        String nome = txtNome.getText().toString();
        Student student = new Student(matricula, nome);
        returnIntent.putExtra("Aluno", student);
        setResult(1, returnIntent);
        finish();
    }
}

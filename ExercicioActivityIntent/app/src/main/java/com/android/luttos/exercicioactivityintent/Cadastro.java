package com.android.luttos.exercicioactivityintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
    EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtNome = findViewById(R.id.txtNome);
    }

    public void cadastroAluno(View view){
        Intent returnIntent = new Intent(this, MainActivity.class);
        returnIntent.putExtra("Aluno", txtNome.getText().toString());
        setResult(1, returnIntent);
        finish();
    }
}

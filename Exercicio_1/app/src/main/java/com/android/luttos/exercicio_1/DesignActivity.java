package com.android.luttos.exercicio_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.luttos.exercicio_1.adapter.AgendaEmailAdapter;
import com.android.luttos.exercicio_1.adapter.AgendaTelefoneAdapter;
import com.android.luttos.exercicio_1.modelo.Contato;

import java.util.ArrayList;
import java.util.List;

public class DesignActivity extends AppCompatActivity {
    List<Contato> contatos;
    AgendaTelefoneAdapter agendaTelefoneAdapter;
    AgendaEmailAdapter agendaEmailAdapter;
    ListView listViewAgendaTelefone;
    ListView listViewAgendaEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_activity);

        carregaListaContatos();
        carregaAgendaTelefone();
        carregaAgendaEmail();
    }

    void carregaListaContatos(){
        contatos = new ArrayList<Contato>();
        contatos.add(new Contato("Andrea", 222222, "Andrea@gmail.com"));
        contatos.add(new Contato("Macia", 333333, "Macia@gmail.com"));
    }

    void carregaAgendaTelefone(){
        listViewAgendaTelefone = findViewById(R.id.listaAgendaTelefone);
        listViewAgendaTelefone.setEmptyView(findViewById(android.R.id.empty));
        agendaTelefoneAdapter = new AgendaTelefoneAdapter(this, contatos);
        listViewAgendaTelefone.setAdapter(agendaTelefoneAdapter);
    }

    void carregaAgendaEmail(){
        listViewAgendaEmail = findViewById(R.id.listaAgendaEmail);
        listViewAgendaEmail.setEmptyView(findViewById(android.R.id.empty));
        agendaEmailAdapter = new AgendaEmailAdapter(this, contatos);
        listViewAgendaEmail.setAdapter(agendaEmailAdapter);
    }
}

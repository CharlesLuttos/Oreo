package com.android.luttos.exercicioactivityintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> studentList;
    StudentAdapter studentAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        carregaLista();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 *      .setAction("Action", null).show();
                 */
                Intent telaCadastroIntent = new Intent(MainActivity.this, Cadastro.class);
                startActivityForResult(telaCadastroIntent, 1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void carregaLista(){
        listView = findViewById(R.id.listaAlunos);
        listView.setEmptyView(findViewById(android.R.id.empty));
        studentList = new ArrayList<Student>();
        studentList.add(new Student(234, "Andre"));
        studentList.add(new Student(235, "Junior"));
        studentAdapter = new StudentAdapter(this, studentList);
        listView.setAdapter(studentAdapter);
        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        if (view.getId() == R.id.listaAlunos){
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu_aluno, menu);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Student aluno = data.getParcelableExtra("Aluno");
        studentList.add(aluno);
        Toast.makeText(getApplicationContext(), aluno.getNome()+" Adicionado", Toast.LENGTH_SHORT).show();
        studentAdapter.notifyDataSetChanged();

    }
}

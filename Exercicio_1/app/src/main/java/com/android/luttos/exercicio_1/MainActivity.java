package com.android.luttos.exercicio_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.android.luttos.exercicio_1.adapter.AgendaEmailAdapter;
import com.android.luttos.exercicio_1.adapter.AgendaTelefoneAdapter;
import com.android.luttos.exercicio_1.modelo.Contato;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botaoLinear = findViewById(R.id.buttonLinear);
        Button botaoGrid = findViewById(R.id.buttonGrid);
        Button botaoTable = findViewById(R.id.buttonTable);
        Button botaoCard = findViewById(R.id.buttonCard);
        Button botaoRelative = findViewById(R.id.buttonRelative);
        Button botaoScroll = findViewById(R.id.buttonScroll);
        Button botaoDesign = findViewById(R.id.buttonDesign);

        View.OnClickListener linearActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearActivity = new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(linearActivity);
            }
        };

        View.OnClickListener gridActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gridActivity = new Intent(getApplicationContext(), GridActivity.class);
                startActivity(gridActivity);
            }
        };

        View.OnClickListener tableActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tableActivity = new Intent(getApplicationContext(), TableActivity.class);
                startActivity(tableActivity);
            }
        };

        View.OnClickListener cardActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardActivity = new Intent(getApplicationContext(), CardActivity.class);
                startActivity(cardActivity);
            }
        };

        View.OnClickListener relativeActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativeActivity = new Intent(getApplicationContext(), RelativeActivity.class);
                startActivity(relativeActivity);
            }
        };

        View.OnClickListener scrollActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scrollActivity = new Intent(getApplicationContext(), ScrollActivity.class);
                startActivity(scrollActivity);
            }
        };

        View.OnClickListener designActivity = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent designActivity = new Intent(getApplicationContext(), DesignActivity.class);
                startActivity(designActivity);
            }
        };

        botaoLinear.setOnClickListener(linearActivity);
        botaoGrid.setOnClickListener(gridActivity);
        botaoTable.setOnClickListener(tableActivity);
        botaoCard.setOnClickListener(cardActivity);
        botaoRelative.setOnClickListener(relativeActivity);
        botaoScroll.setOnClickListener(scrollActivity);
        botaoDesign.setOnClickListener(designActivity);
    }
}

package com.example.parcial1grupo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,semana1.class);
                startActivity(Intent);
            }
        });

        //Boton semana 2
        Button btSemana2 = findViewById(R.id.btn2);
        btSemana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSemana2 = new Intent(MainActivity.this, Principal.class);
                startActivity(irSemana2);

            }
        });

        //Boton semana 3
        Button btSemana3;
        btSemana3 = findViewById(R.id.bt_semana3);
        btSemana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSemana3 = new Intent(MainActivity.this, Activity_tabs.class);
                startActivity(irSemana3);
            }
        });

        //Boton semana 4
        Button btSemana4 = findViewById(R.id.bt_semana4);
        btSemana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSemana4 = new Intent(MainActivity.this, SensorProximidad.class);
                startActivity(irSemana4);
            }
        });

        //Boton semana 5
        Button btSemana5 = this.findViewById(R.id.bt_semana5);
        btSemana5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSemana5 = new Intent(MainActivity.this, Rep_de_musica.class);
                startActivity(irSemana5);
            }
        });

        //Boton Acerca de
        Button btAcercade = this.findViewById(R.id.bt_acerca_de);
        btAcercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irAcercade = new Intent(MainActivity.this, Acercade.class);
                startActivity(irAcercade);
            }
        });
    }
}
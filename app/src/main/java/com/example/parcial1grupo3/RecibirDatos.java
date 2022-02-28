package com.example.parcial1grupo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecibirDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        Integer estado;

        TextView Nombre = (TextView)this.findViewById(R.id.tvNombreReci);
        TextView Edad = (TextView)this.findViewById(R.id.tvEdadReci);
        TextView Estado = (TextView)this.findViewById(R.id.tvEstado);
        Button bVolver = (Button)this.findViewById(R.id.btVolver);
        Button bInicio = (Button)this.findViewById(R.id.btInicio);

        Bundle DatosRecibidos = this.getIntent().getExtras();
        String nombre = DatosRecibidos.getString("pNombre");
        String edad = DatosRecibidos.getString("pEdad");

        Nombre.setText("Tu nombre es: " +nombre);
        Edad.setText("Tu edad es: " +edad);

        estado = Integer.parseInt(edad);
        if(estado >= 18){
            Estado.setText("Eres mayor de edad");

        }else {
            Estado.setText("Eres menor de edad");
        }

        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(RecibirDatos.this,EnviarDatos.class);
                startActivity(volver);
            }
        });

        bInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Inicio = new Intent(RecibirDatos.this,Principal.class);
                startActivity(Inicio);
            }
        });

    }

}
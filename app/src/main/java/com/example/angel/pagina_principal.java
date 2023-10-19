package com.example.angel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class pagina_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        ImageView botonCambiarActividad = findViewById(R.id.logoIni);

        botonCambiarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear una intención para cambiar a la ActividadB
                Intent intent = new Intent(pagina_principal.this, metodo_inicio.class);

                // Iniciar la nueva actividad
                startActivity(intent);
            }
        });




    }



}
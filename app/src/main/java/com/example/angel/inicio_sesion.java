package com.example.angel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class inicio_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        ImageView atras = findViewById(R.id.atras);


        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inicio_sesion.this,metodo_inicio.class);
                startActivity(intent);
            }
        });


    }

    public void btnLogin(View v){
        Intent intent = new Intent(this, pagina_cursos.class);
        startActivity(intent);
    }
}
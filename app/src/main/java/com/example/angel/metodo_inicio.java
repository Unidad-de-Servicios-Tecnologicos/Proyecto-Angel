package com.example.angel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class metodo_inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_inicio);

    }

    public void crearC(View v){
        Intent intent = new Intent(this, registro.class);
        startActivity(intent);
    }

    public void iniciarS(View v){
        Intent intent = new Intent(this, inicio_sesion.class);
        startActivity(intent);
    }

}

package com.example.yoso.puppy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obteniendo una instancia del boton Ver mi mascota
        btn = (Button) findViewById(R.id.btn);

        // Escucha sobre la actividad Main
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Creando nuevo intent
        Intent intent = new Intent(this, Mascota.class);

        // Comenzar la actividad
        startActivity(intent);


    }
}

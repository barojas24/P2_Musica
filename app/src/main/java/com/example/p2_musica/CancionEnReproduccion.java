package com.example.p2_musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancionEnReproduccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancion_en_reproduccion);
        Button btnregresar=(Button) findViewById(R.id.btnRegresar);
        assert btnregresar!=null;
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    public void abrirColaRepro(View view) {
        Intent i=new Intent(this,ActivityColaReproduccion.class);
        startActivity(i);
    }
}

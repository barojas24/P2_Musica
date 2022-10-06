package com.example.p2_musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ActivityTemporizador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporizador);
    }

    public void cancelarTemporizador(View view) {
        finish();
    }
}

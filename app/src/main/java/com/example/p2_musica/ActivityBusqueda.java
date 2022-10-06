package com.example.p2_musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityBusqueda extends AppCompatActivity implements View.OnClickListener {

private EditText editTextBusqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        editTextBusqueda=(EditText) findViewById(R.id.editTextBuscar);
        editTextBusqueda.setOnClickListener(this);

    }

    public void terminarAct(View view) {
        finish();
    }

    public void onClick(View v) {
        editTextBusqueda.setText("");
    }
}

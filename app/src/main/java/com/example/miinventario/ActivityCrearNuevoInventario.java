package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityCrearNuevoInventario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_nuevo_inventario);
    }

    public void onClickCrearInventario(View view) {
        Intent i = new Intent(ActivityCrearNuevoInventario.this,ActivityVistaInventario.class);
        startActivity(i);
    }
}
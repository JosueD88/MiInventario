package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityVistaInventario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_inventario);
    }

    public void onClickCrearProducto(View view) {
        Intent i = new Intent(ActivityVistaInventario.this,ActivityCrearProducto.class);
        startActivity(i);
    }
}
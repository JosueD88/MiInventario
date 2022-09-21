package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MenuSeleccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seleccion);
    }

    public void onClickVolver(View view) {
        Intent i = new Intent(MenuSeleccionActivity.this,MainActivity.class);
        startActivity(i);
    }

    public void onClickCrearInventario(View view) {
        Intent i = new Intent(MenuSeleccionActivity.this,ActivityCrearNuevoInventario.class);
        startActivity(i);
    }

    public void onClickVerInventarios(View view) {
        Intent i = new Intent(MenuSeleccionActivity.this,ListadoInventarios.class);
        startActivity(i);
    }
}
package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityCrearProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_producto);
    }

    public void onClickInfoProducto(View view) {
        Intent i = new Intent(ActivityCrearProducto.this,ActivityInformacionProducto.class);
        startActivity(i);
    }

}
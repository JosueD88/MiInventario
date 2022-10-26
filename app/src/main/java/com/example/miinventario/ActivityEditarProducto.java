package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityEditarProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_producto);
    }

    public void onClickInfoProducto(View view) {
        Intent i = new Intent(ActivityEditarProducto.this,ActivityInformacionProducto.class);
        startActivity(i);
    }

}
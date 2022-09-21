package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityInformacionProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_producto);
    }

    public void onClickVolver(View view) {
        Intent i = new Intent(ActivityInformacionProducto.this,ActivityVistaInventario.class);
        startActivity(i);
    }

}
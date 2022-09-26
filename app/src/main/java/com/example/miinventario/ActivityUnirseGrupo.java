package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityUnirseGrupo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unirse_grupo);
    }

    public void onClickVolver(View view) {
        Intent i = new Intent(ActivityUnirseGrupo.this,MenuSeleccionActivity.class);
        startActivity(i);
    }
}
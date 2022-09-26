package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListadoInventarios extends AppCompatActivity {

    ArrayList<InventariosVO> listaInventarios;
    RecyclerView recyclerViewInventarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_inventarios);

        listaInventarios=new ArrayList<>();
        recyclerViewInventarios= findViewById(R.id.recyclerId);
        recyclerViewInventarios.setLayoutManager(new LinearLayoutManager(this));

        llenarInventarios();
        AdapterListInventario adapter= new AdapterListInventario(listaInventarios);
        recyclerViewInventarios.setAdapter(adapter);
    }

    public void onClickInventario(View view) {
        Intent i = new Intent(ListadoInventarios.this,ActivityVistaInventario.class);
        startActivity(i);
    }



    private void llenarInventarios() {

        listaInventarios.add(new InventariosVO("El inventario 1","5","Propietario","05/10/2022"));
        listaInventarios.add(new InventariosVO("El inventario 2","3","Propietario","05/10/2022"));

    }
}
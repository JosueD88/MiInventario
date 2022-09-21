package com.example.miinventario;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterListInventario extends RecyclerView.Adapter<AdapterListInventario.ViewHolderInventario>{

    ArrayList<InventariosVO> listaInventarios;

    public AdapterListInventario(ArrayList<InventariosVO> listaInventarios) {
        this.listaInventarios = listaInventarios;
    }

    @NonNull
    @Override
    public AdapterListInventario.ViewHolderInventario onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
        //Me falta esto
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListInventario.ViewHolderInventario holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
        //Me falta esto
    }

    public class ViewHolderInventario extends RecyclerView.ViewHolder {

        TextView itemNombre,itemCantidad_Integrantes, itemRol, itemFecha_Creacion;

        public ViewHolderInventario(@NonNull View itemView) {
            super(itemView);
            itemNombre= (TextView)  itemView.findViewById(R.id.textNombreInventario);
            itemCantidad_Integrantes= (TextView)  itemView.findViewById(R.id.textIntegrantes);
            itemRol= (TextView)  itemView.findViewById(R.id.textRol);
            itemFecha_Creacion= (TextView)  itemView.findViewById(R.id.textFecha);

        }
    }
}

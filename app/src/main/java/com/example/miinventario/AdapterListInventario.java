package com.example.miinventario;

import android.view.LayoutInflater;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_inventarios,null,false);
        return new ViewHolderInventario(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListInventario.ViewHolderInventario holder, int position) {

        holder.itemNombre.setText(listaInventarios.get(position).getNombre());
        holder.itemCantidad_Integrantes.setText(listaInventarios.get(position).getCantidad_integrantes());
        holder.itemRol.setText(listaInventarios.get(position).getRol());
        holder.itemFecha_Creacion.setText(listaInventarios.get(position).getFecha_creacion());

    }

    @Override
    public int getItemCount() {
        return listaInventarios.size();
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

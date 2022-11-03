package com.example.miinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.miinventario.database.DatabaseQueryClass;
import com.example.miinventario.models.Productos;

public class ActivityCrearProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_producto);


        editTextNombre = this.findViewById(R.id.editTextNombre);
        editTextDescripcion = this.findViewById(R.id.editTextDescripcion);
        editTextStock = this.findViewById(R.id.editTextStock);
        btCrear = this.findViewById(R.id.btCrear);

    }

    public void onClickInfoProducto(View view) {
        //Intent i = new Intent(ActivityCrearProducto.this, ActivityInformacionProducto.class);
        //startActivity(i);

        nombreString = editTextNombre.getText().toString();
        descripcionString = editTextDescripcion.getText().toString();
        registrationStock = Integer.parseInt(editTextStock.getText().toString());

        Productos productos = new Productos(-1, nombreString, descripcionString, registrationStock);

        //creo el objeto de la consulta
        DatabaseQueryClass databaseQueryClass = new DatabaseQueryClass(this);

        //Inserto el objeto
        long id = databaseQueryClass.insertProductos(productos);

    /*    if(id>0) {
            student.setId(id);
            studentCreateListener.onStudentCreated(student);
            getDialog().dismiss();
        }

     */
        Toast.makeText(this, "Producto created successfully", Toast.LENGTH_LONG).show();

    }

    private static ActivityCrearProducto activityCrearProducto;

    private EditText editTextNombre;
    private EditText editTextDescripcion;
    private EditText editTextStock;
    private Button btCrear;

    private String nombreString = "";
    private String descripcionString = "";
    private int registrationStock = -1;

    public ActivityCrearProducto() {

    }

    public void onClick(View view) {
        nombreString = editTextNombre.getText().toString();
        descripcionString = editTextDescripcion.getText().toString();
        registrationStock = Integer.parseInt(editTextStock.getText().toString());

        Productos productos = new Productos(-1, nombreString, descripcionString, registrationStock);

    //creo el objeto de la consulta
        DatabaseQueryClass databaseQueryClass = new DatabaseQueryClass(this);

        //Inserto el objeto
        long id = databaseQueryClass.insertProductos(productos);

    /*    if(id>0) {
            student.setId(id);
            studentCreateListener.onStudentCreated(student);
            getDialog().dismiss();
        }

     */
            Toast.makeText(this, "Producto created successfully", Toast.LENGTH_LONG).show();


            //Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();



    }




}
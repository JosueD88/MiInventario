package com.example.miinventario.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

import com.example.miinventario.models.Productos;
import com.example.miinventario.util.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseQueryClass {

    private Context context;

    public DatabaseQueryClass(Context context) {
        this.context = context;

    }


    public long insertProductos(Productos productos) {

        long id = -1;
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        //valores de contenido
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.COLUMN_PRODUCTO_ID, productos.getId());
        contentValues.put(Constants.COLUMN_PRODUCTOS_NOMBRE, productos.getNombre());
        contentValues.put(Constants.COLUMN_PRODUCTOS_STOCK, productos.getStock());
        contentValues.put(Constants.COLUMN_PRODUCTOS_DESCRIPCION, productos.getDescripcion());


        try {
            //decirle a la BD que le añada los datos
            id = sqLiteDatabase.insertOrThrow(Constants.TABLE_PRODUCTOS, null, contentValues);
        } catch (SQLiteException e) {

            Toast.makeText(context, "Operation failed: " + e.getMessage(), Toast.LENGTH_LONG).show();
        } finally {
            sqLiteDatabase.close();
        }

        return id;
    }

    //listado
    public List<Productos> obtenerProductos() {
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

        Cursor cursor = null;

        try {
            cursor = sqLiteDatabase.query(Constants.TABLE_PRODUCTOS, null, null, null, null, null, null, null);
        if(cursor!=null){
            if ((cursor.moveToFirst()){
                List<Productos> ListaObtenida =new ArrayList<>();
                do{
                    Productos productoObtenido = new Productos();
                    //  int id=cursor.getInt(cursor.getColumnIndex(Constants.COLUMN_PRODUCTO_ID));
                    String nombre=cursor.getString(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_NOMBRE));
                    String descripcion=cursor.getString(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_DESCRIPCION));
                    int stock=cursor.getInt(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_STOCK));
                    productoObtenido.setNombre(nombre);
                    productoObtenido.setDescripcion(descripcion);
                    productoObtenido.setStock(stock);

                    ListaObtenida.add(productoObtenido);

                }while(cursor.moveToNext());
                return ListaObtenida;
            }

        }

        }catch (SQLiteException e){
            Toast.makeText(context, "error al listar:" + e.getMessage(), Toast.LENGTH_SHORT).show();

        } finally {
            sqLiteDatabase.close();
        }
        return new ArrayList<Productos>();

    }


    //-----------------------------------------------------------


    public  Productos obtenerProducto(String producto){
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();
        List<Productos> ListaObtenida = new ArrayList<>();

        Cursor cursor = null;

        try {
            cursor = sqLiteDatabase.query(Constants.TABLE_PRODUCTOS, null, Constants.COLUMN_PRODUCTO_ID + " = ? "
                    new String[]{String.valueOf(producto)}, null, null, null, null, null);

            Productos productoObtenido = new Productos();

                if (cursor != null && cursor.moveToFirst()){
                    //int id = cursor.getInt(cursor.getColumnIndex(Constants.COLUMN_PRODUCTO_ID));
                    String nombreP = cursor.getString(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_NOMBRE));
                    String descripcionP = cursor.getString(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_DESCRIPCION));
                    int stockP = cursor.getInt(cursor.getColumnIndex(Constants.COLUMN_PRODUCTOS_STOCK));
                    productoObtenido.setNombre(nombreP);
                    productoObtenido.setDescripcion(descripcionP);
                    productoObtenido.setStock(stockP);

                    ListaObtenida.add(productoObtenido);

                }
                    return ListaObtenida;


            }

        }catch (SQLiteException e){
            Toast.makeText(context, "error al listar:" + e.getMessage(), Toast.LENGTH_SHORT).show();

        } finally {
            sqLiteDatabase.close();
        }
    }
}


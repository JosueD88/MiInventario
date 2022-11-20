package com.example.miinventario.database;


import static com.example.miinventario.util.Constants.*;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.miinventario.util.MyApp;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "productos-db";
    private static final int DATABASE_VERSION = 8;

    private static DatabaseHelper databaseHelper;

    private DatabaseHelper() {
        super(MyApp.context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //Constructor
    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }
    public static synchronized DatabaseHelper getInstance(Context context){
        if(databaseHelper==null){
            databaseHelper = new DatabaseHelper(context);
        }
        return databaseHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


            String CREATE_PRODUCTOS_TABLE = "CREATE TABLE " + TABLE_PRODUCTOS + "("
                    + COLUMN_PRODUCTO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COLUMN_PRODUCTOS_NOMBRE + " TEXT NOT NULL, "
                    + COLUMN_PRODUCTOS_DESCRIPCION + " TEXT, " //nullable
                    + COLUMN_PRODUCTOS_STOCK + " INTEGER NOT NULL, "
                    + COLUMN_PRODUCTO_MODIFICACION + " TEXT " //nullable
                    + ")";

            sqLiteDatabase.execSQL(CREATE_PRODUCTOS_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            // Drop older table if existed
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTOS);


            // Create tables again
            onCreate(sqLiteDatabase);
        }

        @Override
        public void onOpen(SQLiteDatabase db) {
            super.onOpen(db);

            //enable foreign key constraints like ON UPDATE CASCADE, ON DELETE CASCADE
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
}

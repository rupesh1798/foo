package com.example.aadi.myapplication.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.aadi.myapplication.provider.DataContract.DataEntry;

/**
 * Created by aadi on 12/8/17.
 */

public class DataDbHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "data.db";

    public DataDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_TABLE = "CREATE TABLE " + DataEntry.TABLE_NAME + "( "
                + DataEntry._ID + "INTEGER PRIMARY KEY AUTO INCREMENT, "
                + DataEntry.COLOUMN_DATA_NAME + "TEXT NOT NULL, "
                + "UNIQUE (" + DataEntry.COLOUMN_DATA_NAME + ") ON CONFLICT REPLACE" +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

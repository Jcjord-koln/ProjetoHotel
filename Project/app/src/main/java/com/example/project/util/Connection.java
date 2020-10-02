package com.example.project.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Connection extends SQLiteOpenHelper {
    private static final String NAME = "htl.db";
    private static final Integer VERSION = 1;

    public Connection(Context context){
        super(context,NAME, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Person(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "email VARCHAR(50), user VARCHAR(50), password VARCHAR(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS Person";

        db.execSQL(sql);

        onCreate(db);
    }
}

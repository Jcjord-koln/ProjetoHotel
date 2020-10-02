package com.example.project.PersonDAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.project.model.Person;
import com.example.project.util.Connection;

public class PersonDAO {
    public Connection connection;
    public SQLiteDatabase db;

    public PersonDAO(Context context){
        connection = new Connection(context);
        db  = connection.getWritableDatabase();

    }

    public long insert(Person p){
        ContentValues values = new ContentValues();

        values.put("email",p.getEmail());
        values.put("user",p.getUser());
        values.put("password",p.getPassword());

        return(db.insert("Person",null,values));

    }


}

package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

public class PetDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "shelter.db";
    private static final int DB_VERSION = 1;

    public PetDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + "("
                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetEntry.COLUMNS_PET_NAME + " TEXT NOT NULL, "
                + PetEntry.COLUMNS_PET_BREED + " TEXT, "
                + PetEntry.COLUMNS_PET_GENDER + " INTEGER NOT NULL, "
                + PetEntry.COLUMNS_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

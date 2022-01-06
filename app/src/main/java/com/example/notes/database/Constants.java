package com.example.notes.database;

public class Constants {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "NoteApp.db";

    public static final String TABLE_NAME = "main_note_rv";
    public static final String _ID = "_id";
    public static final String TITLE = "name_note";

    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
            _ID + " INTEGER PRIMARY KEY," +
            TITLE + " TEXT)";

    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;




}

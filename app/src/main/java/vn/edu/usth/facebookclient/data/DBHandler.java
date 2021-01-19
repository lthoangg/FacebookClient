package vn.edu.usth.facebookclient.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {
    // information of databasae
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "PostDB.db";
    private static final String TABLE_NAME = "Post";
    private static final String COLUMN_ID = "PostID";
    private static final String COLUMN_CAPTION = "PostCaption";

    public DBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, TABLE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_CAPTION + " VARCHAR" + ")";
        db.execSQL(CREATE_TABLE);
        Log.i("DB Handler", "create table successfully");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public String loadHandler() {
        String result = "";
        String query = "Select * from " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String caption = cursor.getString(1);
            result = String.valueOf(id) + " " + caption + System.getProperty("line.separator");
        }
        cursor.close();
        db.close();
        return result;
    }

    public void addHandle(Post post) {
        ContentValues values = new ContentValues();

        values.put(COLUMN_CAPTION, post.getCaption());

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

}


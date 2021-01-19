package vn.edu.usth.facebookclient.data;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;

import java.util.List;

@Entity(tableName = "likes")
public class Like {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "post_id")
    public int post_id;

    @ColumnInfo(name = "number_of_like")
    public int number_of_like;
}

@Dao
interface LikeDao {
    @Insert
    void insertAll(Like... likes);

    @Delete
    void delete(Like like);

    @Query("SELECT * FROM likes")
    List<Like> getAll();
}
package com.example.compcheck.dao;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.compcheck.model.Record;

@Dao
public interface RecordDao {

    @Insert
    long insert(Record record);

    @Update
    void update(Record record);

    @Query("SELECT * FROM records WHERE userId = :userId ORDER BY executedAt DESC")
    LiveData<List<Record>> getByUser(int userId);

    @Query("SELECT * FROM records WHERE synced = 0")
    List<Record> getUnsynced();
}

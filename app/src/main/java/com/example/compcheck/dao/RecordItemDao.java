package com.example.compcheck.dao;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.compcheck.model.RecordItem;

@Dao
public interface RecordItemDao {

    @Insert
    void insertAll(List<RecordItem> items);

    @Query("SELECT * FROM record_items WHERE recordId = :recordId")
    List<RecordItem> getByRecord(int recordId);
}

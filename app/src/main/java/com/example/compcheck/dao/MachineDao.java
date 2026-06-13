package com.example.compcheck.dao;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.compcheck.model.Machine;

@Dao
public interface MachineDao {
    @Insert
    long insert(Machine machine);

    @Update
    void update(Machine machine);

    @Query("SELECT * FROM machines")
    LiveData<List<Machine>> getAll();

    @Query("SELECT * FROM machines WHERE id = :id")
    Machine getById(int id);
}

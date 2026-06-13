package com.example.compcheck.dao;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.compcheck.model.ChecklistTemplate;

@Dao
public interface ChecklistTemplateDao {
    @Insert
    long insert(ChecklistTemplate template);

    @Query("SELECT * FROM checklist_templates WHERE machineId = :machineId")
    LiveData<List<ChecklistTemplate>> getByMachine(int machineId);

    @Query("SELECT * FROM checklist_templates WHERE id = :id")
    ChecklistTemplate getById(int id);
}

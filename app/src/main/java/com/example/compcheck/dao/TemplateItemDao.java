package com.example.compcheck.dao;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.compcheck.model.TemplateItem;


@Dao
public interface TemplateItemDao {
    @Insert
    void insertAll(List<TemplateItem> items);

    @Query("SELECT * FROM template_items WHERE templateId = :templateId ORDER BY `order` ASC")
    List<TemplateItem> getByTemplate(int templateId);
}

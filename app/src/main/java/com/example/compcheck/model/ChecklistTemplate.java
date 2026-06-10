package com.example.compcheck.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "checklist_templates",
        foreignKeys = @ForeignKey(
                entity = Machine.class,
                parentColumns = "id",
                childColumns = "machineId",
                onDelete = ForeignKey.CASCADE
        )
)
public class ChecklistTemplate {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int machineId;
    private String name;
    private long createdAt;

    public ChecklistTemplate(int machineId, String name) {
        this.machineId = machineId;
        this.name = name;
        this.createdAt = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
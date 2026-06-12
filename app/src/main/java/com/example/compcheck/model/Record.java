package com.example.compcheck.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "records",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = ChecklistTemplate.class,
                        parentColumns = "id",
                        childColumns = "templateId",
                        onDelete = ForeignKey.CASCADE
                )
        }
)
public class Record {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int userId;
    private int templateId;
    private long executedAt;
    private String observation;
    private boolean synced;

    public Record(int userId, int templateId, String observation) {
        this.userId = userId;
        this.templateId = templateId;
        this.observation = observation;
        this.executedAt = System.currentTimeMillis();
        this.synced = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public long getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(long executedAt) {
        this.executedAt = executedAt;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public boolean isSynced() {
        return synced;
    }

    public void setSynced(boolean synced) {
        this.synced = synced;
    }
}
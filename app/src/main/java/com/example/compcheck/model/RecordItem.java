package com.example.compcheck.model;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "record_items",
        foreignKeys = {
                @ForeignKey(
                        entity = Record.class,
                        parentColumns = "id",
                        childColumns = "recordId",
                        onDelete = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = TemplateItem.class,
                        parentColumns = "id",
                        childColumns = "templateItemId",
                        onDelete = ForeignKey.CASCADE
                )
        },
        indices = {
                @Index("recordId"),
                @Index("templateItemId")
        }
)
public class RecordItem {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int recordId;
    private int templateItemId;
    private String status;
    private String observation;

    public RecordItem(int recordId, int templateItemId, String status, String observation) {
        this.recordId = recordId;
        this.templateItemId = templateItemId;
        this.status = status;
        this.observation = observation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void setTemplateItemId(int templateItemId) {
        this.templateItemId = templateItemId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getId() {
        return id;
    }

    public int getRecordId() {
        return recordId;
    }

    public int getTemplateItemId() {
        return templateItemId;
    }

    public String getStatus() {
        return status;
    }

    public String getObservation() {
        return observation;
    }
}

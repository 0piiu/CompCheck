package com.example.compcheck.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "Template_items",
        foreignKeys = @ForeignKey(
                entity = ChecklistTemplate.class,
                parentColumns = "id",
                childColumns = "TemplateId",
                onDelete = ForeignKey.CASCADE
        )
)
public class TemplateItem {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int templateId;
    private String description;
    private int order;
    private boolean required;

    public TemplateItem(int templateId, String description, int order, boolean required) {
        this.templateId = templateId;
        this.description = description;
        this.order = order;
        this.required = required;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}

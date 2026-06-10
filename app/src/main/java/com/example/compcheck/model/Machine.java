package com.example.compcheck.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "machines") // nome da tabela
public class Machine {
    @PrimaryKey(autoGenerate = true) // id do equipamento, chave primaria
    private int id;

    private String name;
    private String description;
    private boolean active = true; // atributo falso ou verdadeiro para funcionamento da maquina


    // construtor da classe
    public Machine(String name, String description) {
        this.name = name;
        this.description = description;
        this.active = true;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}


package com.example.compcheck.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")

public class User {


    @PrimaryKey(autoGenerate = true) // chave primaria da classe, id do usuario
    private int id;

    private String name;
    private String email;
    private String passwordHash;
    private long sinceIn; // data de ativacao do login

    // construtor da classe
    public User(String name, String email, String passwordHash) {
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.sinceIn = System.currentTimeMillis();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public long getSinceIn() {
        return sinceIn;
    }

    public void setSinceIn(long sinceIn) {
        this.sinceIn = sinceIn;
    }
}



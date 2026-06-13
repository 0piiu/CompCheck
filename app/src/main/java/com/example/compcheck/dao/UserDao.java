package com.example.compcheck.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.compcheck.model.User;

@Dao // basicamente informa que essa interface irá fazer alterações no banco de dados
public interface UserDao {
    @Insert
        // gera automaticamente o codigo SQL
    long insert(User user);

    @Query("SELECT * FROM users WHERE email = :email AND passwordHash = :passwordHash")
        // o "Query", serve para o room validar esse codigo SQL em tempo de compilação, se tabela der erro ou nao existir da erro antes de rodar o app.
        // os dois pontos indicam que os valorem email e passwordHash tem valores dos parametros do metodo login().

    User login(String email, String passwordHash);

}


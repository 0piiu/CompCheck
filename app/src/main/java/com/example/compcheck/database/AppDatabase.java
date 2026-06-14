package com.example.compcheck.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.compcheck.dao.ChecklistTemplateDao;
import com.example.compcheck.dao.MachineDao;
import com.example.compcheck.dao.RecordDao;
import com.example.compcheck.dao.RecordItemDao;
import com.example.compcheck.dao.TemplateItemDao;
import com.example.compcheck.dao.UserDao;
import com.example.compcheck.model.ChecklistTemplate;
import com.example.compcheck.model.Machine;
import com.example.compcheck.model.Record;
import com.example.compcheck.model.RecordItem;
import com.example.compcheck.model.TemplateItem;
import com.example.compcheck.model.User;

@Database( // registrando todas as entidades criadas no banco de dados
        entities = {
                Machine.class,
                User.class,
                Record.class,
                RecordItem.class,
                ChecklistTemplate.class,
                TemplateItem.class
        },
        version = 1, // primeira versao, em atualizacoes temos que atualizar para na crashar
        exportSchema = false
)

public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public abstract MachineDao machineDao();

    public abstract UserDao userDao();

    public abstract RecordDao recordDao();

    public abstract RecordItemDao recordItemDao();

    public abstract ChecklistTemplateDao checklistTemplateDao();

    public abstract TemplateItemDao templateItemDao();

    public static synchronized AppDatabase getInstance(Context context) { // getInstance(), garante que haja apenas uma versao do banco em todo app, synchronized é usado para que em múltiplas threads simultâneas, só uma instância será criada. Importante pro modo offline quando há sincronização rodando em background.
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "compcheck_database"
            ).build();
        }
        return instance;
    }
}

package dev.android.monique.franca.app.lista.app_medianotas.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Locale;

public class databaseNotas extends SQLiteOpenHelper {

    private static String DB_NAME = "alunoNotas.db";
    private static final  int DB_VERSION =1;

    Cursor cursor;
    SQLiteDatabase db;

    public databaseNotas(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db =getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaAlunoNotas
                = "CREATE TABLE AlunosNotas (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeAluno TEXT," +
                "disciplina TEXT," +
                "nota1 REAL, " +
                "nota2 REAL, " +
                "nota3 REAL, " +
                "nota4 REAL, " +
                "media REAL, " +
                "resultado TEXT)";

        db.execSQL(sqlTabelaAlunoNotas);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void salvarDados(String tabela, ContentValues dados){
        db.insert(tabela, null,dados);
    }
}

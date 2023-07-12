package dev.android.monique.franca.app.lista.app_medianotas.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import dev.android.monique.franca.app.lista.app_medianotas.database.databaseNotas;
import dev.android.monique.franca.app.lista.app_medianotas.model.Aluno;
import dev.android.monique.franca.app.lista.app_medianotas.view.MainActivity;

public class AlunoController extends databaseNotas {

    public AlunoController(MainActivity activity) {
        super(activity);

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada....");
        return super.toString();
    }

    public void salvar(Aluno aluno){
        Log.d("MVC_Controller", "Salvo");

        ContentValues dados = new ContentValues();
        dados.put("nomeAluno", aluno.getNomeAluno());
        dados.put("disciplina",aluno.getDisciplina());
        dados.put(" nota1",aluno.getNota1());
        dados.put(" nota2",aluno.getNota2());
        dados.put(" nota3",aluno.getNota3());
        dados.put(" nota4",aluno.getNota4());
        dados.put(" media ",aluno.getMedia());
        dados.put(" Resultado ",aluno.getResultado());

        salvarDados("AlunosNotas",dados);

    }

    public  String calcular(Aluno aluno){
       double media = aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4());
       String disciplina = aluno.getDisciplina();
       String frase;

       if(media>=60){
           frase = String.format("Aprovado" + disciplina+ "com Média: %.2f",media);
       }else{
           frase = String.format("Reprovado" + disciplina+ " com Média: %.2f",media);
       }
       return frase;
    }

}

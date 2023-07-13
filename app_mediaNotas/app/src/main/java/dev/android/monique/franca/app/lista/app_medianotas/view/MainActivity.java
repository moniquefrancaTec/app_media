package dev.android.monique.franca.app.lista.app_medianotas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import dev.android.monique.franca.app.lista.app_medianotas.R;
import dev.android.monique.franca.app.lista.app_medianotas.controller.AlunoController;
import dev.android.monique.franca.app.lista.app_medianotas.model.Aluno;

public class MainActivity extends AppCompatActivity {

    AlunoController alunoController;
    Aluno aluno;

    EditText nomeAluno;

    String disMatematica = "Matemática";
    EditText nota1_mat;
    EditText nota2_mat;
    EditText nota3_mat;
    EditText nota4_mat;

    String disPortugues = "Português";
    EditText nota1_por;
    EditText nota2_por;
    EditText nota3_por;
    EditText nota4_por;

    String disGeografia = "Geografia";
    EditText nota1_geo;
    EditText nota2_geo;
    EditText nota3_geo;
    EditText nota4_geo;

    String disHistoria = "História";
    EditText nota1_his;
    EditText nota2_his;
    EditText nota3_his;
    EditText nota4_his;

    String disFisica = "Física";
    EditText nota1_fis;
    EditText nota2_fis;
    EditText nota3_fis;
    EditText nota4_fis;

    Button btnbuttonLimpar;
    Button btnbuttonCalcular;
    Button btnbuttonSalvar;

    TextView editResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alunoController = new AlunoController(MainActivity.this);
        alunoController.toString();

       aluno = new Aluno();

       nomeAluno = findViewById(R.id.nome_aluno);

       nota1_mat = findViewById(R.id.nota1_mat);
       nota2_mat = findViewById(R.id.nota2_mat);
       nota3_mat = findViewById(R.id.nota3_mat);
       nota4_mat = findViewById(R.id.nota4_mat);

       nota1_por = findViewById(R.id.nota1_port);
       nota2_por = findViewById(R.id.nota2_port);
       nota3_por = findViewById(R.id.nota3_port);
       nota4_por = findViewById(R.id.nota4_port);

       nota1_geo = findViewById(R.id.nota1_geo);
       nota2_geo = findViewById(R.id.nota2_geo);
       nota3_geo = findViewById(R.id.nota3_geo);
       nota4_geo = findViewById(R.id.nota4_geo);

       nota1_his = findViewById(R.id.nota1_his);
       nota2_his = findViewById(R.id.nota2_his);
       nota3_his = findViewById(R.id.nota3_his);
       nota4_his = findViewById(R.id.nota4_his);

       nota1_fis = findViewById(R.id.nota1_fis);
       nota2_fis = findViewById(R.id.nota2_fis);
       nota3_fis = findViewById(R.id.nota3_fis);
       nota4_fis = findViewById(R.id.nota4_fis);

       btnbuttonCalcular =findViewById(R.id.btn_calcular);
       btnbuttonLimpar = findViewById(R.id.btn_limpar);
       btnbuttonSalvar = findViewById(R.id.btn_salvar);

       editResultado = findViewById(R.id.txt_resultado);

       btnbuttonLimpar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               nomeAluno.setText("");

               nota1_mat.setText("");
               nota2_mat.setText("");
               nota3_mat.setText("");
               nota4_mat.setText("");

               nota1_por.setText("");
               nota2_por.setText("");
               nota3_por.setText("");
               nota4_por.setText("");

               nota1_geo.setText("");
               nota2_geo.setText("");
               nota3_geo.setText("");
               nota4_geo.setText("");

               nota1_his.setText("");
               nota2_his.setText("");
               nota3_his.setText("");
               nota4_his.setText("");

               nota1_fis.setText("");
               nota2_fis.setText("");
               nota3_fis.setText("");
               nota4_fis.setText("");

               editResultado.setText("");

               btnbuttonSalvar.setEnabled(false);
           }
       });

       btnbuttonCalcular.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               // validação dos dados
               boolean dadosOk = true;

               if(TextUtils.isEmpty(nomeAluno.getText()) ){
                   nomeAluno.setError("Obrigatório");
                   nomeAluno.requestFocus();

                   dadosOk =false;
               }
               if(TextUtils.isEmpty(nota2_mat.getText())){
                   nota2_mat.setError("Obrigatório");
                   nota2_mat.requestFocus();
                   dadosOk =false;
               }
               if(TextUtils.isEmpty(nota3_mat.getText())){
                   nota3_mat.setError("Obrigatório");
                   nota3_mat.requestFocus();
                   dadosOk =false;
               }
               if(TextUtils.isEmpty(nota4_mat.getText())){
                   nota4_mat.setError("Obrigatório");
                   nota4_mat.requestFocus();
                   dadosOk =false;
               }
               if(TextUtils.isEmpty(nota1_mat.getText())){
                   nota1_mat.setError("Obrigatório");
                   nota1_mat.requestFocus();
                   dadosOk =false;
               }

               if(TextUtils.isEmpty(nota1_por.getText())){
                   nota1_por.setError("Obrigatório");
                   nota1_por.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota2_por.getText())){
                   nota2_por.setError("Obrigatório");
                   nota2_por.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota3_por.getText())){
                   nota3_por.setError("Obrigatório");
                   nota3_por.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota4_por.getText())){
                   nota4_por.setError("Obrigatório");
                   nota4_por.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota1_geo.getText())){
                   nota1_geo.setError("Obrigatório");
                   nota1_geo.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota2_geo.getText())){
                   nota2_geo.setError("Obrigatório");
                   nota2_geo.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota3_geo.getText())){
                   nota3_geo.setError("Obrigatório");
                   nota3_geo.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota4_geo.getText())){
                   nota4_geo.setError("Obrigatório");
                   nota4_geo.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota1_his.getText())){
                   nota1_his.setError("Obrigatório");
                   nota1_his.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota2_his.getText())){
                   nota2_his.setError("Obrigatório");
                   nota2_his.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota3_his.getText())){
                   nota3_his.setError("Obrigatório");
                   nota3_his.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota4_his.getText())){
                   nota4_his.setError("Obrigatório");
                   nota4_his.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota1_fis.getText())){
                   nota1_fis.setError("Obrigatório");
                   nota1_fis.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota2_fis.getText())){
                   nota2_fis.setError("Obrigatório");
                   nota2_fis.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota3_fis.getText())){
                   nota3_fis.setError("Obrigatório");
                   nota3_fis.requestFocus();
                   dadosOk = false;
               }
               if(TextUtils.isEmpty(nota4_fis.getText())){
                   nota4_fis.setError("Obrigatório");
                   nota4_fis.requestFocus();
                   dadosOk = false;
               }

               if(dadosOk){

                   String nome = String.valueOf(nomeAluno.getText());


                   // Matemática
                   double nota1mat = Double.parseDouble(String.valueOf(nota1_mat.getText()));
                   double nota2mat = Double.parseDouble(String.valueOf(nota2_mat.getText()));
                   double nota3mat = Double.parseDouble(String.valueOf(nota3_mat.getText()));
                   double nota4mat = Double.parseDouble(String.valueOf(nota4_mat.getText()));
                   String fraseMat;

                   aluno.setDisciplina(disMatematica);
                   aluno.setNota1(nota1mat);
                   aluno.setNota2(nota2mat);
                   aluno.setNota3(nota3mat);
                   aluno.setNota4(nota4mat);

                  fraseMat = alunoController.calcular(aluno);

                  //Portugues
                   double nota1port= Double.parseDouble(String.valueOf(nota1_por.getText()));
                   double nota2port= Double.parseDouble(String.valueOf(nota2_por.getText()));
                   double nota3port= Double.parseDouble(String.valueOf(nota3_por.getText()));
                   double nota4port= Double.parseDouble(String.valueOf(nota4_por.getText()));
                   String frasePort;

                   aluno.setDisciplina(disPortugues);
                   aluno.setNota1(nota1port);
                   aluno.setNota2(nota2port);
                   aluno.setNota3(nota3port);
                   aluno.setNota4(nota4port);

                   frasePort = alunoController.calcular(aluno);

                   //Geografia
                   double nota1Geo = Double.parseDouble(String.valueOf(nota1_geo.getText()));
                   double nota2Geo = Double.parseDouble(String.valueOf(nota2_geo.getText()));
                   double nota3Geo = Double.parseDouble(String.valueOf(nota3_geo.getText()));
                   double nota4Geo = Double.parseDouble(String.valueOf(nota4_geo.getText()));
                   String fraseGeo;

                   aluno.setDisciplina(disGeografia);
                   aluno.setNota1(nota1Geo);
                   aluno.setNota2(nota2Geo);
                   aluno.setNota3(nota3Geo);
                   aluno.setNota4(nota4Geo);

                   fraseGeo = alunoController.calcular(aluno);

                   //História
                   double nota1his = Double.parseDouble(String.valueOf(nota1_his.getText()));
                   double nota2his = Double.parseDouble(String.valueOf(nota2_his.getText()));
                   double nota3his = Double.parseDouble(String.valueOf(nota3_his.getText()));
                   double nota4his = Double.parseDouble(String.valueOf(nota4_his.getText()));
                   String fraseHis;

                   aluno.setDisciplina(disHistoria);
                   aluno.setNota1(nota1his);
                   aluno.setNota2(nota2his);
                   aluno.setNota3(nota3his);
                   aluno.setNota4(nota4his);

                   fraseHis = alunoController.calcular(aluno);

                   //Fisica
                   double nota1fis = Double.parseDouble(String.valueOf(nota1_fis.getText()));
                   double nota2fis = Double.parseDouble(String.valueOf(nota2_fis.getText()));
                   double nota3fis = Double.parseDouble(String.valueOf(nota3_fis.getText()));
                   double nota4fis = Double.parseDouble(String.valueOf(nota4_fis.getText()));
                   String fraseFis;

                   aluno.setDisciplina(disFisica);
                   aluno.setNota1(nota1fis);
                   aluno.setNota2(nota2fis);
                   aluno.setNota3(nota3fis);
                   aluno.setNota4(nota4fis);

                   fraseFis = alunoController.calcular(aluno);

                   // Frase Final
                  editResultado.setText( " "+ nome + "\n" +
                          " * " + fraseMat + "\n" +
                          " * " + frasePort + "\n" +
                          " * " + fraseGeo + "\n" +
                          " * " + fraseHis + "\n" +
                          " * " + fraseFis);

                  btnbuttonSalvar.setEnabled(true);

               }else{
                   Toast.makeText(MainActivity.this, "Digite os dados!", Toast.LENGTH_LONG).show();
               }
           }
       });

       btnbuttonSalvar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               aluno.setNomeAluno(String.valueOf(nomeAluno.getText()));
               aluno.setDisciplina(disMatematica);
               aluno.setNota1(Double.parseDouble(String.valueOf(nota1_mat.getText())));
               aluno.setNota2(Double.parseDouble(String.valueOf(nota2_mat.getText())));
               aluno.setNota3(Double.parseDouble(String.valueOf(nota3_mat.getText())));
               aluno.setNota4(Double.parseDouble(String.valueOf(nota4_mat.getText())));
               aluno.setResultado("aprovado");

               alunoController.salvar(aluno);


           }
       });

    }


}
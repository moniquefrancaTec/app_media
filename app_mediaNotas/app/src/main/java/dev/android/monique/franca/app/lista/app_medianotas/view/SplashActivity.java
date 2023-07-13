package dev.android.monique.franca.app.lista.app_medianotas.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import dev.android.monique.franca.app.lista.app_medianotas.R;
import dev.android.monique.franca.app.lista.app_medianotas.database.databaseNotas;

public class SplashActivity  extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH =6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TelaSplash();

    }

    private  void TelaSplash(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                databaseNotas db = new databaseNotas(SplashActivity.this);

                Intent telaPrincipal = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(telaPrincipal);
                finish();

            }
        },TIME_OUT_SPLASH);
    }

}

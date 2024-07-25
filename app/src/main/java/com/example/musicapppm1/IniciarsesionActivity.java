package com.example.musicapppm1;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class IniciarsesionActivity extends AppCompatActivity  {

    EditText tCorreo, tPass;
    TextView olvidarpass, registrate;
    Button btnIngresar;
    ImageView verPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion);

        tCorreo= findViewById(R.id.txtEmail);
        tPass = findViewById(R.id.txtPass);
        btnIngresar = findViewById(R.id.btnIniciar);

        olvidarpass = findViewById(R.id.olvidastepass);
        registrate = findViewById(R.id.registrarse);

        verPass = findViewById(R.id.verpass);
        verPass.setImageResource(R.drawable.esconder);
        verPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tPass.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())){
                    tPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    verPass.setImageResource(R.drawable.esconder);
                }else{
                    tPass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    verPass.setImageResource(R.drawable.ver);
                }
            }
        });


        olvidarpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarsesionActivity.this, ExtravioPassActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });

        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(IniciarsesionActivity.this, RegistrarseActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();*/
            }
        });
    }
}

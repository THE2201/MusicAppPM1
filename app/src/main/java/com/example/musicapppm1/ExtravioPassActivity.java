package com.example.musicapppm1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class ExtravioPassActivity extends AppCompatActivity {

    Button btnRecuperarCorreo, btnAtras;
    EditText recuperarEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extravio_cuenta);

        recuperarEmail = findViewById(R.id.txtRecuperarEmail);

        btnRecuperarCorreo = findViewById(R.id.btnRecuperarCorreo);



        btnRecuperarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IniciarsesionActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        });
    }
}
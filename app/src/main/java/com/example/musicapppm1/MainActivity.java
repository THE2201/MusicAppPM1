package com.example.musicapppm1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.perfil_usuario){
            Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()==R.id.cambio_contrasena) {
            Toast.makeText(this, "cambio", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==R.id.cerrar_sesion){
            Toast.makeText(this, "cerrar", Toast.LENGTH_SHORT).show();
        }
        else{
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
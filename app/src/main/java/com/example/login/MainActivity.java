package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       Button b = findViewById(R.id.boton);
       b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "¡Gracias por Iniciar sesión!", Toast.LENGTH_SHORT).show();
    }
}
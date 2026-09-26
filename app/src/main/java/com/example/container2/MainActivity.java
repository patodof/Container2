package com.example.container2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //atributos de su clase
    Button boton_spiner ;
    Button boton_recycler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //aqui inicia su codigo
        //declarar variables
        boton_spiner = findViewById(R.id.boton_spinner);

        //clicks para los botones
        boton_spiner.setOnClickListener(v ->
                    startActivity( new Intent(MainActivity.this , SpinnerActivity.class) )
                );

        boton_recycler = findViewById(R.id.boton_recycler);
        boton_recycler.setOnClickListener(v ->
                    startActivity(new Intent(MainActivity.this, RecyclerActivity.class) )
                );

    }
}
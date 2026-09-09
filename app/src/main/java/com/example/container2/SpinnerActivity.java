package com.example.container2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    List<String> lenguajes =  new ArrayList<>();
    Spinner spinner ;

    Button boton_volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //su codigo aqui
        boton_volver = findViewById(R.id.boton_slider_volver);

        boton_volver.setOnClickListener( v ->
                    startActivity( new Intent(SpinnerActivity.this , MainActivity.class) )
                );

        //codigo para spinner
        //poblar la lista de datos
        lenguajes.add("Android");
        lenguajes.add("C++");
        lenguajes.add("C#");
        lenguajes.add("Python");

        //iniciar nuestra variable
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lenguajes );

        spinner.setAdapter(adapter);

    }
}
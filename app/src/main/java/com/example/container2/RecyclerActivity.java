package com.example.container2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    public RecyclerView recycler;
    public ArrayList<ContactosModel> datos_adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //
        recycler = findViewById(R.id.recycler_ejemplo);

        //cargar los datos a mi lista
        datos_adapter = new ArrayList<ContactosModel>();
        datos_adapter.add( new ContactosModel("Diego primero", "1234", "diego@a.cl"));
        datos_adapter.add( new ContactosModel("Juan segundo", "12347", "juan@a.cl"));

        //declarar el adaptador
        ContactosAdapter adapter = new ContactosAdapter(datos_adapter);

        //definir el layout Manager
        recycler.setLayoutManager(new LinearLayoutManager(this));

        //setear el adapter a nuestro recyclerview
        recycler.setAdapter(adapter);
    }
}
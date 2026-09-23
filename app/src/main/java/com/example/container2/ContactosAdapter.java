package com.example.container2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactosAdapter {

    static class ContactosViewHolder extends RecyclerView.ViewHolder
    {
        final TextView txtNombre ;
        final TextView txtTelefono ;
        final TextView txtCorreo;

        ContactosViewHolder (@NonNull View itemView)
        {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txt_contacto_nombre);
            txtCorreo = itemView.findViewById(R.id.txt_contacto_correo);
            txtTelefono = itemView.findViewById(R.id.txt_contacto_telefono);
        }
    }
}

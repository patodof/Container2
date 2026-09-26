package com.example.container2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactosAdapter extends RecyclerView.Adapter<ContactosAdapter.ContactosViewHolder> {

    ArrayList<ContactosModel> datos;

    //ViewHolder Custom para poder asociar los datos del XML como variable
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

    ContactosAdapter (ArrayList<ContactosModel> datos_usuario )
    {
        datos = datos_usuario;
    }

    //Es obligatorio y asocia el XML a el objeto a msotrar en pantalla
    @Override
    public ContactosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType )
    {
        //normalmente esto siempre es igual y lo unico que cambiara sera el nombre del XML que cargare, eb este caso es item_contacto
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contacto, viewGroup, false);
        return new ContactosViewHolder(view);
    }

    //es pobligatorio y  enlaza los datos del elemento actual en pantalla al XML
    public void onBindViewHolder(ContactosViewHolder viewHolder, int posicion_actual)
    {
        //obtener el objecto actual
        ContactosModel dato_actual = datos.get(posicion_actual);
        //cargar informacion a nuestro xml a partir del objeto actual
        viewHolder.txtNombre.setText(dato_actual.nombre);
        viewHolder.txtCorreo.setText(dato_actual.correo);
        viewHolder.txtTelefono.setText(dato_actual.telefono);
    }

    //es obligatorio y retorna el largo actual de nuestra lista
    @Override
    public int getItemCount()
    {
        return datos.toArray().length;
    }
}

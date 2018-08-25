package com.example.bautista.appestudio.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bautista.appestudio.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdaptadorPersonal extends RecyclerView.Adapter<AdaptadorPersonal.ViewHolderPersonal> {

    ArrayList<persona> listarPersona;
    ArrayList<String> listar;

    public AdaptadorPersonal(ArrayList<persona> listarPersona) {
        this.listarPersona = listarPersona;
    }

    @NonNull
    @Override
    public ViewHolderPersonal onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_personal,null,false);

        return new ViewHolderPersonal(view);
    }

    @Override
    public void onBindViewHolder( ViewHolderPersonal viewHolderPersonal, int i) {
        viewHolderPersonal.nombre.setText(listarPersona.get(i).getNombre());
        viewHolderPersonal.apellido.setText(listarPersona.get(i).getApellido());
        viewHolderPersonal.foto.setImageResource(listarPersona.get(i).getFoto());


    }

    @Override
    public int getItemCount() {
        return listarPersona.size();
    }

    public class ViewHolderPersonal extends RecyclerView.ViewHolder {

        TextView nombre, apellido;
        ImageView foto;

        public ViewHolderPersonal(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.idNombre);
            apellido = (TextView)itemView.findViewById(R.id.idApellido);
            foto = (ImageView) itemView.findViewById(R.id.imgFoto);
        }
    }
}

package com.rygodc.misaficiones.fr.aficiones;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rygodc.misaficiones.R;

public class Jugar extends Fragment {
    private TextView textNombreJF;
    private TextView textDescripcionJF;
    private ImageView imageFotoJF;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jugar, container, false);

        textNombreJF = view.findViewById(R.id.textNombreJF);
        textNombreJF.setText("JUGAR FÚTBOL COMO PORTERO");

        textDescripcionJF = view.findViewById(R.id.textDescripcionJF);
        String descripcion = "\n Ser portero es mucho más que detener balones. Es ser un líder dentro del equipo, alguien en quien todos confían. La responsabilidad de organizar la defensa, de transmitir seguridad a mis compañeros y de mantener la concentración en todo momento es un desafío que me encanta. Soy el cerebro del equipo y me gusta tener ese rol."
                +"\n"+
        "Cada fin de semana, cuando me pongo los guantes y salto al campo, siento una emoción indescriptible. Como portero, soy el último bastión, el guardián de mi portería. La adrenalina de un disparo a quemarropa, la tensión de un córner, la satisfacción de una atajada espectacular... ¡No hay nada que se le compare! Es más que un juego, es una pasión que me llena de vida";
        textDescripcionJF.setText(descripcion);

        imageFotoJF = view.findViewById(R.id.imageFotoJF);
        imageFotoJF.setImageResource(R.drawable.portero);

        return view;
    }
}
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

public class Arbitro extends Fragment {
    private TextView textNombreRef;
    private TextView textDescripcionRef;
    private ImageView imageFotoRef;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_arbitro, container, false);

        textNombreRef = view.findViewById(R.id.textNombreRef);
        textNombreRef.setText("ÁRBITRO DE FÚTBOL");

        textDescripcionRef = view.findViewById(R.id.textDescripcionRef);

        String descripcion = "\n El arbitraje es una pieza fundamental en el fútbol. Sin nosotros, el juego simplemente no podría existir. Me siento honrado de poder contribuir a la organización y desarrollo del deporte que tanto amo. Además, creo que es importante fomentar el respeto por las reglas y por los demás jugadores, y el arbitraje es una excelente manera de hacerlo"
                            +"\n"+
                            "\n Arbitrar fútbol me ha permitido crecer como persona. He aprendido a tomar decisiones bajo presión, a manejar situaciones difíciles y a comunicarme de manera efectiva. Además, me ha brindado la oportunidad de conocer a gente increíble y de diferentes lugares. Cada fin de semana es una nueva experiencia que me enriquece tanto personal como profesionalmente";
        textDescripcionRef.setText(descripcion);

        imageFotoRef = view.findViewById(R.id.imageFotoRef);
        imageFotoRef.setImageResource(R.drawable.arbitro);

        return view;
    }
}

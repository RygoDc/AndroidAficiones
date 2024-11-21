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

public class Panda extends Fragment {
    private TextView textNombrePanda;
    private TextView textDescripcionPandas;
    private ImageView imageFotoPanda;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panda, container, false);

        textNombrePanda = view.findViewById(R.id.textNombrePanda);
        textNombrePanda.setText("PANDAS");

        textDescripcionPandas = view.findViewById(R.id.textDescripcionPandas);
        String descripcion = "El Oso Panda como Tótem representa:\n" +
                "\n" +
                "Equilibrio y armonía: Su pelaje blanco y negro simboliza el yin y el yang, invitándonos a encontrar balance en nuestras vidas.\n" +
                "Paz y tranquilidad: La naturaleza apacible del panda nos enseña a buscar serenidad interior y enfrentar los desafíos con calma.\n" +
                "Determinación y persistencia: A pesar de su dieta especializada, los pandas son tenaces, recordándonos que debemos perseguir nuestras metas con constancia.\n" +
                "Conexión con la naturaleza: Su vínculo con los bosques de bambú nos invita a cuidar y respetar el medio ambiente.\n" +
                "Buena suerte y estabilidad: El encuentro con este tótem suele ser una señal positiva, indicando que el éxito llegará si avanzamos con paciencia y determinación.\n" +
                "En esencia, el Oso Panda nos guía a vivir una vida más equilibrada, pacífica y en armonía con la naturaleza.";
        textDescripcionPandas.setText(descripcion);

        imageFotoPanda = view.findViewById(R.id.imageFotoPanda);
        imageFotoPanda.setImageResource(R.drawable.panda);

        return view;
    }
}

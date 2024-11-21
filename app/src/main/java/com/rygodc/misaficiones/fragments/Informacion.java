package com.rygodc.misaficiones.fragments;

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

public class Informacion extends Fragment {
    private TextView textNombre;
    private TextView textDescripcion;
    private ImageView imageFoto;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aficiones, container, false);

        textNombre = view.findViewById(R.id.textNombre);
        textNombre.setText("Hola, soy Rodrigo Donoso");

        textDescripcion = view.findViewById(R.id.textDescripcion);
        String descripcion = "Datos personales:\n" +
                "        \n Edad: 39\n\nOcupación: Desarrollador Multiplataforma\n\n" +
                "Personalidad: Soy una persona extrovertida o introvertida depende del grado de confianza que tenga de acuerdo al contexto o lugar donde me encuentre, soy amable con las personas, responsable y serio en cuanto a mis responsabilidad tanto laborales como personales.\n\n" +
                "Valores: Soy un apasionado de la optimización. Me encanta establecer sistemas y rutinas que me permitan maximizar mi tiempo y recursos. Creo que la organización es la clave para alcanzar cualquier objetivo\n\n" +
                "La curiosidad es mi motor. Me encanta aprender cosas nuevas y expandir mis conocimientos. Creo que la mente es como un músculo que hay que ejercitar constantemente\n\n" +
                "\nDatos adicionales:\n\nOrigen: Soy Chileno\n\n" +
                "Educación: Desarrollador Multiplataforma en Epsum\n" +
                "FullStack Python Trainee en E-Camp\n" +
                "Ingeniero en Computación en la Universidad de La Serena\n";
        textDescripcion.setText(descripcion);

        imageFoto = view.findViewById(R.id.imageFoto);
        imageFoto.setImageResource(R.drawable.foto);

        return view;
    }
}

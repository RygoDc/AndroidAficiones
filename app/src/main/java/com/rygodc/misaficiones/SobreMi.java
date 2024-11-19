package com.rygodc.misaficiones;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rygodc.misaficiones.databinding.ActivitySobreMiBinding;

public class SobreMi extends AppCompatActivity {

    private ActivitySobreMiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySobreMiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String favorito = bundle.getString("fragment_favorito", "Sin preferencia");
            binding.textFragmentFavorito.setText(favorito);
        }

        // Mostrar datos fijos (tu información)
        binding.textNombre.setText("Hola, soy Rodrigo");
        binding.textDescripcion.setText("Desarrollador apasionado por la tecnología, el arte y el aprendizaje.");
    }
}

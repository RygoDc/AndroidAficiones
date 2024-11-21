package com.rygodc.misaficiones;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.rygodc.misaficiones.databinding.ActivitySobreMiBinding;
import com.rygodc.misaficiones.ui.frmanager.Paginador2;
import com.rygodc.misaficiones.ui.frmanager.Paginador3;
import com.rygodc.misaficiones.ui.frmanager.Paginador4;

public class SobreMi extends AppCompatActivity {

    private ActivitySobreMiBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySobreMiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewPager viewPager = binding.viewPagerSobreMi;

        try {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                String favorito = bundle.getString("fragment_favorito", "Sin preferencia");
                if(favorito.equals("Son los Pandas")){
                    Paginador2 paginador = new Paginador2(this, getSupportFragmentManager());
                    viewPager.setAdapter(paginador);
                }
                else if(favorito.equals("Ser Árbitro de Fútbol")){
                    Paginador3 paginador = new Paginador3(this, getSupportFragmentManager());
                    viewPager.setAdapter(paginador);
                }
                else if(favorito.equals("Jugar Fútbol como Portero")){
                    Paginador4 paginador = new Paginador4(this, getSupportFragmentManager());
                    viewPager.setAdapter(paginador);
                }
            } else {
                Paginador2 paginador = new Paginador2(this, getSupportFragmentManager());
                viewPager.setAdapter(paginador);
            }
        } catch (Exception e) {
            Log.e("SobreMi", "Error al mostrar favorito", e);
        }

    }
}

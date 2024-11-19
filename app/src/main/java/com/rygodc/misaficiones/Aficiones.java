package com.rygodc.misaficiones;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.rygodc.misaficiones.databinding.ActivityAficionesBinding;
import com.rygodc.misaficiones.ui.frmanager.Paginador;

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.e("ActionBar", getSupportActionBar().toString());
        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sobre_mi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.favButton) {
            // Obtener el fragment activo
            int currentItem = binding.viewPager.getCurrentItem();
            String fragmentName = getFragmentName(currentItem);

            // Guardar en SharedPreferences
            SharedPreferences preferences = getSharedPreferences("MisAficionesPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("favorito", fragmentName);
            editor.apply();

            Toast.makeText(this, "Fragment favorito guardado: " + fragmentName, Toast.LENGTH_SHORT).show();

        } else if (id == R.id.sobreMiButton) {
            // Recuperar información del favorito y pasarla a la nueva actividad
            SharedPreferences prefs = getSharedPreferences("MisAficionesPrefs", MODE_PRIVATE);
            String favorito = prefs.getString("favorito", "Sin preferencia");

            Intent intent = new Intent(this, SobreMi.class);
            intent.putExtra("fragment_favorito", favorito);
            startActivity(intent);

        } else if (id == R.id.githubButton) {
            Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/RygoDC"));
            startActivity(githubIntent);

        } else {
            return super.onOptionsItemSelected(item); // Dejar que Android maneje otras acciones
        }

        return true;
    }

    private String getFragmentName(int position) {
        // Devuelve el nombre según la posición en el ViewPager
        if (position == 0) {
            return "Fragment 1: Afición 1";
        } else if (position == 1) {
            return "Fragment 2: Afición 2";
        } else if (position == 2) {
            return "Fragment 3: Afición 3";
        } else {
            return "Fragment desconocido";
        }
    }


}
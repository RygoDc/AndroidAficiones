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
            int itemActual = binding.viewPager.getCurrentItem();
            String nombreFragmento = getNombreFragmento(itemActual);

            SharedPreferences preferences = getSharedPreferences("MisAficionesPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("favorito", nombreFragmento);
            editor.apply();
            Toast.makeText(this, "Fragment favorito guardado: " + nombreFragmento, Toast.LENGTH_SHORT).show();


        }
        else if (id == R.id.sobreMiButton) {
            SharedPreferences prefs = getSharedPreferences("MisAficionesPrefs", MODE_PRIVATE);
            String favorito = prefs.getString("favorito", "Sin preferencia");

            Intent intent = new Intent(this, SobreMi.class);
            intent.putExtra("fragment_favorito", favorito);
            startActivity(intent);

        } else if (id == R.id.githubButton) {
            Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/RygoDC"));
            startActivity(githubIntent);

        } else {
            return super.onOptionsItemSelected(item);
        }

        return true;
    }

    private String getNombreFragmento(int position) {
        if (position == 0) {
            return "Son los Pandas";
        } else if (position == 1) {
            return "Ser Árbitro de Fútbol";
        } else if (position == 2) {
            return "Jugar Fútbol como Portero";
        } else {
            return "Fragment desconocido";
        }
    }


}
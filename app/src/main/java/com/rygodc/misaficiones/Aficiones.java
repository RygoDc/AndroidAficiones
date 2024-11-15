package com.rygodc.misaficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
            Toast toast = Toast.makeText(this, "Como me gustan mis aficiones", Toast.LENGTH_SHORT);
            toast.show();
        }
        if (id == R.id.sobreMiButton) {
//                Intent intent = new Intent(this, SobreMi.class);
            Toast toast = Toast.makeText(this, "Sobre mi", Toast.LENGTH_SHORT);
            toast.show();
        }
        if (id == R.id.githubButton) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/RygoDC"));
            startActivity(intent);
            Toast toast = Toast.makeText(this, "Mi Github", Toast.LENGTH_SHORT);
            toast.show();
        }
        return super.onOptionsItemSelected(item);

    }
}
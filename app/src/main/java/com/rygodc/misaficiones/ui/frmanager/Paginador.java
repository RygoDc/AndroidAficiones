package com.rygodc.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rygodc.misaficiones.fr.aficiones.Comer;
import com.rygodc.misaficiones.fr.aficiones.Dormir;
import com.rygodc.misaficiones.fr.aficiones.Jugar;

public class Paginador extends FragmentPagerAdapter {

    private final Context context;

    public Paginador(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Comer();
            case 1:
                return new Dormir();
            case 2:
                return new Jugar();
            default:
                return new Comer();
        }
    }

    @Override
    public int getCount() {
        return 3; // Número de fragments
    }
}


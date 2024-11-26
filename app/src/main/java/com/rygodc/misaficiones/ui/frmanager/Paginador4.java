package com.rygodc.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rygodc.misaficiones.fr.aficiones.Jugar;
import com.rygodc.misaficiones.fragments.Informacion;

public class Paginador4 extends FragmentPagerAdapter {

    private final Context context;

    public Paginador4(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Informacion();
            case 1:
                return new Jugar();
            default:
                return new Informacion();
        }
    }

    @Override
    public int getCount() {
        return 2; // Número de fragments
    }
}

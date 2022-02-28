package com.example.parcial1grupo3.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    //Se crea esta variable para controlar el numero de tabs.
    int numoftabs;

    //Creamos el constructor de la clase.
    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        //Aqui se determina cual fragment cargar.
        switch (position){
            case 0:
                return new Auto1();
            case 1:
                return new Auto2();
            case 2:
                return new Auto3();
            case 3:
                return new Auto4();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        //Este metodo retorna el numero de tabs.
        return numoftabs;
    }
}

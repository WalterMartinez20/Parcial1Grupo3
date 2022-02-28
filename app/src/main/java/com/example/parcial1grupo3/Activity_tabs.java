package com.example.parcial1grupo3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.parcial1grupo3.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Activity_tabs extends AppCompatActivity {

    //Estos objetos serviran para hacer el enlace con los objetos en la main activity.
    TabLayout tablayout;
    ViewPager viewpager;
    TabItem tab1, tab2, tab3, tab4;

    //Crear el controlador y crear la clase PageController.
    //Esto lo haremos una vez terminado todo aqui.
    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        //En el archivo R. estan los objetos para el enlace.
        tablayout = findViewById(R.id.tablayout_pr);
        viewpager = findViewById(R.id.viewpager_pr);
        tab1 = findViewById(R.id.tabAuto1);
        tab2 = findViewById(R.id.tabAuto2);
        tab3 = findViewById(R.id.tabAuto3);
        tab4 = findViewById(R.id.tabAuto4);

        //Este adaptador servira para controlar los cambios de los fragment.
        pagerAdapter = new PagerController(getSupportFragmentManager(),tablayout.getTabCount());

        //Los fragment se mostraran en esta vista viewPager.
        viewpager.setAdapter(pagerAdapter);

        //Evento click para los tabs.
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //Obtenemos la posicion del tab a mostrar.
                viewpager.setCurrentItem(tab.getPosition());

                //Determinar cual fragment se presenta
                if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==2){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==3){
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Aqui ViewPager en la activity sabe cual fragment mostrar.
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

    }
}
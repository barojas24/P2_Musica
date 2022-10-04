package com.example.p2_musica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewParentCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout=findViewById(R.id.tabLayout);
        TabItem tabCanciones=findViewById(R.id.itemcanciones);
        TabItem tabListas=findViewById(R.id.itemlistas);
        TabItem tabArtistas=findViewById(R.id.itemartistas);
        TabItem tabAlbumes=findViewById(R.id.itemalbumes);
        final ViewPager viewPager=findViewById(R.id.view);

        SubMenuAdapter subMenuAdapter=new SubMenuAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(subMenuAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.app_bar_search:
                menuBuscar(item);
                break;
                default:
                    break;
        }
    return true;
}
    public void menuBuscar(MenuItem item) {
        FragmentBuscar fragmentBuscar=new FragmentBuscar();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.frag_buscar,fragmentBuscar,"");
        ft.commit();
    }

    public void abrirFragmentoRepro(View view) {

        Log.i("MainActivity", "Se a dado click en la imagen" );
        Intent i=new Intent(this,CancionEnReproduccion.class);
        startActivity(i);
    }
}

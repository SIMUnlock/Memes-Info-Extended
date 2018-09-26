package com.memesinfo.memesinfoo;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMemeTouchedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se crea el fragment con el container
        getSupportFragmentManager()
                .beginTransaction().replace (R.id.container, new ListadoFragment ())
                .setTransition (FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit ();
    }

    @Override
    public void onMemeTouched(int idMeme,int idImg) {

        /*
        Intent otraActividad = new Intent(this,NombreDeLaOtraActivity.class);

        //Para enviar parametros a la otra activity
        otraActividad.putExtra("idMeme",idMeme);
        otraActividad.putExtra("idImg",idImg);
            startActivity(otraActividad);



            //Desde la otra activity, dentro de OnCreate la lees con
            Intent intent = getIntent();

                //No se si funcionen estas 2
                int idMemeOtherAct = intent.getIntExtra("idMeme",0);
                int idImgOtherAct = intent.getIntExtra("idImg",0);
        */
        Snackbar.make (findViewById (R.id.container), "idMeme:"+idMeme+"| idImg:"+idImg, Snackbar.LENGTH_LONG).show ();
    }
}

package com.utec.pdf_observaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView fondo = findViewById(R.id.fondo);

        //Acá pasamos la direccion de un gif para utilizar en el ImageView del fondo de la aplicación.
        String gifURL = "https://i.pinimg.com/originals/9f/4c/08/9f4c08dd9024fd1a4aeffdc7ce63da95.gif";
        Glide.with(this).load(gifURL).into(fondo);
    }
}
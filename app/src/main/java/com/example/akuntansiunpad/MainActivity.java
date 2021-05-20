package com.example.akuntansiunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView profilCard, dosenCard, fasilitasCard, lulusanCard;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("");
        setSupportActionBar(toolbar);

        profilCard = (CardView) findViewById(R.id.profil_card);
        dosenCard = (CardView) findViewById(R.id.dosen_card);
        fasilitasCard = (CardView) findViewById(R.id.fasilitas_card);
        lulusanCard = (CardView) findViewById(R.id.lulusan_card);

        profilCard.setOnClickListener(this);
        dosenCard.setOnClickListener(this);
        fasilitasCard.setOnClickListener(this);
        lulusanCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.profil_card :
                i = new Intent(MainActivity.this,Profil.class);
                startActivity(i);
                break;
            case R.id.dosen_card :
                i = new Intent(MainActivity.this,Dosen.class);
                startActivity(i);
                break;
            case R.id.fasilitas_card :
                i = new Intent(MainActivity.this,Fasilitas.class);
                startActivity(i);
                break;
            case R.id.lulusan_card :
                i = new Intent(MainActivity.this,Lulusan.class);
                startActivity(i);
                break;
        }
    }
}
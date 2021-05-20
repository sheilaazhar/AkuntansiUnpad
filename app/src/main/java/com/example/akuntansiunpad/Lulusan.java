package com.example.akuntansiunpad;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Lulusan extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lulusan);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Profil Lulusan");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String kompetensi = "         Kompetensi utama lulusan Program Studi S1 Akuntansi sejak tahun 2007 telah mengadopsi dan mengacu kepada Kerangka Kualifikasi Nasional Indonesia (KKNI) dan Standar Kompetensi Akuntan Profesional yang telah ditetapkan oleh International Federation of Accountant (IFAC) yakni International Education Standard (IES).\n";

        String lulusan = "Profil lulusan Prodi S1 Akuntansi adalah sebagai berikut:\n" +
                "1. Akuntan Publik\n" +
                "2. Akuntan Manajemen\n" +
                "3. Akuntan Sektor Publik\n" +
                "4. Akuntan Pendidik\n" +
                "5. Akuntan Pajak\n";

        JustifyTextView textView24 = (JustifyTextView) findViewById(R.id.textView24);
        textView24.setText(kompetensi);

        JustifyTextView textView26 = (JustifyTextView) findViewById(R.id.textView26);
        textView26.setText(lulusan);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
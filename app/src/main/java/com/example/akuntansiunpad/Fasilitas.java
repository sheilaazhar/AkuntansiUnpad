package com.example.akuntansiunpad;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.thekhaeng.recyclerviewmargin.LayoutMarginDecoration;

import java.util.ArrayList;
import java.util.List;

public class Fasilitas extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    RecyclerView recyclerView;

    private List<MyModel> modelList = new ArrayList<>();
    private AdapterCard adapter;
    private MyModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Fasilitas");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new AdapterCard(this, modelList);

        String image1 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Lead-Building.jpg";
        String image2 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/ruang-kelas.jpg";
        String image3 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Ruang-Baca.jpg";
        String image4 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Lab-KOmp.jpg";
        String image5 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Student-lounge.jpg";
        String image6 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/co-working-space-dosen.jpg";
        String image7 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Mushola.jpg";
        String image8 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/central-park.jpg";
        String image9 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/parking-area.jpg";
        String image10 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Graha-Kandaga.jpg";
        String image11 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Sport-Center-Bale-Santika.jpg";
        String image12 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/ULT.jpg";
        String image13 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Odong-odong.jpg";
        String image14 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/klinik-DU-watermark.jpg";
        String image15 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/Bale-Sawala-1.jpg";
        String image16 = "https://feb.unpad.ac.id/wp-content/uploads/2020/01/asrama.jpg";

        model = new MyModel("Lead Building",image1);
        modelList.add(model);

        model = new MyModel("Ruang Kuliah",image2);
        modelList.add(model);

        model = new MyModel("Ruang Baca", image3);
        modelList.add(model);

        model = new MyModel("Laboratorium Komputer", image4);
        modelList.add(model);

        model = new MyModel("Co-working Space Mahasiswa", image5);
        modelList.add(model);

        model = new MyModel("Co-working Space Dosen", image6);
        modelList.add(model);

        model = new MyModel("Mushola", image7);
        modelList.add(model);

        model = new MyModel("Central Park", image8);
        modelList.add(model);

        model = new MyModel("Parking Area", image9);
        modelList.add(model);

        model = new MyModel("Graha Kandaga", image10);
        modelList.add(model);

        model = new MyModel("Fasilitas Olahraga", image11);
        modelList.add(model);

        model = new MyModel("Pusat Pelayanan Terpadu Unpad", image12);
        modelList.add(model);

        model = new MyModel("Angkutan Gratis dalam Kampus", image13);
        modelList.add(model);

        model = new MyModel("Klinik Kesehatan", image14);
        modelList.add(model);

        model = new MyModel("Bale Sawala", image15);
        modelList.add(model);

        model = new MyModel("Asrama", image16);
        modelList.add(model);

        RecyclerView recyclerView = findViewById(R.id.list_fasilitas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        LayoutMarginDecoration marginDecoration = new LayoutMarginDecoration(1, 20);
        marginDecoration.setPadding(recyclerView, 20, 20, 20, 20);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(marginDecoration);
        recyclerView.setAdapter(adapter);
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
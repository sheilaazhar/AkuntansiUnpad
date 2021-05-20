package com.example.akuntansiunpad;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Profil extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Profil");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String par1 = "         Puji Syukur ke hadirat Allah SWT, bahwa atas rahmat dan kuasaNya lah, Program Studi S1 Akuntansi dapat berdiri tegak memberikan kontribusi bagi mahasiswa, masyarakat, bangsa dan negara. Program Studi S1 Akuntansi hadir memberikan solusi komprehensif bagi pengembangan keilmuan akuntansi di Indonesia, memberikan input yang bermutu bagi dunia kerja dan mengembangkan profesi akuntan mulai dari akuntan publik, akuntan manajemen, akuntan sektor publik, dan akuntan pendidik.\n" +
                "\n" +
                "         Program Studi S1 Akuntansi merupakan bagian dari Departemen Akuntansi Fakultas Ekonomi Universitas Padjadjaran. Universitas Padjadjaran merupakan salah satu Perguruan Tinggi Negeri yang memiliki reputasi baik di tingkat nasional dan internasional serta dikenal luas oleh masyarakat. Fakultas Ekonomi merupakan salah satu fakultas yang pertama kali didirikan bersama-sama dengan Universitas, sehingga kematangan pengelolaan telah teruji selama kurang lebih 60 tahun.\n" +
                "\n" +
                "         Mahasiswa Program studi akuntansi merupakan mahasiswa yang memiliki keunggulan akademis yang tinggi serta melalui proses saringan masuk yang dijaga ketat kualitasnya. Berbagai prestasi telah diraih oleh mahasiswa Akuntansi UNPAD baik prestasi dalam skala nasional maupun internasional. Mahasiswa yang telah lulus dan menjadi alumni juga banyak yang telah berkarya menjadi akuntan-akuntan yang telah bekerja pada berbagai tingkatan manajemen, hingga sampai pada level Top Management.\n" +
                "Kurikulum pendidikan Prodi S1 Akuntansi telah dirancang sesuai dengan kurikulum berstandar internasional, yaitu International Education Standard untuk membentuk kepribadian akuntan yang menguasai dalam hardskill akuntansi, mumpuni dalam softskill, serta memiliki sikap dan perilaku etis yang tinggi.\n" +
                "\n" +
                "         Pengajaran dan pendidikan akuntansi dilakukan oleh 42 orang dosen tetap akuntansi yang bergelar S2 dan S3 lulusan universitas ternama baik dalam maupun luar negeri, serta memiliki pengalaman praktek akuntansi yang luas. Metode pembelajaran diarahkan menjadi Student Centered Learning, yang bermakna mahasiswa sebagai objek pembelajar dan dosen menjadi fasilitator belajar, sehingga diharapkan metode pembelajaran dapat memberikan pemahaman dan pengalaman belajar bagi mahasiswa.\n" +
                "\n" +
                "         Pengajaran di UNPAD dilakukan sebagai bagian dari Tridharma Perguruan Tinggi dan didukung oleh sarana dan prasarana yang memadai dan kuat. Dengan munculnya berbagai peluang dan kesempatan yang ada, maka kami mengharapkan Prodi S1 Akuntansi dapat terus maju dan memberikan kontribusi bagi semua pihak.\n" +
                "\n" +
                "         Akhir kata, Semoga Program Studi S1 Akuntansi menjadi Rahmatan lil-Alamin bagi kita semua.\n" +
                "\n" +
                "Accounting UNPAD for Society: Trusted, Leading, Humane.\n";

        JustifyTextView textView19 = (JustifyTextView) findViewById(R.id.textView19);
        textView19.setText(par1);

        String visi = "         Menjadi program studi unggul dan berkelas dunia pada tahun 2020.\n";
        String misi = "1. Melaksanakan pembelajaran dan pendidikan dalam bidang akuntansi yang berdaya saing nasional, dan internasional yang mampu memenuhi tuntutanmasyarakat pengguna lulusan akuntansi.\n" +
                "2. Melaksanakan penelitian dalam bidang akuntansi yang mampu berkonstribusi bagi pemecahan masalah dalam kehidupan bermasyarakat, berbangsa dan bernegara serta bagi pengembangan keilmuan akuntansi\n" +
                "3. Melaksanakan pengabdian kepada masyarakat guna menopang pembelajaran dan kemajuan ilmu pengetahuan serta teknologi bagi komunitas akademik, pemerintah, industri dan masyarakat.\n" +
                "4. Membentuk sivitas akademika yang berintegritas, berkarakter, berdaya saing dan berwawasan global\n" +
                "5. Menjalin kerjasama dengan berbagai mitra strategis dalam dan luar negeri secara berkesinambungan\n";

        JustifyTextView textView27 = (JustifyTextView) findViewById(R.id.textView27);
        textView27.setText(visi);

        JustifyTextView textView30 = (JustifyTextView) findViewById(R.id.textView30);
        textView30.setText(misi);

        String tujuan = "-\tTerlaksananya kegiatan pembelajaran dan pendidikan bidang akuntansi yang bermutu untuk menghasilkan lulusan yang memiliki kompetensi di bidang akuntansi yang mampu bersaing dalam level lokal, nasional, regional maupun global\n" +
                "-\tTerlaksananya pengelolaan program studi akuntansi yang bermutu, profesional, dan akuntabel\n" +
                "-\tPeningkatan kualitas dan kuantitas penelitian yang menitikberatkan kepada isu-isu dalam lingkup lokal, nasional dan internasional, baik sebagai pengembangan keilmuan studi akuntansi maupun untuk berkontribusi pada pemecahan masalah dalam kehidupan bermasyarakat, berbangsa dan bernegara\n" +
                "-\tTerlaksananya kegiatan pengabdian kepada masyarakat yang mampu menopang pembelajaran dan kemajuan ilmu pengetahuan studi akuntansi serta pemberdayaan bagi komunitas akademik, pemerintah, industri dan masyarakat\n" +
                "-\tTerbangunnya iklim akademik yang kondusif dalam pelaksanaan pendidikan, penelitian, dan pengabdian kepada masyarakat\n" +
                "-\tTerwujudnya kemitraan dengan berbagai organisasi dalam dan luar negeri sebagai mitra strategi prodi akuntansi untuk kepentingan penyediaan kesempatan magang dan praktikum pembelajaran, promosi bersama, peluang melakukan kerjasama tridharma dan pendanaan riset serta beasiswa bagi mahasiswa.\n\n";

        JustifyTextView textView17 = (JustifyTextView) findViewById(R.id.textView17);
        textView17.setText(tujuan);
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
package com.example.filmlistem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Film> filmler = new ArrayList<Film>() {{
        add(new Film("Esaretin Bedeli",1994,"Polisiye",9.3,R.drawable.esaretin_bedeli));
        add(new Film("Baba",1972,"Suç",9.2,R.drawable.baba));
        add(new Film("Kara Şövalye",1994,"Aksiyon",9.0,R.drawable.kara_sovalye));
        add(new Film("Schindler'in Listesi",1993,"Savaş",9.0,R.drawable.schindler_in_listesi));
        add(new Film("Yüzüklerin Efendisi Kralın Dönüşü ",2003,"Fantastik",9.0,R.drawable.yuzuklerin_efendisi_kralin_donusu));
        add(new Film("12 Öfkeli Adam",1994,"Suç",9.0,R.drawable.ofkeli_12_adam));
        add(new Film("Baba 2",1974,"Suç",9.0,R.drawable.baba_2));
        add(new Film("Ucuz Roman",1994,"Suç",8.9,R.drawable.ucuz_roman));
        add(new Film("Başlangıç",2010,"Bilim Kurgu",8.8,R.drawable.baslangic));
        add(new Film("Dövüş Kulübü",1999,"Gerilim",8.8,R.drawable.dovus_kulubu));
    }};
    FilmAdapter adapter;
    ListView listFilmler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFilmler = (ListView) findViewById(R.id.listFilmler);

        adapter = new FilmAdapter(this,filmler);
        listFilmler.setAdapter(adapter);

        listFilmler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String filmAdi = filmler.get(position).filmAdi;
                Toast.makeText(MainActivity.this, filmAdi, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
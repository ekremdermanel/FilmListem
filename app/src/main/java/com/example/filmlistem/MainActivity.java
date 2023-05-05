package com.example.filmlistem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> filmler = new ArrayList<String>() {{
        add("Esaretin Bedeli");
        add("Baba");
        add("Kara Şövalye");
        add("Schindler'in Listesi");
        add("Yüzüklerin Efendisi Kralın Dönüşü");
        add("12 Öfkeli Adam");
        add("Baba 2");
        add("Ucuz Roman");
        add("Başlangıç");
        add("Dövüş Kulübü");
    }};
    ArrayAdapter<String> adapter;
    ListView listFilmler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFilmler = (ListView) findViewById(R.id.listFilmler);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,filmler);
        listFilmler.setAdapter(adapter);


    }
}
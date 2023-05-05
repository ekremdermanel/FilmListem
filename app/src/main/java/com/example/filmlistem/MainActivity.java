package com.example.filmlistem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FilmAdapter adapter;
    ListView listFilmler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFilmler = (ListView) findViewById(R.id.listFilmler);
        ArrayList<Film> filmler = Singleton.getInstance().getFilmler();
        adapter = new FilmAdapter(this,filmler);
        listFilmler.setAdapter(adapter);

        listFilmler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String filmAdi = filmler.get(position).filmAdi;
                //Toast.makeText(MainActivity.this, filmAdi, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),DetayActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });


    }
}
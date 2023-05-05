package com.example.filmlistem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        TextView txtFilmAdi = (TextView) findViewById(R.id.txtFilmAdi);
        TextView txtYil = (TextView) findViewById(R.id.txtYil);
        TextView txtTur = (TextView) findViewById(R.id.txtTur);
        TextView txtPuan = (TextView) findViewById(R.id.txtPuan);
        ImageView imgAfis = (ImageView) findViewById(R.id.imgAfis);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);

        Film film = Singleton.getInstance().filmDetay(position);
        txtFilmAdi.setText(film.filmAdi);
        txtYil.setText(String.valueOf(film.yil));
        txtTur.setText(film.tur);
        txtPuan.setText(String.valueOf(film.puan));
        imgAfis.setBackgroundResource(film.resim);
    }
}
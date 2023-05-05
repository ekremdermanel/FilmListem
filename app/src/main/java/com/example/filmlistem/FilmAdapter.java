package com.example.filmlistem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FilmAdapter extends ArrayAdapter<Film> {
    private Context context;
    private ArrayList<Film> filmler;

    public FilmAdapter(Context context, ArrayList<Film> filmler) {
        super(context, 0, filmler);
        this.context = context;
        this.filmler = filmler;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.film_item,null);

        TextView txtFilmAdi = (TextView) view.findViewById(R.id.txtFilmAdi);
        TextView txtYil = (TextView) view.findViewById(R.id.txtYil);
        TextView txtTur = (TextView) view.findViewById(R.id.txtTur);
        TextView txtPuan = (TextView) view.findViewById(R.id.txtPuan);
        ImageView imgAfis = (ImageView) view.findViewById(R.id.imgAfis);

        Film film = filmler.get(position);
        txtFilmAdi.setText(film.filmAdi);
        txtYil.setText(String.valueOf(film.yil));
        txtTur.setText(film.tur);
        txtPuan.setText(String.valueOf(film.puan));
        imgAfis.setBackgroundResource(film.resim);

        return view;
    }
}
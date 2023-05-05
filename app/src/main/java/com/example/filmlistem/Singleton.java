package com.example.filmlistem;

import java.util.ArrayList;

public class Singleton {
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
    private static Singleton singleton;
    private Singleton(){
    }
    public ArrayList<Film> getFilmler() {
        return filmler;
    }

    public void filmEkle(Film film) {
        filmler.add(film);
    }

    public void filmSil(int position) {
        filmler.remove(position);
    }

    public void filmGuncelle(int position, Film film) {
        filmler.set(position,film);
    }

    public Film filmDetay(int position) {
        return filmler.get(position);
    }

    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}


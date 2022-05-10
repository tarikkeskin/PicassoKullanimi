package com.trigoo.picassokullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.picasso.Picasso;
import com.trigoo.picassokullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        resimGoster("ayran.png");

        //get permission because it is not https  to do that go manifest.xml
        //http://kasimadalan.pe.hu/yemekler/resimler/kofte.png

        tasarim.buttonResim1.setOnClickListener(view -> {
            resimGoster("kofte.png");

        });

        tasarim.buttonResim2.setOnClickListener(view -> {
            resimGoster("kadayif.png");
        });
    }

    public void resimGoster(String resimAdi){
        String url = "http://kasimadalan.pe.hu/yemekler/resimler/"+resimAdi;
        Picasso.get().load(url).into(tasarim.imageView);
    }
}
package com.brilly.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import kotlinx.coroutines.channels.Receive;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new adapter(listMakanan,this));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new makanan("Aglio Olio", "Rp 65.000", "Pasta dengan daging cincang", R.drawable.aglio));

        listMakanan.add(new makanan("Soto Lamongan", "Rp 35.000", "Soto khas Lamongan dengan koya udang yang gurih", R.drawable.soto));

        listMakanan.add(new makanan("Mie Kocok", "Rp 40.000", "Mie khas Bandung dengan berbagai topping mengenyangkan", R.drawable.miekocok));

        listMakanan.add(new makanan("Fettucini", "Rp 55.000", "Pasta dengan saus carbonnara", R.drawable.fettucini));

        listMakanan.add(new makanan("Nasi Bebek", "Rp 38.000", "Bebek goreng gurih dengan sambal tomat yang khas", R.drawable.nasibebek));
    }
}
package com.brilly.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    Context context;

    public adapter(ArrayList<makanan> listMakanan, Context context) {
        this.listMakanan = listMakanan;
        this.context = context;
    }

    private ArrayList<makanan> listMakanan;


    @NonNull
    @Override
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.ViewHolder holder, int position) {
        makanan makanan = listMakanan.get(position);
        holder.txtnama.setText(makanan.getNama());
        holder.txtharga.setText(makanan.getHarga());
        holder.imgfoto.setImageResource(makanan.getId_img());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), int_makanan.class);
                intent.putExtra("gambar", makanan.getId_img());
                intent.putExtra("nama", makanan.getNama());
                intent.putExtra("harga", makanan.getHarga());
                intent.putExtra("deskripsi", makanan.getDeskripsi());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtnama, txtharga, txtdeskripsi;
        public ImageView imgfoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtnama = (TextView) itemView.findViewById(R.id.txtnama);
            txtharga = (TextView) itemView.findViewById(R.id.txtharga);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgfoto);

        }
    }
}

package com.example.aplikasimobileandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasimobileandroid.R;
import com.example.aplikasimobileandroid.model.BeritaModel;

import java.util.List;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.ViewHolder> {

    private final List<BeritaModel> beritaList;

    public BeritaAdapter(List<BeritaModel> beritaList, Context context) {
        this.beritaList = beritaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BeritaModel berita = beritaList.get(position);
        holder.imageBerita.setImageResource(berita.getGambarBerita());
        holder.textJudul.setText(berita.getJudulBerita());
        holder.textDeskripsi.setText(berita.getDeskripsiBerita());
    }

    @Override
    public int getItemCount() {
        return beritaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageBerita;
        TextView textJudul;
        TextView textDeskripsi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageBerita = itemView.findViewById(R.id.imageView);
            textJudul = itemView.findViewById(R.id.textViewTitle);
            textDeskripsi = itemView.findViewById(R.id.textViewDescription);
        }
    }
}

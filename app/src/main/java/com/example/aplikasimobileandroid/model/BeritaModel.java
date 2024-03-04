package com.example.aplikasimobileandroid.model;

public class BeritaModel {
    private final int gambarBerita;
    private final String judulBerita;
    private final String deskripsiBerita;

    public BeritaModel(int gambarBerita, String judulBerita, String deskripsiBerita) {
        this.gambarBerita = gambarBerita;
        this.judulBerita = judulBerita;
        this.deskripsiBerita = deskripsiBerita;
    }

    public int getGambarBerita() {
        return gambarBerita;
    }

    public String getJudulBerita() {
        return judulBerita;
    }

    public String getDeskripsiBerita() {
        return deskripsiBerita;
    }
}


package com.brilly.aplikasimenumakanan;

public class makanan {
    private String nama, harga, deskripsi;
    private int id_img;

    public makanan(String nama, String harga, String deskripsi, int id_img) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.id_img = id_img;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_img() {
        return id_img;
    }

    public void setId_img(int id_img) {
        this.id_img = id_img;
    }
}

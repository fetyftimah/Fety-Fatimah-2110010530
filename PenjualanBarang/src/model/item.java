/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fety Fatimah
 */
public class item {
    private int kodeBarang, hargaJual,kodeKategori;
    private String namaBarang, ket;

    public item(int kodeBarang, int hargaJual, int kodeKategori, String namaBarang, String ket) {
        this.kodeBarang = kodeBarang;
        this.hargaJual = hargaJual;
        this.kodeKategori = kodeKategori;
        this.namaBarang = namaBarang;
        this.ket = ket;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getKodeKategori() {
        return kodeKategori;
    }

    public void setKodeKategori(int kodeKategori) {
        this.kodeKategori = kodeKategori;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
    
    void tampilData(){
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Kode Barang : "+kodeBarang);
        System.out.println("Harga Jual : "+hargaJual);
        System.out.println("Ket : "+ket);
        System.out.println("Kode Kategori : "+kodeKategori);
    }
}

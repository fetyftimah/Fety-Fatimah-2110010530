/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fety Fatimah
 */
public class city {
        private costumer Costumer;
    private int kodeKota, ongkir;
    private String namaKota;

    public city(costumer Costumer, int kodeKota, int ongkir, String namaKota) {
        this.Costumer = Costumer;
        this.kodeKota = kodeKota;
        this.ongkir = ongkir;
        this.namaKota = namaKota;
    }

    public costumer getCostumer() {
        return Costumer;
    }

    public void setCostumer(costumer Costumer) {
        this.Costumer = Costumer;
    }

    public int getKodeKota() {
        return kodeKota;
    }

    public void setKodeKota(int kodeKota) {
        this.kodeKota = kodeKota;
    }

    public int getOngkir() {
        return ongkir;
    }

    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
    
    public void ongkirKota(){
        System.out.println("");
        Costumer.dataPelanggan();
    }

}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fety Fatimah
 */
public class costumer {
    private item Item;
    private String namaPelanggan, jenisKelamin, email;
    private int kodePelanggan, noTelp;

    public costumer(item Item, String namaPelanggan, String jenisKelamin, String email, int kodePelanggan, int noTelp) {
        this.Item = Item;
        this.namaPelanggan = namaPelanggan;
        this.jenisKelamin = jenisKelamin;
        this.email = email;
        this.kodePelanggan = kodePelanggan;
        this.noTelp = noTelp;
    }

    public item getItem() {
        return Item;
    }

    public void setItem(item Item) {
        this.Item = Item;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(int kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
    
    public void dataPelanggan(){
        System.out.println("Kode Pelanggan : "+kodePelanggan);
        System.out.println("Nama Pelanggan : "+namaPelanggan);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Email : "+email);
        System.out.println("No Telepon : "+noTelp);
        Item.tampilData();
    }
    
    
}

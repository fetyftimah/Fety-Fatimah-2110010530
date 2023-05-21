/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.pemesanan;
import model.costumer;
import model.item;

/**
 *
 * @author Fety Fatimah
 */
public class dataPemesanan {
    public static void main(String[] args){
        item b1 = new item (1, 10000, 1, "Undangan", "pcs");
        costumer p1= new costumer (b1, "Fety","Perempuan", "fety@gmail.com", 1, 1);
        pemesanan pmsn = new pemesanan(1, 10);
        pmsn.tambahPelanggan(p1);
        pmsn.lihatPelanggan();  
    }
    
}

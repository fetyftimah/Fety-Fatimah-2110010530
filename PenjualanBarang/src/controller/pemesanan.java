/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.costumer;

/**
 *
 * @author Fety Fatimah
 */
public class pemesanan {
    private int noPemesanan, index;
    private costumer[] Costumer;
    
    public void lihatPelanggan(){
        System.out.println("No Pemesanan : "+noPemesanan);
        System.out.println("");
        for(int i = 0; i<=index; i++){
            Costumer[i].dataPelanggan();
        }
    }
    
    public costumer hapusPelanggan(){
        costumer temp = Costumer[index];
        index = index - 1;
        return temp;
    }
    
    public void tambahPelanggan(costumer x){
        index = index + 1;
        Costumer [index] = x;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import penjualan.Item;

/**
 *
 * @author Fety Fatimah
 */
public class datasetitem {
//    private ArrayList<Integer> itemCode;
//    private ArrayList<String> itemName;
    private ArrayList<Item> items;

    public datasetitem(){
        items = new ArrayList<>();
    }
    
    public void addItem(Item value){
        this.items.add(value);
    }
    
    public ArrayList<Item> getItems(){
        return this.items;
    }
    
    
}

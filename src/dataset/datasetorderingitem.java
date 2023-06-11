/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Fety Fatimah
 */
public class datasetorderingitem {
    
    private ArrayList<Integer> orderNo;
    private ArrayList<Integer> itemCode;
    private ArrayList<Integer> price;
    private ArrayList<Integer> total;

    public datasetorderingitem() {
        orderNo = new ArrayList<>();
        itemCode = new ArrayList<>();
        price = new ArrayList<>();
        total = new ArrayList<>();
    }
    
    public void addOrderNo(int value){
        this.orderNo.add(value);
    }
    
    public ArrayList<Integer> getOrderNo(){
        return this.orderNo;
    }
    
    public void addItemCode(int value){
        this.itemCode.add(value);
    }
    
    public ArrayList<Integer> getItemCode(){
        return this.itemCode;
    }
    
    public void addPrice(int value){
        this.price.add(value);
    }
    
    public ArrayList<Integer> getPrice(){
        return this.price;
    }
    
    public void addTotal(int value){
        this.total.add(value);
    }
    
    public ArrayList<Integer> getTotal(){
        return this.total;
    }
    
    //method
    public void addOrder(int orderNo, int itemCode, int price, int total){
        addOrderNo(orderNo);
        addItemCode(itemCode);
        addPrice(price);
        addTotal(total);
    }
    
    
}

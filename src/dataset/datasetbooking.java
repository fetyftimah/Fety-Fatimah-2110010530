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
public class datasetbooking {
    private ArrayList<Integer> orderNo;
    private ArrayList<Integer> customerCode;
    private ArrayList<String> receiverName;
    private ArrayList<String> address;
    private ArrayList<Integer> cityCode;
    private ArrayList<Integer> postCode;
    private ArrayList<Integer> telp;
    private ArrayList<String> paidState;
    private ArrayList<String> sendingState;

    public datasetbooking() {
        orderNo = new ArrayList<>();
        customerCode = new ArrayList<>();
        receiverName = new ArrayList<>();
        address = new ArrayList<>();
        cityCode = new ArrayList<>();
        postCode = new ArrayList<>();
        telp = new ArrayList<>();
        paidState = new ArrayList<>();
        sendingState = new ArrayList<>();
    }
    
    public void addOrderNo(int value){
        this.orderNo.add(value);
    }
    
    public ArrayList<Integer> getOrderNo(){
        return this.orderNo;
    }
    
    public void addCustomerCode(int value){
        this.customerCode.add(value);
    }
    
    public ArrayList<Integer> getCustomerCode(){
        return this.customerCode;
    }
    
    public void addReceiverName(String value){
        this.receiverName.add(value);
    }
    
    public ArrayList<String> getReceiverName(){
        return this.receiverName;
    }

    public void addAddress(String value){
        this.address.add(value);
    }
    
    public ArrayList<String> getAddress(){
        return this.address;
    }

    public void addCityCode(int value){
        this.cityCode.add(value);
    }
    
    public ArrayList<Integer> getCityCode(){
        return this.cityCode;
    }

    public void addPostCode(int value){
        this.postCode.add(value);
    }
    
    public ArrayList<Integer> getPostCode(){
        return this.postCode;
    }

    public void addTelp(int value){
        this.telp.add(value);
    }
    
    public ArrayList<Integer> getTelp(){
        return this.telp;
    }

    public void addPaidState(String value){
        this.paidState.add(value);
    }
    
    public ArrayList<String> getPaidState(){
        return this.paidState;
    }
    
    public void addSendingState(String value){
        this.sendingState.add(value);
    }
    
    public ArrayList<String> getSendingState(){
        return this.sendingState;
    }
    
    //method
    public void addBooking(int orderNo, int customerCode, String receiverName, String address, int cityCode, int postCode, int telp, String paidState, String sendingState){
        addOrderNo(orderNo);
        addCustomerCode(customerCode);
        addReceiverName(receiverName);
        addAddress(address);
        addCityCode(cityCode);
        addPostCode(postCode);
        addTelp(telp);
        addPaidState(paidState);
        addSendingState(sendingState);
    }
}

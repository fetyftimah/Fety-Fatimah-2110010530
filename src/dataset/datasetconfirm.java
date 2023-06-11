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
public class datasetconfirm {
    private ArrayList<Integer> orderNo;
    private ArrayList<Integer> customerCode;
    private ArrayList<String> customerName;
    private ArrayList<String> bank;
    private ArrayList<Integer> senderAccount;
    private ArrayList<String> name;
    private ArrayList<Integer> transferAmount;
    private ArrayList<String> desc;

    public datasetconfirm() {
    orderNo = new ArrayList<>();
    customerCode = new ArrayList<>();
    customerName = new ArrayList<>();
    bank = new ArrayList<>();
    senderAccount = new ArrayList<>();
    name = new ArrayList<>();
    transferAmount = new ArrayList<>();
    desc = new ArrayList<>();
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

    public void addCustomerName(String value){
        this.customerName.add(value);
    }
    
    public ArrayList<String> getCustomerName(){
        return this.customerName;
    }
    
    public void addBank(String value){
        this.bank.add(value);
    }
    
    public ArrayList<String> getBank(){
        return this.bank;
    }

    public void addSenderAccount(int value){
        this.senderAccount.add(value);
    }
    
    public ArrayList<Integer> getSenderAccount(){
        return this.senderAccount;
    }

    public void addName(String value){
        this.name.add(value);
    }
    
    public ArrayList<String> getName(){
        return this.name;
    }

    public void addTransferAmount(int value){
        this.transferAmount.add(value);
    }
    
    public ArrayList<Integer> getTransferAmount(){
        return this.transferAmount;
    }

    public void addDesc(String value){
        this.desc.add(value);
    }
    
    public ArrayList<String> getDesc(){
        return this.desc;
    }
    
    //method
    public void addConfirm(int orderNo, int customerCode, String customerName, String bank, int senderAccount, String name, int transferAmount, String desc){
        addOrderNo(orderNo);
        addCustomerCode(customerCode);
        addCustomerName(customerName);
        addBank(bank);
        addSenderAccount(senderAccount);
        addName(name);
        addTransferAmount(transferAmount);
        addDesc(desc);
    }
}

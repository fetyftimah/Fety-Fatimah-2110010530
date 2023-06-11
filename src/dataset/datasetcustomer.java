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
public class datasetcustomer {
    private ArrayList<Integer> customerCode;
    private ArrayList<String> customerName;
    private ArrayList<String> gender;
    private ArrayList<Integer> telp;
    private ArrayList<String> email;
    private ArrayList<String> password;
    private ArrayList<Integer> code;

    public datasetcustomer() {
        customerCode = new ArrayList<>();
        customerName = new ArrayList<>();
        gender = new ArrayList<>();
        telp = new ArrayList<>();
        email = new ArrayList<>();
        password = new ArrayList<>();
        code = new ArrayList<>();
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
    
    public void addGender(String value){
        this.gender.add(value);
    }
    
    public ArrayList<String> getGender(){
        return this.gender;
    }

    public void addTelp(int value){
        this.telp.add(value);
    }
    
    public ArrayList<Integer> getTelp(){
        return this.telp;
    }

    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getEmail(){
        return this.email;
    }

    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
        return this.password;
    }
    
    public void addCode(int value){
        this.code.add(value);
    }
    
    public ArrayList<Integer> getCode(){
        return this.code;
    }

    //method
    public void addCustomer(int customerCode, String customerName, String gender, int telp, String email, String password, int code){
        addCustomerCode(customerCode);
        addCustomerName(customerName);
        addGender(gender);
        addTelp(telp);
        addEmail(email);
        addPassword(password);
        addCode(code);
    }
    
}

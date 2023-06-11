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
public class datasetcity {
    private ArrayList<Integer> cityCode;
    private ArrayList<String> cityName;
    private ArrayList<Integer> shippingCost;

    public datasetcity() {
        cityCode = new ArrayList<>();
        cityName = new ArrayList<>();
        shippingCost = new ArrayList<>();
    }
    
    public void addCityCode(int value){
        this.cityCode.add(value);
    }
    
    public ArrayList<Integer> getCityCode(){
        return this.cityCode;
    }
    
    public void addCityName(String value){
        this.cityName.add(value);
    }
    
    public ArrayList<String> getCityName(){
        return this.cityName;
    }
   
    public void addShippingCost(int value){
        this.shippingCost.add(value);
    }
    
    public ArrayList<Integer> getShippingCost(){
        return this.shippingCost;
    }

    //method
    public void addCity(int cityCode, String cityName, int shippingCost){
        addCityCode(cityCode);
        addCityName(cityName);
        addShippingCost(shippingCost);
    }
    
}

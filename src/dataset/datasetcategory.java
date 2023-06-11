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
public class datasetcategory{
    private ArrayList<Integer> categoryCode;
    private ArrayList<String>  categoryName;

    public datasetcategory(){
        categoryCode = new ArrayList<>();
        categoryName = new ArrayList<>();
    }
    
    public void addCategoryCode(int value){
        this.categoryCode.add(value);
    }
    
    public ArrayList<Integer> getCategoryCode(){
        return this.categoryCode;
    }
    
    public void addCategoryName(String value){
        this.categoryName.add(value);
    }
    
    public ArrayList<String> getCategoryName(){
        return this.categoryName;
    }
    
    //method
    public void addCategory(int categoryCode, String categoryName){
        addCategoryCode(categoryCode);
        addCategoryName(categoryName);        
    }
    
    
}

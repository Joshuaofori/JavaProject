/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork1;

/**
 *
 * @author anhydrous
 */
public class Drink {
    
    private String name;
    private float purchasePrice;
    private double alcoholLevel;
    private  int quantity;
    private float sellingPrice ;
    
    public Drink(){
        
    }
    public Drink( String name, float purchaseprice, double alcoholLevel, int quantity){
        this.purchasePrice = purchaseprice;
        this.name = name;
        this.alcoholLevel= alcoholLevel;
        this.quantity = quantity;
        sellingPrice = 0;
        
    }
    public String getName(){
        return name;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getAlcoholLevel() {
        return alcoholLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlcoholLevel(double alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    } 

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getSellingPrice(){
        return sellingPrice;
    }
    public void setSellingPrice(float sellingPrice){
        this.sellingPrice = sellingPrice;
    }
    
}

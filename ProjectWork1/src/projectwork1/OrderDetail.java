/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork1;

import java.util.ArrayList;

/**
 *
 * @author anhydrous
 */
public class OrderDetail {
    ArrayList<Drink> drinks;
    private float totalPrice =0;

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void addDrinks(Drink drink) {
        drinks.add(drink);
        totalPrice+=drink.getPurchasePrice();
    }
    
    public float getPrice(){
        return totalPrice;
    }
    
}

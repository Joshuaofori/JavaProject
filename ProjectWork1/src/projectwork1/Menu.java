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
public class Menu {
     Stock stock;
public Menu(Stock stock){
        this.stock= stock;
    }
    public ArrayList<Drink> getDrinks() {
        return stock.getDrinks();
    }

    
    @Override
    public String toString(){
       String list="";
       int count = 0;
        for(Drink drink : getDrinks()){
            count++;
                if(drink.getSellingPrice()!= 0&&drink.getQuantity()>0){
            list+= String.valueOf(count)+" "+ drink.getName()+" Price: "+drink.getSellingPrice()+ " Alcohol Level "+drink.getAlcoholLevel()+"\n";
                }
            
        }
        return list;
    }
}

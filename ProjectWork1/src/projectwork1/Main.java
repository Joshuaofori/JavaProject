


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
public class Main {
    public static void main(String args[]){
        Stock stock = new Stock();
        Supplier supplier = new Supplier("josh",stock);
        Bartender barman = new Bartender("kwaku");
        
        supplier.addDrink("cocacola",2,2.4,20);
        supplier.addDrink("PepSi",2,2.4,20);
         supplier.addDrink("cocala",2,2.4,20);
        supplier.addDrink("PepSi",2,2.4,20);
        
        System.out.println(stock.toString());
        System.out.println("new line");
        barman.addSellingPriceOne(5,"cocacola",stock);
        Menu menu = new Menu(stock);
        System.out.println(menu.toString());
    }
    
}

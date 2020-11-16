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
public class Bartender extends Human {

    Boss boss;
    Client client;
    
    public Bartender(String firstName) {
        super(firstName);
      
    }
    public void pay(){
    
    }
    
   public void drink(){
        
    }

    @Override
    public void talk() {
        
    }
    
    public void getCommand(){
        
        
    }
    
//   public void addSellingPriceAll(float price,Stock stock){
//       stock.addSellingPriceForAll(price);
//   }
    
    public void addSellingPriceOne(float price,String name,Stock stock){
       stock.addSellingPriceForOne(price,name);
   }
    
}

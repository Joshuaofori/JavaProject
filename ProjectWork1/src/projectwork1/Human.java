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
public  abstract class Human {
     final private String firstName;
     private String nickName;
     private int popularity;
     private int wallet;
     private String cry;
     
     public enum sex{
         MALE,
         FEMALE
     }
      public Human(String firstName){
         this.firstName = firstName;
     }
     
     
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }
     
    
    public abstract  void talk();
    public void drink(){
        
    }
    public void pay(){
        
    }
    public void present(){
        
    }
    public void giveDrink(){
        
    }
     
}

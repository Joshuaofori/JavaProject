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
public class Client extends Human {
    private String favouriteDrink;
    private String favouriteDrink2;
    private int alcoholLevel;
    private boolean posibility;
    
    public Client(String firstName){
        super(firstName);
    }

    @Override
    public void talk() {
        
    }
    public void present(){
        
    }

    public String getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }

    public String getFavouriteDrink2() {
        return favouriteDrink2;
    }

    public void setFavouriteDrink2(String favouriteDrink2) {
        this.favouriteDrink2 = favouriteDrink2;
    }

    public int getAlcoholLevel() {
        return alcoholLevel;
    }

    public void setAlcoholLevel(int alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    }

    public boolean isPosibility() {
        return posibility;
    }

    public void setPosibility(boolean posibility) {
        this.posibility = posibility;
    }
}


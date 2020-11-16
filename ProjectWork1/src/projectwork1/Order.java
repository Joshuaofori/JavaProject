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
public class Order {
    private int orderId;
    private Table table;
    private Client client;
    private OrderDetail orderdetail;
    
    
    public Order(Client client, int orderId){
        this.client = client;
        this.orderId = orderId;
        
        
    }
    
}

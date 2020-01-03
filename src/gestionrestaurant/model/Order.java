/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrestaurant.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Order {

    public Order() {
    }
    
    private int id;

    public Order(int id) {
        this.id = id;
    }
    
    public List<OrderLine> getOrderLines() {
        //TODO
        return new ArrayList<OrderLine>();
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

}

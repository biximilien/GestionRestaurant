/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqo.gestionrestaurant.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxime 'biximilien' Gauthier
 */
public class Menu {

    private int id;

    public Menu(int id) {
        this.id = id;
    }

    public Menu() {
    }

    public List<MenuItem> getMenuItems() {
        //TODO
        return new ArrayList<MenuItem>();
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

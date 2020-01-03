/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqo.gestionrestaurant.model;

/**
 *
 * @author Maxime 'biximilien' Gauthier
 */
public class OrderLine {

    public OrderLine() {
    }

    public OrderLine(int id, int menuItemId) {
        this.id = id;
        this.menuItemId = menuItemId;
    }

    private int id;
    private int menuItemId;

    /**
     * Get the value of menuItemId
     *
     * @return the value of menuItemId
     */
    public int getMenuItemId() {
        return menuItemId;
    }

    /**
     * Set the value of menuItemId
     *
     * @param menuItemId new value of menuItemId
     */
    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
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

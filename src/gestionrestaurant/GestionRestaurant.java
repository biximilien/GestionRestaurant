/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrestaurant;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gaum73
 */
public class GestionRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GestionRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GestionRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GestionRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ArchiveGUI().setVisible(true);
        new TabGUI().setVisible(true);
        new OrderGUI().setVisible(true);
    }
}

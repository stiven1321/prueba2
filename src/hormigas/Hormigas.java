/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hormigas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author julian
 */
public class Hormigas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Ventana v = new Ventana();
        f.add(v,BorderLayout.CENTER);
        f.setSize(500, 500);
        f.setVisible(true);
        v.iniciar();
    }
    
}

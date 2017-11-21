/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hormigas;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author julian
 */
public class Ventana extends Canvas {

    Hormiga h[];
    
    public Ventana() {
        h = new Hormiga[100];
        for (int i = 0;i<100;i++) {
            h[i] = new Hormiga();
        }
    }
    
    public void iniciar(){
        for (Hormiga hormiga : h) {
            new Thread(hormiga).start();    
        }
    }
    
    public void paint(Graphics g){
        for (Hormiga hormiga : h) {
            hormiga.pintar(g, this);    
        }
        repaint();
    }
}

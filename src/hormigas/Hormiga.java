/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hormigas;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author julian
 */
public class Hormiga implements Runnable{

    private BufferedImage img;
    int x = 0, y = 0;

    public Hormiga() {
        try {
            img = ImageIO.read(new File("C:\\Users\\chesp\\Desktop\\Eclipse\\Huracan-1\\src\\Imagenes\\Persona.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void pintar(Graphics g, Canvas c) {
        g.drawImage(img, x, y,10,10, c);
    }

    @Override
    public void run() {
        Random r = new Random();
        while(true){
            x = (x<=0)?1:x+(6-r.nextInt(10));
            y = (y<=0)?1:y+(6-r.nextInt(10));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}

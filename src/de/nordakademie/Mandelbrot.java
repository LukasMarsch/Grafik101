package de.nordakademie;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Mandelbrot extends JComponent {

    BufferedImage mandelPuffer;

    public Mandelbrot() {
        this.mandelPuffer = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        this.render();
    }

    @Override
    public void paint(Graphics g) {
        this.render();
        g.drawImage(mandelPuffer, 0, 0, null);
    }

    public void render() {
        for (int height = 0; height < Main.WIDTH/2; height++) {
            for (int width = 0; width < Main.HEIGHT/2; width++) {
                var v = mandelbrot(width-250, height-250);
                var vl = v.length();
                int color;
                if (vl > 2) color = 0xffffff;
                else color = 0x000000;
                mandelPuffer.setRGB(width, height, color);
            }
        }
    }

    private double square (double x, double y){
        return Math.pow(x, 2.0) - Math.pow(y, 2.0);
    }

    private Vector mandelbrot(double x, double y) {
        float z = 0;
        var v = new Vector(x, y);
        int i;
        for (i = 0; i < 255; i++) {
            var nv = new Vector(square(v.getX(), v.getY()), v.getX()*v.getY());
                if(v.getX() > 2 || v.getY() > 2) break;
                if(v.getY() == 0.0 && v.getX() == 0.0) break;
            v = nv;
        }
        return v;
    }
}

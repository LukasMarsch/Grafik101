package de.nordakademie;

import javax.swing.*;

public class Main {
    static int WIDTH = 1000;
    static int HEIGHT = 1000;



    public static void main(String[] args) {

        JFrame frame = new JFrame("Grafika 101");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(true);
        Mandelbrot m = new Mandelbrot();
        frame.getContentPane().add(m);
        frame.setVisible(true);
    }
}
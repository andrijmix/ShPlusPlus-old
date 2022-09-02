package com.shpp.p2p.cs.amikhnevych.assignment3;


import acm.graphics.GObject;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


/* TODO:
Part 4 - Pyramid
It will be necessary to make a pyramid of brick. Leather row should be 1 less brick.
The pyramid can be centered horizontally and lie on the “days” of the window.
Constants — BRICK_HEIGHT, BRICK_WIDTH, BRICKS_IN_BASE
 */
public class Assignment3Part4 extends WindowProgram {
    public static final double BRICK_HEIGHT = 6.5;
    public static final double BRICK_WIDTH = 25;
    public static final int BRICKS_IN_BASE = 25;

    public void run() {
        int base = BRICKS_IN_BASE;  // local variable
        int x_start = (int) (getWidth() / 2 - (base * BRICK_WIDTH) / 2);  //start on Ox
        int y_start = (int) (getHeight() - BRICK_HEIGHT);                 // start on Oy


        for (int i = 0; i < BRICKS_IN_BASE; i++) {
            buildRowOfWall(x_start, y_start, base);
            base--;  //There will be one less brick in the new row
            x_start = (int) (getWidth() / 2 - (base * BRICK_WIDTH) / 2); //center the new line Ox
            y_start -= BRICK_HEIGHT;                 //center the new line Oy

        }


    }

    /**
     * Build row of wall brick
     *
     * @param x_start - Ox  coordinate
     * @param y_start - Oy  coordinate
     * @param base    - count brick in line
     */
    private void buildRowOfWall(int x_start, int y_start, int base) {

        for (int i = 0; i < base; i++) {
            add(buildRect(x_start, y_start, BRICK_WIDTH, BRICK_HEIGHT));
            x_start += BRICK_WIDTH;
        }

    }


    /**
     * Create the GObject for rectangle
     *
     * @param x1 - Ox  coordinate
     * @param y1 - Oy  coordinate
     * @param x2 - length firs side
     * @param y2 - length second side
     * @return the GObject
     */
    private GObject buildRect(int x1, int y1, double x2, double y2) {
        GRect rect = new GRect(x1, y1, x2, y2);
        rect.setFillColor(Color.ORANGE);
        rect.setFilled(true);
        rect.setColor(Color.BLACK);
        return rect;
    }

}
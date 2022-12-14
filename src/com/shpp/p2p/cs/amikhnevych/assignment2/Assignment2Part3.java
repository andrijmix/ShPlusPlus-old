package com.shpp.p2p.cs.amikhnevych.assignment2;

/* TODO:
The general idea is to fill the empty method drawPawprint(double x, double y) with code

The coolness of the code is that there are a lot of constants in it, and you need to remember to use all of them
 */

import acm.graphics.GObject;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


public class Assignment2Part3 extends WindowProgram {
    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    /* The default width and height of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * //+----------------------------------------------------------------------------+
     * //|  Description: Draws a paw print. The parameters should specify             |
     * //|               the upper-left corner of the                                 |
     * //                * bounding box containing that paw print.                    |
     * //+----------------------------------------------------------------------------+
     * //|  Parameters :                                                              |
     * //|    x - the x coordinate of the upper-left corner                           |
     * //|        of the bounding box for the paw print.                              |
     * //|    y - the y coordinate of the upper-left corner                           |
     * //|        of the bounding box for the paw print.                              |
     * //+----------------------------------------------------------------------------+
     */
    private void drawPawprint(double x, double y) {
        //FIRST toe
        add(BuildToe(x, y, FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y));
        //SECOND toe
        add(BuildToe(x, y, SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y));
        //THIRD toe
        add(BuildToe(x, y, THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y));

        // Draw heel
        double x1 = x + HEEL_OFFSET_X;
        double y1 = y + HEEL_OFFSET_Y;
        GOval oval = new GOval(x1, y1, HEEL_WIDTH, HEEL_HEIGHT);
        add(oval);
        oval.setFillColor(Color.BLACK);
        oval.setFilled(true);
    }

    /**
     * //+----------------------------------------------------------------------------+
     * //|  Description: This method return  object type Oval and fill it color       |
     * //+----------------------------------------------------------------------------+
     * //|  Parameters :                                                              |
     * //|    x1 - Ox  coordinate                                                     |
     * //|    y1 - Oy  coordinate                                                     |
     * //|    ToeOffsetX - Ox offset                                                  |
     * //|    ToeOffsetY - OY offset                                                  |
     * //+----------------------------------------------------------------------------+
     */
    private GObject BuildToe(double x, double y, double ToeOffsetX, double ToeOffsetY) {

        double x1 = x + ToeOffsetX;
        double y1 = y + ToeOffsetY;
        GOval oval = new GOval(x1, y1, TOE_WIDTH, TOE_HEIGHT);

        oval.setFillColor(Color.BLACK);
        oval.setFilled(true);
        return oval;
    }
}

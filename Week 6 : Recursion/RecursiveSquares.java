/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.awt.Color;

public class RecursiveSquares {

    // Draws a square centered on (x, y) of the given side length
    // with a light gray background and a black border.
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(Color.lightGray);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(Color.black);
        StdDraw.square(x, y, length / 2);
    }

    // Draws a recursive square pattern of order n, centered on (x, y)
    // of the given side length.
    public static void draw(int n, double x, double y, double length) {
        if (n == 1) {
            drawSquare(x, y, length);
            return;
        }
        // Draws top left corner
        draw(n - 1, x - (length / 2), y + length / 2, length / 2);
        // Draws top right corner
        draw(n - 1, x + (length / 2), y + length / 2, length / 2);
        // Draws middle square
        drawSquare(x, y, length);
        // Draws bottom left corner
        draw(n - 1, x - (length / 2), y - length / 2, length / 2);
        // Draws bottom right corner
        draw(n - 1, x + (length / 2), y - length / 2, length / 2);
    }

    // Takes an integer command-line argument n and draws a recursive
    // square pattern of order n, centered on (0.5, 0.5) with side length 0.5.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}

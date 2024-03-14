/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        double lengthOfEachSquare = 1.0 / n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    StdDraw.setPenColor(Color.LIGHT_GRAY);
                }
                else {
                    StdDraw.setPenColor(Color.BLUE);
                }
                double xCenterOfSquare = (double) i / n + lengthOfEachSquare / 2;
                double yCenterOfSquare = (double) j / n + lengthOfEachSquare / 2;
                StdDraw.filledSquare(xCenterOfSquare, yCenterOfSquare, lengthOfEachSquare / 2);
            }
        }
    }
}

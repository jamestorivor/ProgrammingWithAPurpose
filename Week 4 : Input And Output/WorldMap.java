/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        int xBound = StdIn.readInt();
        int yBound = StdIn.readInt();
        StdDraw.setCanvasSize(xBound, yBound);
        StdDraw.setXscale(0, xBound);
        StdDraw.setYscale(0, yBound);
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] xCoords = new double[vertices];
            double[] yCoords = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                xCoords[i] = StdIn.readDouble();
                yCoords[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCoords, yCoords);
        }
    }
}

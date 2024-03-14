/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {

        double entropy = 0.0;
        int n = Integer.parseInt(args[0]);
        int[] data = new int[n + 1];
        int numberOfIntegers = 0;
        while (!StdIn.isEmpty()) {
            int val = StdIn.readInt();
            data[val] += 1;
            numberOfIntegers += 1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                continue;
            }
            double pi = (double) data[i] / numberOfIntegers;
            entropy += -(pi * Math.log(pi) / Math.log(2));
        }
        StdOut.printf("%.4f\n", entropy);
    }
}

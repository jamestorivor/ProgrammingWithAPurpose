/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RevesPuzzle {
    public static void Reves(int n, String from, String to, String inter1, String inter2) {
        if (n == 1) {
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            return;
        }
        else if (n == 2) {
            System.out.println("Move disc " + (n - 1) + " from " + from + " to " + inter1);
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            System.out.println("Move disc " + (n - 1) + " from " + inter1 + " to " + to);
            return;

        }
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
        Reves(k, from, inter1, to, inter2);
        Hanoi(n, k, from, inter2, to);
        Reves(k, inter1, to, from, inter2);
    }


    private static void Hanoi(int n, int k, String from, String intermediate, String to) {
        if (n == k) {
            return;
        }
        Hanoi(n - 1, k, from, to, intermediate);
        System.out.println("Move disc " + n + " from " + from + " to " + to);
        Hanoi(n - 1, k, intermediate, from, to);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Reves(n, "A", "D", "B", "C");
    }
}

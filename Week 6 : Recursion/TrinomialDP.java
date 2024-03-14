/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class TrinomialDP {

    private static int convertjTok(int j, int n) {
        if (j < n + 1) {
            return -(n + 1 - j);
        }
        else if (j == n + 1) {
            return 0;
        }
        else {
            return j - (n + 1);
        }

    }

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        long[][] cache = new long[n + 1][2 * (n + 1) + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 1; j < 2 * n + 2; j++) {
                if (convertjTok(j, n) < -i || convertjTok(j, n) > i) {
                    cache[i][j] += 0;
                }
                else if (i == 0 && convertjTok(j, n) == 0) {
                    cache[i][j] += 1;
                }
                else {
                    cache[i][j] += cache[i - 1][j - 1] + cache[i - 1][j] + cache[i - 1][j + 1];
                }
            }
        }
        return cache[n][k + n + 1];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}

package Backtracking;

public class gridWays {
    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(countways(0, 0, n, m));
    }

    private static int countways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = countways(i + 1, j, n, m);
        int w2 = countways(i, j + 1, n, m);
        return w1 + w2;
    }
}

package algs4.exercise;

import edu.princeton.cs.algs4.StdOut;

public class E1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
    /**
     * output:
     * r f g
     * 0 1 0
     * 1 1 1
     * 1 2 1
     * 2 3 2
     * 3 5 3
     * 5 8 5
     * 8 13 8
     * 13 21 13
     * 21 34 21
     * 34 55 34
     * 55 89 55
     * 89 144 89
     * 144 233 144
     * 233 377 233
     * 377 610 377
     * 610 987 610
     */
}

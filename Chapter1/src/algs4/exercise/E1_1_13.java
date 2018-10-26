package algs4.exercise;

import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class E1_1_13 {
    private static final int M = 3;
    private static final int N = 4;

    public static void main(String[] args) {
        Random random = new Random(47);
        int[][] ints = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ints[i][j] = random.nextInt(50);
                StdOut.print(ints[i][j] + "\t");
            }
            StdOut.println();
        }
        twoDimensionTransposition(ints);
    }

    /**
     * 编写一段代码,打印出一个M行N列的二维数组的转置(交换行和列)
     * @param ele
     */
    public static void twoDimensionTransposition(int[][] ele) {
        StdOut.println("========twoDimensionTransposition========");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                StdOut.print(ele[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}

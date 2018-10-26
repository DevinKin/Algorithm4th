package algs4.exercise;

import edu.princeton.cs.algs4.StdOut;

public class E1_1_11 {
    public static void main(String[] args) {
        boolean[][] bs = new boolean[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        bs[i][j] = true;
                    } else {
                        bs[i][j] = false;
                    }
                } else {
                    bs[i][j] = false;
                }
            }
        }
        printTwoDimension(bs);
    }

    /**
     * 打印一个二维布尔数组的内容,其中,用*表示为真,用-表示为假
     * @param bs
     */
    public static void printTwoDimension(boolean[][] bs) {
        // print line num
        for (int i = 0; i < bs[0].length; i++) {
            StdOut.print("\t");
            StdOut.print(i + 1);
        }
        StdOut.println();
        for (int i = 0; i < bs.length; i++) {
            for (int j = 0; j < bs[i].length; j++) {
                if (j == 0) {
                    StdOut.print(i + 1);
                }
                StdOut.print("\t");
                StdOut.print(bs[i][j] ? "*" : "-");
            }
            StdOut.println();
        }
    }
}

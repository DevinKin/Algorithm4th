package algs4.exercise;

import edu.princeton.cs.algs4.StdOut;

public class E1_1_14 {
    public static void main(String[] args) {
        int N = 1;
        StdOut.println(lg(N));
    }

    /**
     * 编写一个静态方法lg(),接受一个整形参数N,返回不大于log2N的最大整数,不要使用Math库
     * @param N
     * @return
     *
     */
    public static int lg(int N) {
        int counter = 0;
        while (N / 2 != 0) {
            counter++;
            N /= 2;
        }
        return counter;
    }
}

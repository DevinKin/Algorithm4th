package algs4.code;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class DoublingTest {
    public static double timeTrial(int N) {
        // 为处理N个随机的六位整数的ThreeeSun.count()计时
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        StopWatch timer = new StopWatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }
    public static void main(String[] args) {
        // 打印运行时间的表格
        for (int N = 250; true; N += N) {
            // 打印问题规模为N时候的程序
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }
}

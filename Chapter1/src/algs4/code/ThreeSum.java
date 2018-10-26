package algs4.code;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSum {
    public static int count(int[] a) {
        // 统计和为0的元祖的数量
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            // N times
            for (int j = i + 1; j < N; j++) {
                // N-1 times
                for (int k = j + 1; k < N; k++) {
                    // N-2 times
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StopWatch timer = new StopWatch();
        StdOut.println(count(a));
        double time =timer.elapsedTime();
        StdOut.printf("time: %5.5f s\n", time );
    }
}

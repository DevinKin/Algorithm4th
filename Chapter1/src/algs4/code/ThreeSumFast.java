package algs4.code;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ThreeSumFast {

    public static int count(int[] a) {
        // 计算和为0的三元组的数目
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (BinarySearch.rank(-a[i]-a[j], a) > j) {
                    cnt++;
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

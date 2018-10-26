package algs4.code;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class StopWatchTest {
    public static void main(String[] args) {
        int N =  Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000, 1000000);
        }
        StopWatch timer = new StopWatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(cnt + " triples " + time + " seconds");
    }
}



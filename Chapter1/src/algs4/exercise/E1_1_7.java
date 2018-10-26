package algs4.exercise;

import edu.princeton.cs.algs4.StdOut;

public class E1_1_7 {
    public static void main(String[] args) {
        // output:3.00009
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t =  (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        // output:(0+999)*1000/2,等差数列求和
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        // output:10000,外层是2的0次方到2的10次方,循环10次
        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum2++;
            }
        }
        System.out.println(sum2);
    }
}

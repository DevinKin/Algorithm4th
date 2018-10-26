package algs4.exercise;

import edu.princeton.cs.algs4.StdIn;

public class E1_1_5 {
    public static void main(String[] args) {

        while (!StdIn.isEmpty()) {
            double d = StdIn.readDouble();
            if (d > 0.0 && d < 1.0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

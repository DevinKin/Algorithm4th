package algs4.exercise;

public class E1_1_9 {
    public static void main(String[] args) {
        int i = 23;
        System.out.println(toBinaryString(i));

    }

    public static String toBinaryString(int N) {
        String s = "";
        while (N > 0) {
            s = (N % 2) + s;
            N /= 2;
        }
        return s;
    }
}

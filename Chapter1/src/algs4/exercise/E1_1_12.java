package algs4.exercise;

public class E1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        // 0 1 2 3 4 4 3 2 1 0
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        // 9 8 7 6 5 4 3 2 1 0
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        // 0 1 2 3 4 4 3 2 1 0
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}

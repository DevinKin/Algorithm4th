package algs4.exercise;

public class E1_1_3 {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);

        if (a1 == a2) {
            if (a2 == a3) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } else {
            System.out.println("not equal");
        }
    }
}

package algs4.exercise;

import java.util.*;

public class E1_1_15 {
    private static final int N = 20;
    public static void main(String[] args) {
        int[] a = new int[N];
        Random random = new Random(77);
        for (int i = 0; i < 20; i++) {
            a[i] = random.nextInt(N);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("===============");
        System.out.println(Arrays.toString(histogram(a, N)));
    }

    public static int[] histogram(int a[], int M) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int[] res = new int[M];
        for (int i = 0; i < M; i++) {
            if (countMap.get(a[i]) == null) {
                // map中不存在,初始化出现次数为1
               countMap.put(a[i], 1);
            } else {
                countMap.put(a[i], countMap.get(a[i]) + 1);
            }
        }

        int cnt = 0;
        for ( Integer key : countMap.keySet()) {
            res[cnt] = countMap.get(key);
            cnt++;
        }
        return res;
    }
}

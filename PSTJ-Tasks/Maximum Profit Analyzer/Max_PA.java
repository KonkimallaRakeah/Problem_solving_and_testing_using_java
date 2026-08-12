import java.util.*;

public class Max_PA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}
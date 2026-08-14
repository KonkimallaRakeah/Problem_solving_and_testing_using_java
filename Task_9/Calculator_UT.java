import java.util.*;

public class Calculator_UT {
    static int add(int a, int b) {
        return a + b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int result = 0;
        int expected = 0;
        if (op.equals("+")) {
            result = add(a, b);
            expected = a + b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Test Failed");
                return;
            }
            result = divide(a, b);
            expected = a / b;
        }
        if (result == expected)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");
    }
}
import java.util.*;

public class Question17 {
    static void decimalToBinary(int n) {
        if (n == 0)
            return;
        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0)
            System.out.print(0);
        else
            decimalToBinary(n);
    }
}

import java.util.*;

public class Question11 {
    static int productOfDigits(int n) {
        if (n == 0)
            return 1;
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0)
            System.out.println(0);
        else
            System.out.println(productOfDigits(n));
    }
}

import java.util.*;

public class Question18 {
    static int binaryToDecimal(String s, int n) {
        if (n == 0)
            return 0;

        return binaryToDecimal(s, n - 1) * 2 + (s.charAt(n - 1) - '0');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(binaryToDecimal(s, s.length()));
    }
}

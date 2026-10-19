import java.util.*;

public class Question19 {
    static int countOccurrences(String s, char c, int index) {
        if (index == s.length())
            return 0;

        if (s.charAt(index) == c)
            return 1 + countOccurrences(s, c, index + 1);

        return countOccurrences(s, c, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(countOccurrences(s, c, 0));
    }
}

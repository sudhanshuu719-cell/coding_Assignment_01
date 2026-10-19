import java.util.*;

public class Question21 {
    static String replaceCharacter(String s, char c1, char c2) {
        if (s.length() == 0)
            return "";

        char ch = s.charAt(0);

        if (ch == c1)
            ch = c2;

        return ch + replaceCharacter(s.substring(1), c1, c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(replaceCharacter(s, c1, c2));
    }
}

import java.util.*;

public class Question20 {
    static String removeCharacter(String s, char c) {
        if (s.length() == 0)
            return "";

        if (s.charAt(0) == c)
            return removeCharacter(s.substring(1), c);

        return s.charAt(0) + removeCharacter(s.substring(1), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(removeCharacter(s, c));
    }
}

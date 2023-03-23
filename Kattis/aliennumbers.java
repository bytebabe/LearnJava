import java.util.*;

public class aliennumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        for (int j = 0; j < t; j++) {
            String[] s = input.nextLine().split(" ");
            String code = s[0];
            String lang = s[1];
            String newLang = s[2];
            System.out.printf("Case #%d: %s\n", j + 1, intToBase(baseToInt(code, lang), newLang));
        }
    }

    public static int baseToInt(String code, String lang) {
        int l = lang.length();
        int s = 0;
        int n = 0;
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < l; i++) {
            m.put(lang.charAt(i), i);
        }
        for (int i = code.length() - 1; i >= 0; i--) {
            s += m.get(code.charAt(i)) * Math.pow(l, n);
            n += 1;
        }
        return s;
    }

    public static String intToBase(int num, String lang) {
        List<Character> lst = new ArrayList<>();
        int l = lang.length();
        Map<Integer, Character> m = new HashMap<>();
        for (int i = 0; i < l; i++) {
            m.put(i, lang.charAt(i));
        }
        while (num > 0) {
            lst.add(0, m.get(num % l));
            num /= l;
        }
        StringBuilder result = new StringBuilder();
        for (Character c : lst) {
            result.append(c);
        }
        return result.toString();
    }
}
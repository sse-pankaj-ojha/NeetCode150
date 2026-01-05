package ArraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    static void main() {
        String  s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }


    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        Arrays.sort(chS);
        Arrays.sort(chT);

        return Arrays.equals(chS, chT);
    }
}

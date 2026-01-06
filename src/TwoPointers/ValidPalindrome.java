package TwoPointers;

//https://leetcode.com/problems/valid-palindrome/description/
//125. Valid Palindrome
public class ValidPalindrome {
    static void main() {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start = 0;
        int end  = str.length()-1;
        while(start <=end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}

package ArraysAndHashing;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
//49. Group Anagrams
public class GroupAnagrams {
    static void main() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key  = new String(ch);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        res.sort(Comparator.comparingInt(List::size));
        return res;
    }
}

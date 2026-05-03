package top150;

import java.util.*;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);

            if (map.containsKey(a)) {
                if (map.get(a) != b) return false;
            } else {
                if (used.contains(b)) return false;
                map.put(a, b);
                used.add(b);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings obj = new IsomorphicStrings();
        System.out.println(obj.isIsomorphic("egg", "add"));
    }
}
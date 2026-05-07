package top150;

import java.util.*;

public class SubstringConcatenation {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) return res;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

        Map<String, Integer> map = new HashMap<>();
        for (String w : words) map.put(w, map.getOrDefault(w, 0) + 1);

        for (int i = 0; i < s.length() - totalLen + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;

            while (j < words.length) {
                String word = s.substring(i + j * wordLen, i + (j + 1) * wordLen);

                if (!map.containsKey(word)) break;

                seen.put(word, seen.getOrDefault(word, 0) + 1);

                if (seen.get(word) > map.get(word)) break;

                j++;
            }

            if (j == words.length) res.add(i);
        }

        return res;
    }

    public static void main(String[] args) {
        SubstringConcatenation obj = new SubstringConcatenation();
        String[] words = {"foo","bar"};
        System.out.println(obj.findSubstring("barfoothefoobarman", words));
    }
}
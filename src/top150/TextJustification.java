package top150;

import java.util.*;

public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i, len = 0;

            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder();

            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } else {
                int spaces = (maxWidth - len) / gaps;
                int extra = (maxWidth - len) % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaceCount = spaces + (k - i < extra ? 1 : 0);
                        for (int s = 0; s < spaceCount; s++) line.append(" ");
                    }
                }
            }

            res.add(line.toString());
            i = j;
        }

        return res;
    }

    public static void main(String[] args) {
        TextJustification obj = new TextJustification();
        String[] words = {"This","is","an","example","of","text","justification."};

        List<String> res = obj.fullJustify(words, 16);
        for (String line : res) System.out.println(line);
    }
}
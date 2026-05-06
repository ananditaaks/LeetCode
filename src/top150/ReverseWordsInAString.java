package top150;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInAString obj = new ReverseWordsInAString();
        System.out.println(obj.reverseWords("  hello world  "));
    }
}
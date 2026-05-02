package top150;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') i--;

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord("Hello World"));
    }
}
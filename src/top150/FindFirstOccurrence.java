package top150;

public class FindFirstOccurrence {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindFirstOccurrence obj = new FindFirstOccurrence();
        System.out.println(obj.strStr("sadbutsad", "sad"));
    }
}
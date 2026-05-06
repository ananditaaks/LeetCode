package top150;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray())
            count[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) return false;
            count[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote obj = new RansomNote();
        System.out.println(obj.canConstruct("aa", "aab"));
    }
}
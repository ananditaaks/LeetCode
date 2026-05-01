package top150;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) return h;
        }
        return 0;
    }

    public static void main(String[] args) {
        HIndex obj = new HIndex();
        int[] citations = {3,0,6,1,5};
        System.out.println(obj.hIndex(citations));
    }
}
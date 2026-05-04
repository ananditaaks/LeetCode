package top150;

import java.util.*;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;

            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        System.out.println(obj.isHappy(19));
    }
}
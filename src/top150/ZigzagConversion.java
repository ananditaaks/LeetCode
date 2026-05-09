package top150;

import java.util.*;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currRow).append(c);

            if (currRow == 0 || currRow == numRows - 1)
                goingDown = !goingDown;

            currRow += goingDown ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);

        return res.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion obj = new ZigzagConversion();
        System.out.println(obj.convert("PAYPALISHIRING", 3));
    }
}
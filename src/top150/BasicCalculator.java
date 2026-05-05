package top150;

import java.util.*;

public class BasicCalculator {

    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0, number = 0, sign = 1;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }

            else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }

            else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }

            else if (c == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                sign = 1;
            }

            else if (c == ')') {
                result += sign * number;
                number = 0;

                result *= st.pop(); // sign
                result += st.pop(); // previous result
            }
        }

        return result + sign * number;
    }

    public static void main(String[] args) {
        BasicCalculator obj = new BasicCalculator();
        System.out.println(obj.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
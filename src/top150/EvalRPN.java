package top150;

import java.util.*;

public class EvalRPN {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (token.equals("-")) {
                int b = st.pop(), a = st.pop();
                st.push(a - b);
            } else if (token.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (token.equals("/")) {
                int b = st.pop(), a = st.pop();
                st.push(a / b);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        EvalRPN obj = new EvalRPN();
        String[] input = {"2","1","+","3","*"};
        System.out.println(obj.evalRPN(input));
    }
}
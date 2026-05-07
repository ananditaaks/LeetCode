package top150;

import java.util.*;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) continue;

            if (part.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(part);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String dir : st) {
            res.append("/").append(dir);
        }

        return res.length() == 0 ? "/" : res.toString();
    }

    public static void main(String[] args) {
        SimplifyPath obj = new SimplifyPath();
        System.out.println(obj.simplifyPath("/a/./b/../../c/"));
    }
}
package com.company;

import javax.xml.stream.events.Characters;

public class Solution {
    public String Factorial(int n) {
        long resultFactorial = 1;
        if (n <= 0) return  null;
        int zeros = 0;
        for (int i = 1; i <= n; i++) {
            resultFactorial *= i;
            char[] chars = Long.toString(resultFactorial).toCharArray();
            if (chars[chars.length - 1] == '0') {
                char[] chars1 = new char[chars.length - 1];
                zeros++;
                for (int j = 0; j < chars.length - 1; j++) {
                    chars1[j] = chars[j];
                }
                resultFactorial = Long.parseLong(new String(chars1));
            }
        }
        String s = Long.toString(resultFactorial);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(s);
//        for (int i = 0; i < zeros; i++) {
//            stringBuilder.append("0");
//        }
        return s;
    }
}

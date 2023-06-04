package programmers.lvl2;

import java.io.IOException;

public class CorrectBracket {
    /**
     *
     * 프로그래머스 : 올바른 괄호
     * https://school.programmers.co.kr/learn/courses/30/lessons/12909
     *
     * */
    public static void main(String[] args) throws IOException {
        System.out.println(solution("())(()"));
    }

    public static boolean solution(String s) {
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            if (count == 0 && s.charAt(i) == ')') return false;
            else if (s.charAt(i) == '(') count++;
            else count--;
        }

        return count == 0;
    }
}

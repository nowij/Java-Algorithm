package programmers.lvl2;

import java.io.IOException;
import java.util.Stack;

public class RemovePair {
    /**
     *
     * 프로그래머스 : 짝지어 제거하기 (스택사용)
     * https://school.programmers.co.kr/learn/courses/30/lessons/12973
     *
     * */

    public static void main(String[] args) throws IOException {
        System.out.println(solution("baabaa"));
    }

    public static int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        int idx = 0;

        if (s.length() == 0) {
            return 0;
        }

        stack.push(s.charAt(idx++));

        while (idx < s.length()) {
            char c = s.charAt(idx++);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty() ? 1 : 0;
    }
}
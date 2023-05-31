package programmers.lvl2;

import java.io.IOException;
import java.util.*;

public class MaxMin {
    /**
     * 프로그래머스 : 최댓값과 최솟값
     * https://school.programmers.co.kr/learn/courses/30/lessons/12939
     * */
    public static void main(String[] args) throws IOException {
        System.out.println(solution("-1 -2 -3 -4"));
    }

    public static String solution(String s) {
        int size = s.split(" ").length;
        int[] answer = new int[size];
        for (int i=0 ; i<size  ; i++) {
            answer[i] = Integer.parseInt(s.split(" ")[i]);
        }
        Arrays.sort(answer);

        return answer[0] + " " + answer[(answer.length)-1];
    }
}

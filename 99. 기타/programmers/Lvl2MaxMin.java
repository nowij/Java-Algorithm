package programmers;

import java.io.IOException;
import java.util.*;

public class Lvl2MaxMin {
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

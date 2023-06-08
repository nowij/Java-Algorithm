package programmers.lvl2;

import java.io.IOException;

public class NumberExpress {
    /**
     *
     * 프로그래머스 : 숫자의 표현
     * https://school.programmers.co.kr/learn/courses/30/lessons/12924
     *
     * */
    public static void main(String[] args) throws IOException {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;
        int div = 1;
        int count = 0;

        while (n-count > 0) {
            if ((n-count) % div == 0) {
                answer++;
            }
            count+=div;
            div++;
        }

        return answer;
    }
}

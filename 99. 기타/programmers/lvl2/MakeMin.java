package programmers.lvl2;

import java.io.IOException;
import java.util.Arrays;

public class MakeMin {
    /**
     *
     * 프로그래머스 : 최솟값 만들기
     * https://school.programmers.co.kr/learn/courses/30/lessons/12941
     *
     * */
    public static void main(String[] args) throws IOException {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(solution(arr1, arr2));
    }

    public static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int size = A.length-1;
        for (int i=0 ; i<=size; i++) {
            answer += A[i] * B[size-i];
        }

        return answer;
    }
}

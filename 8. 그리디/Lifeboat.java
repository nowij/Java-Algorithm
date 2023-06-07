import java.io.IOException;
import java.util.Arrays;

public class Lifeboat {
    /**
     *
     * 프로그래머스 : 구명보트
     * https://school.programmers.co.kr/learn/courses/30/lessons/42885
     *
     * */
    public static void main(String[] args) throws IOException {
        int arr[] = {70, 50, 80, 50};
        System.out.println(solution(arr, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }
        return answer;
    }

}

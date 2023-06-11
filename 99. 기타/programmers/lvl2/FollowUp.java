package programmers.lvl2;

import java.util.List;
import java.util.ArrayList;

public class FollowUp {
    /**
     *
     * 프로그래머스 : 영어 끝말잇기
     * https://school.programmers.co.kr/learn/courses/30/lessons/12981
     *
     * */
    public static void main(String[] args) throws Exception {
        String[] arr = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(solution(2, arr));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List list = new ArrayList<>();
        int people = 1;
        int turn = 1;
        String last = "";

        for (int i = 0 ; i < words.length ; i++) {
            if (people > n) {
                people = 1;
                turn++;
            }

            if (list.contains(words[i]) || (i !=0 && !words[i].substring(0,1).equals(last))) {
                answer[0] = people;
                answer[1] = turn;
                break;
            } else {
                list.add(words[i]);
                people++;
                last = words[i].substring(words[i].length()-1);
            }

        }

        return answer;
    }
}

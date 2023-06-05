import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Clothes {
    /**
     *
     * 프로그래머스 : 의상
     * https://school.programmers.co.kr/learn/courses/30/lessons/42578
     *
     * */
    public static void main(String[] args) throws IOException {
        String arr[][] = {{"a","hat"}, {"b", "hat"}, {"c", "hat"}};
        System.out.println(solution(arr));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap();
        int count = 1;

        for (int i=0 ; i<clothes.length ; i++) {
            if (map.get(clothes[i][1]) != null) {
                map.put(clothes[i][1], (int)map.get(clothes[i][1])+1);
            } else {
                map.put(clothes[i][1], count);
            }
        }

        for (String key : map.keySet()) {
            int value = (int) map.get(key);
            answer *= (value+1);
        }

        return answer-1;
    }
}

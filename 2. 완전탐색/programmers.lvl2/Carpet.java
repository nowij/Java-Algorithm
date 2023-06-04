import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Carpet {
    /**
     *
     * 프로그래머스 : 카펫
     * https://school.programmers.co.kr/learn/courses/30/lessons/42842
     *
     * */
    public static void main(String[] args) throws IOException {
        solution(18,6);
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;

        Map map = divisor(size);

        for (Object key : map.keySet()) {
            int value = (int) map.get(key);
            if (((int)key-2) * (value-2) == yellow) {
                answer[0] = (int)key;
                answer[1] = value;
                break;
            }
        }

        return answer;
    }

    public static Map divisor(int number) {
        Map map = new HashMap();
        int index = 0;
        for (int i=1 ; i * i <= number ; i++) {
            if (number % i == 0) map.put(index++, i);
            else if (i*i == number) map.put(index++,i);
        }

        return map;
    }
}

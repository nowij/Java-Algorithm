package programmers;

import java.io.IOException;

public class Lvl2JadenCase {
    public static void main(String[] args) throws IOException {
        System.out.println(Solution("for the last week "));

    }

    public static String Solution(String s) {
        String[] array = s.toLowerCase().split(" ");
        String answer = "";

        for (int i=0; i< array.length; i++) {
            if (array[i].length() != 0) {
                answer += array[i].substring(0,1).toUpperCase();
                answer += array[i].substring(1,array[i].length());
            }
            if (i != array.length-1) answer += " ";
            else {
                // 테스트케이스 8번 : 마지막문자가 공백일 경우 지우면 안 됨.
                if (" ".equals(s.substring(s.length()-1))) answer += " ";
            }



        }
        return answer;
    }
}

package baekjoon.recursion;

import java.io.*;

public class No10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력

        int number = Integer.parseInt(br.readLine()); // readLine은 String으로 한 줄씩 읽음
        String answer = String.valueOf(recursive(number));

        bw.write(answer); //버퍼에 입력 (int 안 들어감)

        bw.flush(); // 버퍼의 내용 출력
        bw.close(); // 버퍼 닫기
    }

    public static int recursive(int num) {
        if(num == 1 || num == 0)
            return 1;
        return num * recursive(num-1);
    }
}

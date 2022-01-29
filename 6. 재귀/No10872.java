package baekjoon.recursion;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력

        int number = Integer.parseInt(br.readLine());
        String answer = String.valueOf(recursive(number));

        bw.write(answer); 

        bw.flush();
        bw.close();
    }

    public static int recursive(int num) {
        if(num == 1 || num == 0)
            return 1;
        return num * recursive(num-1);
    }
}

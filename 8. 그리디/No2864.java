import java.io.*;
import java.util.*;

public class No2864 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken();
        String second = st.nextToken();
        int min =0, max = 0;

        min = returnMin(first, second);
        max = returnMax(first, second);
        bw.write(String.valueOf(min)+" "+String.valueOf(max));

        bw.flush();
        bw.close();
    }

    public static int returnMin(String num1, String num2) {
        return Integer.parseInt(num1.replaceAll("6","5")) + Integer.parseInt(num2.replaceAll("6","5"));
    }

    public static int returnMax(String num1, String num2) {
        return Integer.parseInt(num1.replaceAll("5","6")) + Integer.parseInt(num2.replaceAll("5","6"));
    }
}
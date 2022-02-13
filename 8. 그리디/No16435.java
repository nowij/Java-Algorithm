import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] init = new int[2];

        for (int i=0 ; i < init.length ; i++)
            init[i] = Integer.parseInt(st.nextToken());
        int length = init[1];

        st = new StringTokenizer(br.readLine());

        int[] fruits = new int[init[0]];
        for (int i = 0 ; i < fruits.length ; i++)
            fruits[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(fruits);

        for (int i=0 ; i < fruits.length ; i++) {
            if (length >= fruits[i]) {
                length++;
            }
        }

        bw.write(String.valueOf(length));
        bw.flush();
        bw.close();

    }
}

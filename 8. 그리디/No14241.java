import java.io.*;
import java.util.*;

public class No14241 {

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        List<Integer> size = new ArrayList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.countTokens()!=0)
            size.add(Integer.parseInt(st.nextToken()));

        //오름차순으로 정렬
        Collections.sort(size);
        bw.write(String.valueOf(getScore(size,0,0)));

        bw.flush();
        bw.close();
    }

    public static int getScore(List<Integer> list, int index, int score) {
        if (index == list.size()-2)
            return score + list.get(index) * list.get(index+1);
        else {
            score += list.get(index) * list.get(index+1);
            list.set(index+1, list.get(index) + list.get(index+1));
            return getScore(list, index+1, score);
        }
    }
}
import java.io.*;

public class Main {
    public static int count;
    public static final int[] CHANGES = {25, 10, 5, 1};
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());
        int[] dollar = new int[count];

        for (int i=0 ; i<count ; i++) {
            dollar[i] = Integer.parseInt(br.readLine());
            getChanges(dollar[i],0);
        }

        bw.flush();
        bw.close();
    }

    public static int getChanges(int money, int index) throws IOException {
        if(index == 4) {
            bw.write("\n");
            return 0;
        }

        int floor = Math.floorDiv(money, CHANGES[index]);
        if(floor > 0) {
            bw.write(String.valueOf(floor)+" ");
            money -= floor*CHANGES[index];
        } else
            bw.write("0 ");

        return getChanges(money,index+1);
    }
}

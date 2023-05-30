import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        String answer = String.valueOf(fibonacci(number));
        
        bw.write(answer);
        bw.flush();
        bw.close();
        
    }
    
    public static int fibonacci(int num) {
        if (num <= 0) return 0;
        else if(num == 1) return 1;
        
        return fibonacci(num-1)+fibonacci(num-2);
    }
}

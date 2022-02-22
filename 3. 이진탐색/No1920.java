package baekJoon;

import java.io.*;
import java.util.*;

public class No1920 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rangeSize = Integer.parseInt(br.readLine());
		int[] range = new int[rangeSize];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<rangeSize ; i++)
			range[i] = Integer.parseInt(st.nextToken());
		
		int searchSize = Integer.parseInt(br.readLine());
		int[] search = new int[searchSize];
		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<searchSize ; i++)
			search[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(range);
		
		for (int number : search) {
			bw.write(String.valueOf(binarySearch(range, 0, rangeSize-1, number)));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int binarySearch(int[] range, int low, int high, int search) {
		if (low>high) return 0;
		else {
			int middle = low + (high-low)/2;
			if (search == range[middle]) return 1;
			return search < range[middle] ? binarySearch(range, low, middle-1, search) : binarySearch(range, middle+1, high, search);
		}
	}
}

package baekJoon;

import java.io.*;
import java.util.*;

public class No10816 {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cardSize = Integer.parseInt(br.readLine());
		int[] card = new int[cardSize];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<cardSize ; i++)
			card[i] = Integer.parseInt(st.nextToken());
		
		int searchSize = Integer.parseInt(br.readLine());
		int[] search = new int [searchSize];
		st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<searchSize ; i++)
			search[i] = Integer.parseInt(st.nextToken());
		
		// 카드 오름차순으로 정렬
		Arrays.sort(card);
		
		// 중복 개수 : 높은 인덱스 값 - 낮은 인덱스 값
		for (int number : search)
			bw.write(String.valueOf(higherBound(card, number)-lowerBound(card, number))+" ");
		
		bw.flush();
		bw.close();
	}
	
	// 중복 값 중에서 가장 낮은 인덱스 구하기
	public static int lowerBound(int[] arr, int search) {
		int low = 0;
		int high = arr.length;
		
		// 0번 인덱스 값에 도달할 때까지 반복
		while(low < high) {
			int mid = (low+high) / 2;
			if (search <= arr[mid]) high = mid;
			else low = mid+1;
		}
		return low;
	}
	
	
	// 중복 값 중에서 가장 높은 인덱스 구하기
	public static int higherBound(int[] arr, int search) {
		int low=0;
		int high = arr.length;
		
		// 제일 마지막 값에 도달할 때까지 반복
		while(low < high) {
			int mid = (low+high) / 2;
			if (search < arr[mid]) high = mid;
			else low = mid+1;
		}
		
		return low;
	}
}

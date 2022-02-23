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
		
		// ī�� ������������ ����
		Arrays.sort(card);
		
		// �ߺ� ���� : ���� �ε��� �� - ���� �ε��� ��
		for (int number : search)
			bw.write(String.valueOf(higherBound(card, number)-lowerBound(card, number))+" ");
		
		bw.flush();
		bw.close();
	}
	
	// �ߺ� �� �߿��� ���� ���� �ε��� ���ϱ�
	public static int lowerBound(int[] arr, int search) {
		int low = 0;
		int high = arr.length;
		
		// 0�� �ε��� ���� ������ ������ �ݺ�
		while(low < high) {
			int mid = (low+high) / 2;
			if (search <= arr[mid]) high = mid;
			else low = mid+1;
		}
		return low;
	}
	
	
	// �ߺ� �� �߿��� ���� ���� �ε��� ���ϱ�
	public static int higherBound(int[] arr, int search) {
		int low=0;
		int high = arr.length;
		
		// ���� ������ ���� ������ ������ �ݺ�
		while(low < high) {
			int mid = (low+high) / 2;
			if (search < arr[mid]) high = mid;
			else low = mid+1;
		}
		
		return low;
	}
}

package baekJoon;

import java.io.*;
import java.util.*;

public class No2606 {
	public static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int computer = Integer.parseInt(br.readLine());
		int line = Integer.parseInt(br.readLine());
		
		// 인덱스 1번은 비워둠
		boolean[] visited = new boolean[computer+1];
		LinkedList<Integer>[] list = new LinkedList[computer+1]; // 노드와 간선 연결 리스트
				
		for (int i=0 ; i<=computer ; i++)
			list[i] = new LinkedList<>();
		
		for (int i=0 ; i<line ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			list[num1].add(num2);
			list[num2].add(num1);
		}
		
		for (int i=1 ; i<=computer ; i++)
			Collections.sort(list[i]);
		
		dfs(1, list, visited);
        
		bw.write(String.valueOf(count-1));
        bw.flush();
        bw.close();
	}

	public static void dfs(int start, LinkedList<Integer>[] list, boolean[] visited) {
		visited[start] = true; // 노드 방문표시
		count++;
		
		Iterator<Integer> iter = list[start].listIterator(); // 인접리스트 순회
		while (iter.hasNext()) {
			int next = iter.next();
			if (!visited[next])
				dfs(next, list, visited);
				
		}
	}
}

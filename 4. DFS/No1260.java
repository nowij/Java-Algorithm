package baekJoon;

import java.io.*;
import java.util.*;

public class No1260 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] init = new int[3];
        for (int i=0;i<3;i++)
        	init[i] = Integer.parseInt(st.nextToken());
		
        // 인접 리스트로 구현
        int node = init[0];
        int line = init[1];
        int start = init[2];
        boolean[] visited = new boolean[node+1]; // 방문 여부
        
        LinkedList<Integer>[] list = new LinkedList[node+1]; // 노드와 간선 연결 리스트
        for (int i=0; i<=node ; i++)
        	list[i] = new LinkedList<Integer>();
        
        for (int i=0;i<line;i++) {
        	st = new StringTokenizer(br.readLine());
        	int node1 = Integer.parseInt(st.nextToken());
        	int node2 = Integer.parseInt(st.nextToken());
        	// 양방향으로 연결 (내부 리스트 연결)
        	list[node1].add(node2);
        	list[node2].add(node1);
        }
        for (int i=1;i<=node;i++)
        	Collections.sort(list[i]); // 내부 연결된 리스트 정렬 (방문순서를 위해)
        
        dfs(start, list, visited);
        System.out.println();
        visited = new boolean[node+1];
        bfs(start, list, visited);
	}

	public static void dfs(int start, LinkedList<Integer>[] list, boolean[] visited) {
		visited[start] = true; // 노드 방문표시
		System.out.print(start + " ");
		
		Iterator<Integer> iter = list[start].listIterator(); // 인접리스트 순회
		while (iter.hasNext()) {
			int next = iter.next();
			if (!visited[next])
				dfs(next, list, visited);
		}
	}
	
	public static void bfs(int start, LinkedList<Integer>[] list, boolean[] visited) { 
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[start] = true;
		queue.add(start);
		
		// 큐가 소진 될 때까지 반복 (큐에 들어있는거 먼저 탐색)
		while(queue.size() != 0) {
			start = queue.poll(); // 큐 값 꺼냄
			System.out.print(start+" ");
			
			Iterator<Integer> iter = list[start].listIterator();
			while(iter.hasNext()) {
				int next = iter.next();
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}
}

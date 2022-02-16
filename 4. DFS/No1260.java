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
		
        // ���� ����Ʈ�� ����
        int node = init[0];
        int line = init[1];
        int start = init[2];
        boolean[] visited = new boolean[node+1]; // �湮 ����
        
        LinkedList<Integer>[] list = new LinkedList[node+1]; // ���� ���� ���� ����Ʈ
        for (int i=0; i<=node ; i++)
        	list[i] = new LinkedList<Integer>();
        
        for (int i=0;i<line;i++) {
        	st = new StringTokenizer(br.readLine());
        	int node1 = Integer.parseInt(st.nextToken());
        	int node2 = Integer.parseInt(st.nextToken());
        	// ��������� ���� (���� ����Ʈ ����)
        	list[node1].add(node2);
        	list[node2].add(node1);
        }
        for (int i=1;i<=node;i++)
        	Collections.sort(list[i]); // ���� ����� ����Ʈ ���� (�湮������ ����)
        
        dfs(start, list, visited);
        System.out.println();
        visited = new boolean[node+1];
        bfs(start, list, visited);
	}

	public static void dfs(int start, LinkedList<Integer>[] list, boolean[] visited) {
		visited[start] = true; // ��� �湮ǥ��
		System.out.print(start + " ");
		
		Iterator<Integer> iter = list[start].listIterator(); // ��������Ʈ ��ȸ
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
		
		// ť�� ���� �� ������ �ݺ� (ť�� ����ִ°� ���� Ž��)
		while(queue.size() != 0) {
			start = queue.poll(); // ť �� ����
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

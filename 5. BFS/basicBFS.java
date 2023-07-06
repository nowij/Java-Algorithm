import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class basicBFS {
    public final static int GRAPH_SIZE = 9;
    public static boolean visited[] = new boolean[GRAPH_SIZE];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String args[]) throws Exception {
        for (int i=0 ; i<GRAPH_SIZE; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // 리스트 생성
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
    }

    public static void bfs(int point) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(point); // 큐에 추가
        visited[point] = true;

        while(!queue.isEmpty()) {
            int target = queue.poll(); // 꺼내기
            System.out.print(target + " ");

            // 인접 노드 방문
            for (int node : graph.get(target)) {
                if (!visited[node]) {
                    queue.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}

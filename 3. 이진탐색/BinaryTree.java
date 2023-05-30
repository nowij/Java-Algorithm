package baekJoon;

import java.io.IOException;

class Tree {
    class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }
    Node root;

    // 이진트리 생성
    public void makeTree(int[] a) {
        root = makeTreeR(a, 0, a.length-1);
    }

    public Node makeTreeR(int[] a, int start, int end) {
        if (start > end) return null; // 마지막 노드까지 호출 시 호출 중지

        int mid = (start+end) / 2; // 중간 값 설정
        Node node = new Node(a[mid]);
        node.left = makeTreeR(a, start, mid-1); // 왼쪽 노드 생성
        node.right = makeTreeR(a, mid+1, end); // 오른쪽 노드 생성
        return node;
    }

    // 탐색
    public void searchBinaryTree(Node n, int find, int count) {
        if (find < n.data) {
            System.out.println(find+"가 "+n.data + "보다 작다. (왼쪽 이동)");
            searchBinaryTree(n.left, find, ++count); // 값이 작으면 왼쪽 노드 탐색
        } else if (find > n.data) {
            System.out.println(find+"가 "+n.data + "보다 크다. (오른쪽 이동)");
            searchBinaryTree(n.right, find, ++count);
        } else {
            System.out.println(find+"값 찾음. ("+count+"번 시도)");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) throws IOException {
        // 중간 값을 찾아서 왼, 오로 나눠서 숫자를 찾음
        /*
        *             (4)
        *            /   \
        *           /     \
        *          /       \
        *        (1)       (7)
        *       /   \     /   \
        *     (0)   (2)  (5)  (8)
        *             \   \     \
        *             (3)  (6)  (9)
        *
        * */
        int[] treeArray = {0,1,2,3,4,5,6,7,8,9};
        int count = 1;
        Tree tree = new Tree();
        tree.makeTree(treeArray); // 트리 생성
        tree.searchBinaryTree(tree.root, 5, count); // 2 찾기
    }
}

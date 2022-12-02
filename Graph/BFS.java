package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge {
        int src, dst, wt;

        Edge(int s, int d, int w) {
            src = s;
            dst = d;
            wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 40));
        graph[1].add(new Edge(1, 3, 10));
        graph[1].add(new Edge(1, 0, 10));
        graph[2].add(new Edge(2, 4, 10));
        graph[2].add(new Edge(2, 0, 10));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 4, 10));
        graph[3].add(new Edge(3, 5, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 5, 8));
        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 3));
        graph[5].add(new Edge(5, 6, 3));
        graph[6].add(new Edge(6, 5, 3));

    }

    static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        bfs(graph);
        System.out.println();

    }
}

package Graph;

import java.util.ArrayList;

public class DFS {
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

    static void dfs(ArrayList<Edge> graph[], int src, boolean visited[]) {
        System.out.print(src + " ");
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dst]) {
                dfs(graph, e.dst, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        dfs(graph, 0, new boolean[vertex]);
        System.out.println();
    }
}

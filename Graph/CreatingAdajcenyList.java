package Graph;

import java.util.ArrayList;

public class CreatingAdajcenyList {
    static class Edge {
        int src, dst, wt;

        Edge(int s, int d, int w) {
            src = s;
            dst = d;
            wt = w;
        }
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 40));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 0, 40));
        graph[3].add(new Edge(3, 2, 10));
        graph[3].add(new Edge(3, 4, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 6, 3));
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.src + " " + e.dst + " " + e.wt);
        }

    }
}

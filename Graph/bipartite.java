package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class bipartite {
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
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 2, 3));

    }

    public static boolean isbipartite(ArrayList<Edge>[] graph) {
        int color[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dst] == -1) {
                            color[e.dst] = color[curr] ^ 1;
                            q.add(e.dst);
                        } else if (color[e.dst] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        System.out.println(isbipartite(graph));
    }
}
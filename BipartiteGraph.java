import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BipartiteGraph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] graph = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            graph[i] = new int[m];
            for (int j = 0; j < m; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        boolean result = isBipartite(graph);
        System.out.println(result);
    }

    private static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (colors[i] == 0) {
                colors[i] = 1;
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neighbor : graph[node]) {
                        if (colors[neighbor] == 0) {
                            colors[neighbor] = -colors[node];
                            queue.offer(neighbor);
                        } else if (colors[neighbor] == colors[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}

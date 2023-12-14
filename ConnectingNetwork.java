import java.util.Scanner;

public class ConnectingNetwork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int routesCount = sc.nextInt();

        int[][] routes = new int[routesCount][2];
        for (int i = 0; i < routesCount; i++) {
            routes[i][0] = sc.nextInt();
            routes[i][1] = sc.nextInt();
        }

        int result = minOperations(N, routes);
        System.out.println(result);
    }

    private static int minOperations(int N, int[][] routes) {
        UnionFind unionFind = new UnionFind(N);

        for (int[] route : routes) {
            unionFind.union(route[0], route[1]);
        }

        int components = unionFind.getComponents();
        if (components == 1) {
            return 0;
        }

        int extraRoutesNeeded = components - 1;
        int disconnectedCities = N - components;

        if (extraRoutesNeeded == 0 && disconnectedCities == 0) {
            return 0;
        }

        if (extraRoutesNeeded == 0 || disconnectedCities == 0) {
            return -1;
        }

        return Math.min(extraRoutesNeeded, disconnectedCities);
    }

    static class UnionFind {
        int[] parent;
        int components;

        public UnionFind(int N) {
            parent = new int[N];
            components = N;

            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                parent[rootX] = rootY;
                components--;
            }
        }

        public int getComponents() {
            return components;
        }
    }
}

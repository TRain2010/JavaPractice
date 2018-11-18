/**
 * Created by T-RAIN on 2018/11/8.
 */
public class UnionFind {
    int[] rank;
    int[] parent;
    public UnionFind(int size) {
        rank = new int[size];
        parent = new int[size];
        for (int i = 0; i < parent.length; i ++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int i) {
        while (parent[i] != parent[parent[i]]) {
            rank[i] ++;
            i = parent[i];
        }
        return i;
    }

    public boolean union(int u, int v) {
        int cu = find(u);
        int cv = find(v);
        if (cu == cv) return false;
        if (rank[cu] > rank[cv]) parent[cv] = cu;
        else if (rank[cv] > rank[cu]) parent[cu] = cv;
        else {
            parent[cv] = cu;
            rank[cu] += 1;
        }
        return true;
    }
}

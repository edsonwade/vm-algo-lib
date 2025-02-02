package code.with.vanilson.datastructures.disjointset;

/**
 * QuickFind
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-02-02
 */
public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;

        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }


    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
public class WeightedQuickUnionWithFind {
    private int[] size;
    private int[] id;

    public WeightedQuickUnionWithFind(int N) {
        size = new int[N];
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int find(int i) {
        return id[root(i)];
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if(pid == qid) {
            return;
        } else if(size[pid] < size[qid]) {
            if(id[pid] < id[qid]) {
                id[pid] = qid;
            } else {
                id[qid] = pid;
            }

            size[qid] += size[pid];
        } else {
            if(id[qid] < id[pid]) {
                id[qid] = pid;
            } else {
                id[pid] = qid;
            }

            size[pid] += size[qid];
        }
    }
}
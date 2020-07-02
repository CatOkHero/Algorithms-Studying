import java.sql.Date;

// lgN
public class WeightedQuickUnionUnionFindAlgorithm {
    private int[] size;
    private int[] id;

    public WeightedQuickUnionUnionFindAlgorithm(int N) {
        size = new int[N];
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        while(i != id[i]) {
            // flatenning the tree
            // called weighted quick union with path comression
            // with this code, the access to elements becomes lg*N
            // lg*N => Z
            // N = 1; Z = 0
            // N = 2; Z = 1
            // N = 4; Z = 2
            // N = 16; Z = 3
            // N = 65536; Z = 4;
            // N = 2^65536; Z = 5
            // it's very close to be linear
            // id[i] = id[id[i]];
            i = id[i];
        }

        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(Date timeStamp, int p, int q) {
        int pid = root(p);
        int qid = root(q);
        if(pid == qid) {
            return;
        } else if(size[pid] < size[qid]) {
            id[pid] = qid;
            size[qid] += size[pid];

            if(size[qid] == id.length) {
                System.out.println("The earliest time the friends are connected ".concat(timeStamp.toString()));
            }
        } else {
            id[qid] = pid;
            size[pid] += size[qid];

            if(size[qid] == id.length) {
                System.out.println("The earliest time the friends are connected ".concat(timeStamp.toString()));
            }
        }
    }
}
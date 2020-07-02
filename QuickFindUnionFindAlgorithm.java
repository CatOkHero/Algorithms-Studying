
// N^2 time (quadratic)
// Qadratic algorithms don't scale

public class QuickFindUnionFindAlgorithm {
    private int id[];

    public QuickFindUnionFindAlgorithm(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    //2N + 2 array acces
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[p];

        for(int i = 0; i < id.length; i++) {
            //it's a mistake to if(id[i] == p) rather then taking pid
            //probably because type could be whatever it could be
            if(id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
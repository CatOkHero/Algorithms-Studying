// import java.sql.Date;

// public class SocialNetworkConnectivityAlgorithm {
//     private int[] graph;
//     private boolean maxConnectedLength;

//     public SocialNetworkConnectivityAlgorithm(int N){
//         graph = new int[N];
//         for(int i = 0; i < N; i++) {
//             graph[i] = i;
//         }
//     }
    
//     public void AddTimeStamp(Date timeStamp, int p, int q) {
//         Union(p, q);
//         if(isConnected()) {
//             System.out.println("The earliest time they are connected is ".concat(timeStamp.toString()));
//         }
//     }

//     private void Union(int p, int q) {
//         maxConnectedLength = true;
//         int pid = graph[p];
//         int qid = graph[q];

//         int first = graph[q];
//         for(int i = 0; i < graph.length; i++) {
//             if(graph[i] == pid) {
//                 graph[i] = qid;
//             }

//             if(first != graph[i]) {
//                 maxConnectedLength = false;
//             }
//         }
//     }

//     private boolean isConnected() {
//         return maxConnectedLength;
//     }
// }

// lgN
public class SocialNetworkConnectivityAlgorithm {
    private int[] size;
    private int[] id;

    public SocialNetworkConnectivityAlgorithm(int N) {
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

    public void union(Integer timeStamp, int p, int q) {
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
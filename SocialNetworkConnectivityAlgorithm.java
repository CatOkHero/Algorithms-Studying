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



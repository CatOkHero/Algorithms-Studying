import java.util.List;

import Recursion.ListNode;
import Recursion.RecursionExamples;
import Recursion.TreeNode;

public class Hello {
    public static void main(String[] args) {
        // HanioTower algorithm uncomment to use
        // HanioTowerAlgorithm hanioTowerAlgorithm = new HanioTowerAlgorithm();
        // hanioTowerAlgorithm.HanioTowerRun(5, "A", "B", "ABC");

        // BinarySearch algorithm uncomment to use
        // int[] array = {
        //     1, 2, 3, 4, 5, 6, 7, 7,  8
        // };
        // BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
        // int index = binarySearchAlgorithm.BinarySearch(array, 0, array.length - 1, 5);
        // System.out.println("Index of 5 is 4");
        // System.out.println("Index of 5 from the BinarySearch is ".concat(index.toString()));

        // SelectionSort algorithm uncomment to use
        // int[] array = {
        //         -2, 1, 4, 0, 0, -3, 6, 3
        //     };
        // SelectionSortAlgorithm selectionSortAlgorithm = new SelectionSortAlgorithm();
        // selectionSortAlgorithm.SelectionSort(array);
        // for(int i = 0; i < array.length; i++){
        //     System.out.println(array[i]);
        // }

        // InsertionSort algorithm uncomment to use
        // int[] array = {
        //             -2, 1, 4, 0, 0, -3, 6, 3
        //         };
        // InsertionSortAlgorithm insertionSortAlgorithm = new InsertionSortAlgorithm();
        // insertionSortAlgorithm.InsertionSort(array);
        // for(int i = 0; i < array.length; i++){
        //     System.out.println(array[i]);
        // }

        // BreadthFirstSearch algorithm uncomment to use
        // Integer[][] adjList = {
        //     {1},
        //     {0, 4, 5},
        //     {3, 4, 5},
        //     {2, 6},
        //     {1, 2},
        //     {1, 2, 6},
        //     {3, 5},
        //     {}
        // };
        // BreadthFirstSearchAlgorithm breadthFirstSearchAlgorithm = new BreadthFirstSearchAlgorithm();
        // breadthFirstSearchAlgorithm.BreadthFirstSearch(adjList, 3);

        // Integer[][] adjList = {
        //         {1, 2},
        //         {0, 4},
        //         {3, 4},
        //         {2, 6},
        //         {1, 0},
        //         {6, 5},
        //         {3, 5},
        //         {3, 1},
        //         {3, 2},
        //         {7, 0},
        //         {1, 7},
        //         {2, 7}
        //     };

        // SocialNetworkConnectivityAlgorithm socialNetworkConnectivityAlgorithm = new SocialNetworkConnectivityAlgorithm(8);
        // for(int i = 0; i < adjList.length; i++) {
        //     socialNetworkConnectivityAlgorithm.union(i, adjList[i][0], adjList[i][1]);
        // }

        // Integer[][] adjList = {
        //         {1, 2},
        //         {0, 4},
        //         {2, 6},
        //         {3, 1},
        //         {3, 2},
        //         {5, 0},
        //         {1, 7},
        //         {2, 7}
        //     };
        // WeightedQuickUnionWithFind weightedQuickUnionWithFind = new WeightedQuickUnionWithFind(adjList.length);
        // for(int i = 0; i < adjList.length; i++) {
        //     weightedQuickUnionWithFind.union(adjList[i][0], adjList[i][1]);
        // }
        // System.out.println(weightedQuickUnionWithFind.find(0));

        // char[] str = {'H','a','n','n','a','h'};
        // RecursionExamples recurssionStringReverse = new RecursionExamples();
        // recurssionStringReverse.reverseString(str);
        // for(int i = 0; i < str.length; i++) {
        //     System.out.println(str[i]);
        // }

        // ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        // RecursionExamples recursionExamples = new RecursionExamples();
        // ListNode result = recursionExamples.swapPairs(listNode);
        // do{
        //     System.out.println(result.val);
        //     result = result.next;
        // }while(result != null);

        // ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        // RecursionExamples recursionExamples = new RecursionExamples();
        // ListNode result = recursionExamples.reverseList(listNode);
        // do{
        //     System.out.println(result.val);
        //     result = result.next;
        // }while(result != null);

        // TreeNode treeNode = new TreeNode();
        // treeNode.val = 4;
        // treeNode.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        // treeNode.right = new TreeNode(7);
        // RecursionExamples recursionExamples = new RecursionExamples();
        // TreeNode result = recursionExamples.searchBST(treeNode, 2);

        RecursionExamples recursionExamples = new RecursionExamples();
        List<Integer> result = recursionExamples.getRow(29);
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

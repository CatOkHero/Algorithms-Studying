package Recursion;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class RecursionExamples {
    public void reverseString(char[] s) {
        recursion(s, 0, s.length - 1);
    }
    
    private void recursion(char[] s, int startIndex, int endIndex) { 
        if(startIndex >= endIndex) {
            return;
        }
        
        char temp = s[startIndex];
        s[startIndex] = s[endIndex];
        s[endIndex] = temp;
        recursion(s, startIndex + 1, endIndex - 1);
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next.next;
        ListNode temp = head;
        head = head.next;
        head.next = temp;
        head.next.next = swapPairs(next);

        return head;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return temp;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }

        if(root.val == val) {
            return root;
        } 

        if(root.val < val) {
            return searchBST(root.right, val);
        } 
        
        return searchBST(root.left, val);
    }

    /*
Input: 3
Output: [1,3,3,1]

input 3
0       1
1      1 1
2     1 x 1
3    1 x x 1
4   1 x x x 1
5  1 x x x x 1
6 1 x x x x x 1

input 4
0       1
1      1 1
2     1 2 1
3    1 3 3 1
4   1 4 6 4 1
5  1 5 10 10 5 1
6 1 6 15 20 15 6 1


f(k % 2 == 0, x) = f(k - 1, x - 1) + f(k - 1, x - 2)

f(4, 2) = f(3, 2) + f(3, 1)
f(3, 2) = f(2, 2) + 
f(3, 1) = f(2, 1) + f(2, 0)
f(2, 1) = f(1, 1) + f(1, 0)
f(2, 0) = 1
f(1, 0) = 1
f(2, 1) = 2
f(2, 0) = 1
*/
    public List<Integer> getRow(int rowIndex) {
        Hashtable<String, Integer> dictionary = new Hashtable<String, Integer>(); 
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++) {
            result.add(f(rowIndex, i, dictionary));
        }

        return result;
    }

    private int f(int k, int x, Hashtable<String, Integer> dictionary) {
        if(x == 0 || k == x) {
            return 1;
        }

        int right = -1;
        int left = -1;
        int kmin1 = k - 1;
        int xmin1 = x - 1;
        if(dictionary.containsKey(Integer.toString(kmin1).concat(",").concat(Integer.toString(x)))) {
            right = dictionary.get(Integer.toString(kmin1).concat(",").concat(Integer.toString(x)));
        }
        else {
            right = f(kmin1, x, dictionary);
            dictionary.put(Integer.toString(kmin1).concat(",").concat(Integer.toString(x)), right);
        }

        if(dictionary.containsKey(Integer.toString(kmin1).concat(",").concat(Integer.toString(xmin1)))) {
            left = dictionary.get(Integer.toString(kmin1).concat(",").concat(Integer.toString(xmin1)));
        }
        else {
            left = f(kmin1, x - 1, dictionary);
            dictionary.put(Integer.toString(kmin1).concat(",").concat(Integer.toString(xmin1)), left);
        }
        
        return left + right;
    }
}

/* 
reverseList(head)
    if(head == null){
        return
    }

    head = reverseList (n);
    head.next = reverseList(n - 1);


    f(0) = f(x)     f(0) == head
    f(1) = f(x-1)   f(1) == head.next
    f(2) = f(x-2)   f(2) == head.next.next
    f(3) = f(x-3)   f(3) == head.next.next.next
*/

/*
Given the tree:
        4
       / \
      2   7
     / \
    1   3

    Searching from right to left
*/

/*
Input: 3
Output: [1,3,3,1]

input 3
0       1
1      1 1
2     1 x 1
3    1 x x 1
4   1 x x x 1
5  1 x x x x 1


f(k % 2 == 0, x) = f(k - 1, x - 1) + f(k - 1, x - 2)

f(4, 3) = f(3, 2) + f(3, 1)
f(3, 2) = f(2, 1) + f(2, 0)
f(2, 1) = f(1, 0) + f(1, if (x - 2) < 0 ? 0 : x - 2)
f(1, 0) = 1
f(1, 0) = 1
f(2, 1) = 2
f(2, 0) = 1
*/

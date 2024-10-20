package practice.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PrintSLL {
    public static void main(String[] args) {
        //Creating Linked List: 1->2->3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution obj = new Solution();
        obj.printSLL(head);
    }
}

class Solution {
    public void printSLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}


package practice.linkedList;

public class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node1 removNode(Node1 head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node1 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String args[]) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(40);
        head.next.next.next = new Node1(30);
        // method to remove tail node
        head = removNode(head);
        //method to print list
        printSll(head);
    }
    public static void printSll(Node1 head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

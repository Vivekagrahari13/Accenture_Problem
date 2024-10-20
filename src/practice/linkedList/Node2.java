package practice.linkedList;

public class Node2{
    int data ;
    Node2 next;
    Node2(int data)
    {
        this.data=data;
        this.next=null;
    }

    public static Node2 removeNode(Node2 head, int idx)
    {
        Node2 newNode=new Node2(10);
        if(head==null)
        {
            head=newNode;
        }
        if(head.data==idx){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node2 temp=head;
        while (temp.next!=null)
        {
            if(temp.next.data==idx)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                temp=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }

        return head;
    }
    public static void print(Node2 head) {
        while (head!=null) {
            System.out.println(head.data);
            head=head.next;

        }



    }

    public static void main(String args[])
    {
        Node2 head=new Node2(10);
        head.next=new Node2 (20);
        head.next.next=new Node2 (40);
        head.next.next.next=new Node2 (30);
        head =removeNode(head,10);
        print(head);
}
}


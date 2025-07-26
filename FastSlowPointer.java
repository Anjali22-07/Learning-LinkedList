
public class FastSlowPointer{

    public static class Node{
        int data;      //stores the value in LL.
        Node next;   //stores address of the next nodeof linkedList
        Node(int data){
            this.data=data;
        }
    }

    //method to remove node from the end of the linked list--using two pointer
    public static Node Removeelt(Node head, int n){
        Node fast= head;
        Node slow= head;
        Node temp=head;
        for(int i=0;i<=n;i++){
           fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;

        }

        //removing the node from linkedList
        slow= slow.next.next;

        
        return head;

    }

    //method to display linkedlist
     public static void Display(Node head){

      if(head==null){
        return;
      }
        System.out.print(head.data+" ");
        Display(head.next);       
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(8);
        Node c= new Node(9);
        Node d= new Node(16);
        Node e=new Node(13);
        Node f= new Node(23);
        a.next=b; 
        b.next=c; 
        c.next=d;
        d.next=e;
        e.next=f;
        Display(a);

       Node r=Removeelt(a,3);
        Display(r);
        
    }
}
public class revreseLL {
    
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

   public static void display(Node head){
          //base case

      if(head==null)
       return;
  //call
    display(head.next);
    //self work
      System.out.print(head.data+" ");

    }

    public static void main(String[] args){

         Node a= new Node(3);
         Node b= new Node(5);
         Node c= new Node(1);
         Node d= new Node(2);
         Node e= new Node(4);
            
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         display(a);
    }
}

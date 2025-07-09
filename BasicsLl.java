


// A Linked List is a data structure where each item (called a node) holds:

// Some data

// A reference (link) to the next node

// It's like a chain of boxes — each box holds something and points to the next box.



public class BasicsLl{

    // ✅ Step 1: Create the Node Class

    public static class Node{
 
      /*Each node stores an int (you can use any type) and a reference to the next node. */ 

        int data; //to store the data in the linked list
        Node next; //stores the address and links the data

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        
      //  ✅ Step 3: Use It in main
        Node a=new Node(5);
        Node b=new Node(8);
        Node c= new Node(9);
        Node d= new Node(16);

        // 5  8 9 16 

        //now we are assigning the node next the address of the b
        a.next=b; //address of b is linked to 'a'  5 --> 8 9 16
        b.next=c; //5 --> 8 --> 9 
        c.next=d;  //5 --> 8 --> 9 --> 16   all the data is now linked to each other

        //if only information of head is given can we print the compelte linked list ? 

        // System.out.println(a.data);
        //  System.out.println(a.next.data);  //b
        //  System.out.println(a.next.next.data);  //c
        //  System.out.println(a.next.next.next.data);  //d

        //to print the linked list using iteration

        Node temp=a;
        // for(int i=0;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
       

        //if we do not know the number of nodes present in a linked list

        // while(temp!=null){

        //   System.out.print(temp.data+" ");
        //   temp=temp.next;

        // }

        //doing it using a separate function 
        //calling the function

        Display(a);
        length(a);
        insertAtEnd(a,14);
         Display(a);

    }

    public static void Display(Node head){

      if(head==null){
        return;
      }
        System.out.print(head.data+" ");
        Display(head.next);       
    }

     //to find the length of the linkedlist (iterative and Recursive)
    public static int length(Node head){

      int count=0;
      //Iterative approach
      // while(head!=null){
      //    count++;
      //    head=head.next;
      // }
      //  System.out.println("The length of the linkedlist is:"+count);

      //recursive approach

        if(head==null){
          return 0;
          }
       count=length(head.next)+1;
           System.out.print("The length of the linkedList is:"+count);
          
        return count;
    }

    //to insert an element at tail when only head is given
    public static void insertAtEnd(Node head, int val){

      Node temp=new Node(val);
      Node T=head;
      while(T.next!=null){
        T=T.next;
      }
       T.next=temp;
    

    }

}

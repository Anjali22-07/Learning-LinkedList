public class DllImplementation {
    
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    public static class DoublyLL{

        Node head=null;
        Node tail=null;

     void display(){
        
     Node temp=head;    //to preserve head
     while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
     }

    }

        //to print the reverse of a Doubly Linked List
    void displayReverse(){
        Node temp=tail; //to preserve tail
      while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    //this displays the complete list when any random node is passed as parameter
     void displayRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

     void insertAtHead(int val){
        Node T=new Node(val);
        if(head==null){
            head=T;
            tail=T;
        }
        else {
            T.next=head;
            head.prev=T;
            head=T;
        }
       
     }

     void insertAtEnd(int val){
        Node T=new Node(val);
        Node temp=head;
         if(head==null){
            head=T;
            tail=T;
           // return ;
        }
    
        while(temp.next!=null){
            temp=temp.next;
        }
            temp.next=T;
            T.prev=temp;
     }

     void insertAtRandom(int val, int idx){
        Node temp=head;
        Node T=new Node(val);
         if (idx == 0) {
        insertAtHead(val);
        return;
    }
        for(int i=0;i<idx;i++){
            temp=temp.next;
     }
      // If index is out of range, insert at end
    if (temp == null || temp.next == null) {
        insertAtEnd(val);
        return;
    }
    
    //inserting the element at given index
        temp.next.prev=T;
        T.prev=temp;
        T.next=temp.next;
        temp.next=T;

     }

     //Deletion in DLL

     void DeleteHead(){
        
        head=head.next;
        head.prev=null;        
     }

     void DeleteTail(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
     }
     
     void deleteAtIdx(int idx){
        Node temp=head;
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
     }
    }

    public static void main(String[] args) {
        
       
         DoublyLL dll=new DoublyLL();
         System.out.println();
        dll.insertAtHead(30);
      //  dll.display();
        System.out.println();
        dll.insertAtEnd(14);
        dll.insertAtEnd(10);
        dll.insertAtEnd(2);
        dll.insertAtEnd(22);
        dll.insertAtEnd(18);
         dll.display();
         dll.insertAtRandom(21, 4);
         System.out.println();
         dll.display();
         System.out.println();
         dll.DeleteHead();
         dll.display();
         System.out.println();
         dll.DeleteTail();
         dll.display();
         System.out.println();
         dll.deleteAtIdx(3);
         dll.display();



    }
}

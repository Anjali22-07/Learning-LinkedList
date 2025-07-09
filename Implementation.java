public class Implementation {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head= null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){

            Node temp=new Node(val);
         //checking if the linkedList is empty 
            if(head==null){   //if it is empty
                head= temp;
             }
            else{
              tail.next=temp;
            }
              tail=temp;
              size++;
        }

        void Display(){   //we don't need to pass parameter to display method because it's inside the linkedlist class which already contains all the data
        Node temp=head;    //Since we want to preserve the head, we use a temp variable.   
        while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        
       
        void insert(int idx, int val){
            Node T= new Node(val);
            Node temp= head; //to preserve the head

            //if the idx and the size of the index is same,it adds the node to the end of the list
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            if(idx==0){
                insertAtHead(val);
                return;   //stops the flow of program
            }

            if(idx<0 || idx>size){
                System.out.println("Wrong index");
            }

            for(int i=0;i<=idx-1;i++){
                temp=temp.next;
            }
            T.next=temp.next;
            temp.next=T;
            size++;
        }

        void insertAtHead(int val){
            Node temp= new Node(val);
            if(head==null){    //if it's an empty list
                head=temp;
                tail=temp;
            }
            else    //if it's non empty 
            {
                temp.next=head;
                head=temp;
            }
            size++;
        }

        //method to get element at a given index
        int getElement(int idx){
             if(idx<0 || idx>size){
                System.out.println("Wrong index");
                return -1;
            }

            if(head==null){
                System.out.println("The LinkedList is Empty");
                return 0;
            }
            Node temp=head;
            for(int i=0;i<idx;i++){
             temp=temp.next;   
            }
            return temp.data;
        }

        void Delete(int idx){
           
             if(idx==0){  //if we are deleting the index at begining
            head=head.next;
            size--;
            return;
            }
             Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
           
            temp.next=temp.next.next;
            tail=temp;  //if we are deleting the last index
            size--;
        }


    }
    

    public static void main(String[] args){

        LinkedList ll= new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(13);
        ll.Display();
    
        ll.insertAtHead(10);
        ll.Display();
       System.out.println();

        ll.insert(1,4);
           ll.Display();
            
            System.out.println("The element at the given index is:"+ll.getElement(3));
            
            ll.Delete(0);
            System.out.println();
            ll.Display();
    }
}

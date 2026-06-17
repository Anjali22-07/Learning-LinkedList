public class RevisionLL{

    public static class Node{
         
         int data;
         Node next;

         Node(int data){
            this.data=data;
         }
    }

    public static class LinkedListt{
         
         Node head=null;
         Node tail= null;
         int size=0;

         void insertAtBegining(int val){
              Node temp= new Node(val);
              if(head==null){
                head= temp;
                tail= temp;
              }else {   //head is not empty
                temp.next= head ;  //we will move head to the temp's next and make the temp the head pointer
                head= temp;

              }
         }

         void displayLL(){
            //Iterative Approach 
            Node temp= head;
            while(temp.next!=null){
                 System.out.print(temp.data+"->");
                 temp=temp.next;
            }
           System.out.print(temp.data);


        // //recursive approach 
        //        //base case
        //        if(head==null){
        //           return;
        //        }

        //        System.out.print(head.data+"->");
        //        displayLL(head.next);
      }

         void insertAtEnd(int val){
            Node temp = new Node(val);
           
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                 Node t= head;
                 while(t.next!=null){
                    t=t.next;
                 }
                 t.next= temp;
                 temp.next=null;

            }
         }

         void insertAtIdx(int val, int idx){
              Node temp= new Node(val);
              if(idx==0){
                insertAtBegining(val);
                return;
              }

              if(idx==size()){
                 insertAtEnd(val);
                 return;
              }
              
                Node t= head;
                 for(int i=0;i<idx-1;i++){
                      t=t.next;
                 }
                 System.out.println(t.next.data);
                 temp.next=t.next;
                 t.next=temp;
              

         }

         int size(){
             Node temp= head;
             int size=0;
             while(temp!=null){
                size++;
                temp=temp.next;
             }
             return size;
         }
         
          void deleteAtBegining(){
             if(head.next==null){
                head=null;
             }
             head=head.next;
             }

         void deleteAtEnd(){
              Node temp=head;
             if(head.next==null){
                head=null;
             }
             while(temp.next.next!=null){
                temp=temp.next;
             }
             temp.next=null;
         }

         void deleteAtIdx(int idx){
            
            if(idx==0){
                deleteAtBegining();
                return;
            }
            if(idx==size()){
                deleteAtEnd();
                return;
            }
             Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
              temp.next=temp.next.next;
         }
          
          void searchElement(int val){
             Node temp=head;
             boolean flag=false;
             int idx=0;
             while(temp!=null){
                 if(temp.data==val){
                    flag=true;
                     System.out.println("The element exist at "+idx);
                 }
                 temp=temp.next;
                 idx++;
                }
                 if(flag==false){
                    System.out.println("The element does not exist");
                 }
             
            
          }
    }

     public static void main(String[] args) {
        LinkedListt linkedList= new LinkedListt();
        linkedList.insertAtBegining(10);
        linkedList.insertAtBegining(12);
        linkedList.insertAtBegining(22);
        linkedList.insertAtBegining(29);
        linkedList.insertAtBegining(34);
      //  linkedList.displayLL();
       linkedList.insertAtEnd(21);
        linkedList.deleteAtBegining();
         linkedList.deleteAtEnd();
        linkedList.deleteAtIdx(2);
         linkedList.insertAtEnd(26);
        linkedList.insertAtIdx(28, 2);
         linkedList.displayLL();
         linkedList.searchElement(46);

     }
}
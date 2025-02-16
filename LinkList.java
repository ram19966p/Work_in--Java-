public class LinkList {
    public static class Node{
        int data ;
        Node  next ;

        public Node(int data){
            this.data = data ;
            this.next = null ;
          
        }
    }

        public static Node head ;
        public static Node tail ;
        public static int size ;

// Add the Data in first Postion 

         public void addFirst(int data){

          // step 1 = create new node 
         Node  newNode  = new Node(data);
         size++;
            if(head == null ){
          head = tail = newNode ;
          return ;
            }
           
            //step2  newNode  next = head 
            newNode.next = head ;

            // step3 head = newNode 
            head = newNode ;
         }

// Add the Dsta is the Last postion 
         public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            
            if(head == null ){
                head = tail = newNode;
            }
            tail.next = newNode ;
            tail = newNode;

         }


         // Add the data in the middle Postion in the LinkList 


public void midAdd(int inx  , int  data ){
    Node  newNode = new Node(data);
    size++;
    Node temp = head ;

    int i = 0 ;
     
    while(i <  inx-1){
        temp = temp.next;
        i++;

    }
 // i = idx-1 ; temp -> prev 
    newNode.next = temp.next;
    temp.next = newNode ;

}



         // print the LinkList 

         public void print(){ //o(n) Linear 
            Node  temp = head ;

          if( head == null){
            System.out.println(" Link List is Empty->");
            return ;
          }
            while( temp != null){
                 System.out.print(temp.data+"->");
               temp = temp.next;
            }
         System.out.println("null");

            
         }

public static void  main (String arg[]){
    System.out.println("Succesfull");

    LinkList  obj = new LinkList();
    obj.print();
    obj.addFirst(2);
    obj.print();
    obj.addFirst(1);
    obj.print();
    obj.addLast(4);
    obj.print();
    obj.addLast(5);
    obj.print();
    obj.midAdd(2, 3);
    obj.print();
  System.out.println(obj.size);
  
}

}

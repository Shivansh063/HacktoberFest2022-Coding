class SortList {  
      
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
      
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
        }  
    }  
    
    public void sortList() {  
        Node current = head, index = null;  
        int temp;  
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                index = current.next;  
                  
                while(index != null) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  
    }  
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        SortList sList = new SortList();  
        sList.addNode(9);  
        sList.addNode(7);  
        sList.addNode(2);  
        sList.addNode(5);  
        sList.addNode(4);  
          
        System.out.println("Original list: ");  
        sList.display();            
        sList.sortList();            
        System.out.println("Sorted list: ");  
        sList.display();  
    }  
}  

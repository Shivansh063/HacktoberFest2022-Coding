class RemoveDuplicate {  
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
   
    public void removeDuplicate() {  
        Node current = head, index = null, temp = null;  
  
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){    
                temp = current;  
                index = current.next;  
  
                while(index != null) {  
                    if(current.data == index.data) {  
                        temp.next = index.next;  
                    }  
                    else {  
                        temp = index;  
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
  
        RemoveDuplicate sList = new RemoveDuplicate();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(2);  
        sList.addNode(4);  
        sList.addNode(1);  
  
        System.out.println("Originals list: ");  
        sList.display();  
  
        //Removes duplicate nodes  
        sList.removeDuplicate();  
  
        System.out.println("List after removing duplicates: ");  
        sList.display();  
    }  
}  
package Day3;
class Node {
    int data;
    Node prev;
    Node next;




    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}


public class DoublyLinkedList {
    Node head;
    // Insert at end
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


    public void innerAtPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos <= 0){
            System.out.print("Invalid position");
            return;
        }
        if(pos == 1){
            newNode.next = head;
            if(head != null){
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 1;
        while(temp != null && i < pos-1){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.print("Invalid position, Out of Range");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }



    public void display(){
        Node temp = head;
        while (temp != null){ // for multiple nodes
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.display();
    }
}
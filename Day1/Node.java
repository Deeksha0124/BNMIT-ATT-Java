package Day1;
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
    Node head;
    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSize(){
        int size = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        int size = getSize();
        Node n = new Node(val);
        if (pos < 0  || pos > size){
            System.out.println("Invalid Position");
            return;
        }
        else if(pos == 0){
            insertAtHead(val);
            return;
        }

        Node temp = head;
        while(--pos > 0){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    void deleteAtHead(){
        if (head != null){
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    void deleteByVal(int val){
        if(head == null) {
            return;
        }

        if (head.data == val) {
            deleteAtHead();
            return;
        }

        Node temp = head;
        while(temp.next!=null && temp.next.data!=val){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Value Not Found");
            return;
        }
        Node tobedeleted = temp.next;
        temp.next = temp.next.next;
        tobedeleted = null;
    }

    void printLL(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
}

class DriverCode{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.printLL();
        sll.insertAtTail(50);
        sll.insertAtPos(500, 3);
        sll.printLL();
        sll.deleteAtHead();
        sll.printLL();
        sll.deleteByVal(20);
        sll.printLL();
    }
}
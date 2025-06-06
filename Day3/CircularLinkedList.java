package Day3;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}


public class CircularLinkedList {
    Node1 head;
    public CircularLinkedList(){
        head = null;
    }
    public void printListElements(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node1 temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while (temp.next != head);
        System.out.println("head");
    }
    public void insertAtHead(int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            newNode.next = head;
            head = newNode;
            return;
        }
    }
}


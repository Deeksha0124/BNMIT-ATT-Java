package Day4.problems;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {
    public static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move one step
            fast = fast.next.next;      // move two steps

            if (slow == fast) {
                return true;            // cycle detected
            }
        }
        return false;                   // no cycle
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = second; // cycle
        if (detectCycle(head)) {
            System.out.println("Yes");

        }
        System.out.println(detectCycle(head) ? "Cycle detected." : "No cycle.");
    }
}






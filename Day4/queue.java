package Day4;

public class queue {
    private static final int max_size = 10;
    private int[] arr = new int[max_size];
    private int front = 0;
    private int rear = 0;

    public void queue() {
        front = rear = -1; //empty

    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == max_size - 1);
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        } else if (isEmpty()) {
            front = rear = -0;
        } else {
            rear++;
        }
        arr[rear] = element;
        System.out.println("Enqueued: " + element);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");

        } else if (front == rear) {
            front = rear = -1;
        } else {
            front++;
            System.out.println("Dequeued: " + arr[front]);
        }
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return arr[front];
        }

    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return arr[rear];
        }
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public int size() {
        return (rear + 1);
    }
    public static void main(String[] args) {
        queue queue =  new queue();
        int [] arr = {10, 20, 30, 40, 60};
        for(int x: arr){
            queue.enqueue(x);

        }
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println();

    }
}




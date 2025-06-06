package Day5.bufferAndBuilder;

public class BufferExample {
    public void stringAppend(){
        StringBuilder buffer = new StringBuilder("Core");
        System.out.println("Original string: " + buffer);
        buffer.append(" Java");
        System.out.println("New String: " + buffer);
    }
    public void stringInsert(){
        StringBuilder buffer = new StringBuilder("JA"); //at index 0 -> "J", at index 1 we have "A", "AV" is getting appended at index 1, means "J" + "AV" + "A" = JAVA
        System.out.println("Original string: " + buffer);
        buffer.insert(1,"AV"); //JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuilder buffer = new StringBuilder("TIMNB");
        System.out.println("Original string: " + buffer);
        buffer.reverse();
        System.out.println("New String: " + buffer);
    }

    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}

package Day5.bufferAndBuilder;

public class ImmutableStrings {
    public static void main(String[] args) {
        String name = "BNMIT";
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("Original: " + name);

        StringBuffer buffer = new StringBuffer("JAVA");
        System.out.println("Original String: " + buffer);
        buffer.reverse();
        System.out.println("Reversed String: " + buffer);
    }
}

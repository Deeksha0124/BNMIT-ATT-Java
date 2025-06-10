package Day5.NonLinearDataStructures.Trees.Heap;

public class Outer {
    private int value = 20;
    class Inner{
        void display(){
            System.out.println("The value is: " + value);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.value);

        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner inner = outer.new Inner();

        inner.display();

    }
}

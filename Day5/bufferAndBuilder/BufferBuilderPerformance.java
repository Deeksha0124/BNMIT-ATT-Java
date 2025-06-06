package Day5.bufferAndBuilder;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("BNMIT");
        for(int i=1; i<100000; i++){
            buffer.append("College");
        }
        System.out.println("Buffer Time: " + (System.currentTimeMillis()-StartTime) + "ms");
        StartTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("BNMIT");
        for(int i=1; i<100000; i++){
            builder.append("College");
        }
        System.out.println("Builder Time: " + (System.currentTimeMillis()-StartTime) + "ms");
    }
}

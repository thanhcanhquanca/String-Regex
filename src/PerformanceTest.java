public class PerformanceTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");
//        System.out.println(sb.toString());
//
//        sb.insert(5, " World");
//        System.out.println(sb.toString());
//
//        sb.delete(5, 11);
//        System.out.println(sb.toString());
//
//        sb.deleteCharAt(0);
//        System.out.println(sb.toString());
//
//        System.out.println("Length: " + sb.length());
//


        long startTime, endTime;

        // Kiểm tra StringBuffer với 1000000 lần append
        startTime = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb1.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");

        // Kiểm tra StringBuilder với 1000000 lần append
        startTime = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb2.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");

    }
}
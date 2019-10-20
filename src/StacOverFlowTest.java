public class StacOverFlowTest {
    static int count;

    public static void test() {
        try {
            test();
        }catch (StackOverflowError e){
            System.out.println("To mach");
        }

    }
}

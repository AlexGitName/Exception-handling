public class ArrayExeption {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(2, 4, array);
        printArray(1, 6, array);
        UserBank.userAccount(124571, 12345785, 10000);
        StacOverFlowTest.test();

    }

    public static void printArray(int startIndexArray, int endIndexArray, int[] array) {
        for (int i = startIndexArray; i <= endIndexArray; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. You try address to not exists index: index = " + i + ";\n length of array = " + array.length + ";");
            }
        }
        System.out.println("End");
    }
}

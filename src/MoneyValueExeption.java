public class MoneyValueExeption extends RuntimeException {
    private String someString;
    MoneyValueExeption(String someString){
        System.out.println(someString);
    }

}

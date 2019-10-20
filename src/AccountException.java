public class AccountException extends RuntimeException {

private String someString;
public AccountException(String someString){
    System.out.println(someString);
}

}

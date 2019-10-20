public class UserBank {
    int numberFrom, numberTo, sum;


    public static void userAccount(int numberFrom, int numberTo, int sum) {
        try {
            MoneyTransactionUtil.sendTo(numberFrom, numberTo, sum);
        } catch (RuntimeException e) {
            System.out.println("In pressing transaction bank has occurred error");
        }
    }
}

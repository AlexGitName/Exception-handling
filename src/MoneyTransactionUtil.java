public class MoneyTransactionUtil {
    int numberFrom, numberTo, sum;


    public static void sendTo(int numberFrom, int numberTo, int sum) throws RuntimeException {
        if (numberFrom == numberTo) {
            throw new AccountException("Number of card much");
        }
        if (sum == 0 || sum < 0 || sum > 100000) {
            throw new MoneyValueExeption("Error with sum of transaction. Sum must be more then 0. Sum do not exceed limit 100000");
        }
        else {
            System.out.println("Sum " + sum + ", for account " + numberFrom + ", successfully translated to account " + numberTo );
        }
    }
}

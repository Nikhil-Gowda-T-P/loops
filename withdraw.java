public class withdraw {

    public static void main(String[] args) {
        int amount = 10000; // Initial amount

        // Loop to withdraw 2000rs until the amount becomes less than 0
        while (amount >= 0) {
            System.out.println("Current amount: " + amount);
            amount -= 2000;
        }

        // Print the final amount
        System.out.println("Final amount after withdrawals: " + amount);
    }
    
}

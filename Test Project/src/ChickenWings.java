public class ChickenWings {
    public static void main(String[] args) {
        double totalMoney = 4.75;      // Total money available
        double wingCost = 0.75;        // Cost of one chicken wing

        // Calculate the number of wings you can buy
        int numberOfWings = (int) (totalMoney / wingCost); // Cast to int to avoid partial wings

        // Output the result
        System.out.println("You can buy " + numberOfWings + " chicken wings.");
    }
}


import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Step 2: Display a welcome message and prompt the user for input
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        
        // Step 3: Read user input as a String
        var input_value = sc.nextLine();
        
        // Step 4: Parse the input value to a double
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            // Step 5: Handle the case where input cannot be parsed to a double
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        
        // Step 6: Convert cash value to miles using RewardValue class
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        
        // Step 7: Display the converted miles value
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

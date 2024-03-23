public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Assuming conversion rate of 1 dollar = 100 miles
        this.milesValue = (int) (cashValue * 100);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Inverse conversion from miles to cash
        this.cashValue = milesValue / 100.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    // Method to convert cash to miles
    public static int convertCashToMiles(double cashValue) {
        // Assuming conversion rate of 1 dollar = 100 miles
        return (int) (cashValue * 100);
    }

    // Method to convert miles to cash
    public static double convertMilesToCash(int milesValue) {
        // Inverse conversion from miles to cash
        return milesValue / 100.0;
    }
}

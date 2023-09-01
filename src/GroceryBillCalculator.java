import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coupon amount as a decimal (example, 0.10): ");
        double couponAmount = scanner.nextDouble();

        if (couponAmount > 1.0 || couponAmount <= 0) {
            couponAmount = 0.10;
        }

        double[] weeklyBills = new double[4];

        for (int week = 0; week < 4; week++) {
            System.out.print("Enter grocery bill for week " + (week + 1) + ": ");
            weeklyBills[week] = scanner.nextDouble();
        }
        scanner.close();

        double totalWithoutCoupon = 0;
        double totalWithCoupon = 0;

        for (double bill : weeklyBills) {
            totalWithoutCoupon += bill;
            totalWithCoupon += bill - (bill * couponAmount);
        }
        double monthlyAverageWithoutCoupon = totalWithoutCoupon / 4;
        double monthlyAverageWithCoupon = totalWithCoupon / 4;
        double weeklyAverageWithoutCoupon = totalWithoutCoupon / 16;
        double weeklyAverageWithCoupon = totalWithCoupon / 16;

        System.out.println("\nResults:");
        System.out.println("Monthly total without coupon: $" + totalWithoutCoupon);
        System.out.println("Monthly total with coupon: $" + totalWithCoupon);
        System.out.println("Monthly average without coupon: $" + monthlyAverageWithoutCoupon);
        System.out.println("Monthly average with coupon: $" + monthlyAverageWithCoupon);
        System.out.println("Weekly average without coupon: $" + weeklyAverageWithoutCoupon);
        System.out.println("Weekly average with coupon: $" + weeklyAverageWithCoupon);
    }
}

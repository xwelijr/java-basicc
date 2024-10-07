public class subscriptionService {
    public static void main(String[] args) {
        // This is user information
        String userName = "weliganteng";
        String selectedPlan = "Premium"; // You can change this value to "Basic", "Premium", or "Ultimate"

        // Plan prices
        float basicPlanPrice = 9.99f;
        float premiumPlanPrice = 19.99f;
        float ultimatePlanPrice = 29.99f;

        boolean isLoyaltyMember = true;

        // Initialize final price based on selected plan
        float finalPrice = 0.0f;

        // Determine the final price based on the selected plan
        if (selectedPlan.equals("Basic")) {
            finalPrice = basicPlanPrice;
        } else if (selectedPlan.equals("Premium")) {
            finalPrice = premiumPlanPrice;
        } else if (selectedPlan.equals("Ultimate")) {
            finalPrice = ultimatePlanPrice;
        } else {
            System.out.println("Invalid plan selected.");
            return; // Exit the program if an invalid plan is selected
        }

        // Apply discount if the user is a loyalty member
        if (isLoyaltyMember) {
            finalPrice = finalPrice - (finalPrice * 0.10f); // 10% discount
        }

        // Output the results
        System.out.println("User Name: " + userName);
        System.out.println("Selected Plan: " + selectedPlan);
        System.out.println("Final Price: $" + finalPrice);
    }
}

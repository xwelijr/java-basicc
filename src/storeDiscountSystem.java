public class storeDiscountSystem {
    public static void main (String[] args) {
        int customerSpend = 888; // Amount the customer spent
        float finalPrice;

        // if-else conditions to apply discount
        if (customerSpend > 500) {
            finalPrice = customerSpend - (customerSpend * 0.20f); // 20% discount
        } else if (customerSpend >= 300 && customerSpend <= 500) {
            finalPrice = customerSpend - (customerSpend * 0.15f); // 15% discount
        } else if (customerSpend >= 100 && customerSpend <= 300) {
            finalPrice = customerSpend - (customerSpend * 0.10f); // 10% discount
        } else {
            finalPrice = customerSpend; // No discount
        }
        System.out.println("Final Price : $ " + finalPrice);
    }
}

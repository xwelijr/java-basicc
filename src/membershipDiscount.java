public class membershipDiscount {
    public static void main(String[] args) {
        int membershipType = 2; // Change this value to test different cases
        String nameMembership;
        float basePrice = 100.0f;
        float discountRate;

        switch (membershipType) {
            case 1:
                discountRate = 0.20f;
                nameMembership = "Gold Membership";
                break;
            case 2:
                discountRate = 0.15f;
                nameMembership = "Silver Membership";
                break;
            case 3:
                discountRate = 0.10f;
                nameMembership = "Bronze Membership";
                break;
            case 4:
                discountRate = 0.0f;
                nameMembership = "No Membership";
                break;
            default:
                discountRate = -1;
                nameMembership = "Invalid Membership Type";
                break;
        }

        // Handle invalid membership type
        if (discountRate == -1) {
            System.out.println(nameMembership);
        } else {
            // Calculated logic
            float finalPrice = basePrice * (1 - discountRate);

            System.out.println("Membership Type: " + nameMembership);
            System.out.println("Discount Rate: " + (discountRate * 100) + "%");
            System.out.println("Final Price after Discount: $" + finalPrice);
        }
    }
}

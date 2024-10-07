public class FastFoodRestaurant {
    public static void main(String[] args) {
        int menuItem = 99;
        String priceName;
        float priceItem;

        switch (menuItem) {
            case 1:
                priceName = "Burger";
                priceItem = 5.00f;
                break;
            case 2:
                priceName = "Fries";
                priceItem = 2.50f;
                break;
            case 3:
                priceName = "Soda";
                priceItem = 1.75f;
                break;
            case 4:
                priceName = "Salad";
                priceItem = 4.00f;
                break;
            default:
                priceName = "Invalid";
                priceItem = -1;
                break;
        }

        if (priceItem == -1) {
            System.out.println(priceName); // Display "Invalid" message
        } else {
            System.out.println("The price of " + priceName + " is: $ " + priceItem);
        }
    }
}

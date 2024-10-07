public class CoffeeShopMenu {
    public static void main(String[] args) {
        int coffeeType = 2; // Change this value to test different cases
        float coffeePrice;

        switch (coffeeType) {
            case 1:
                coffeePrice = 3.00f;
                break;
            case 2:
                coffeePrice = 4.50f;
                break;
            case 3:
                coffeePrice = 4.00f;
                break;
            case 4:
                coffeePrice = 3.50f;
                break;
            default:
                coffeePrice = -1; // Use -1 or another value to indicate invalid selection
                break;
        }

        if (coffeePrice == -1) {
            System.out.println("Invalid selection");
        } else {
            System.out.println("The price of the coffee is: $" + coffeePrice);
        }
    }
}

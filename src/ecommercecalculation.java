
public class ecommercecalculation {
    public static void main (String[] args) {

        // information customer
        String customerName = "Alice";
        String customerID = "202";

        // Shopping cart information
        float item1Price = 50.00f;
        float item2Price = 30.00f;
        float item3Price = 20.00f;

        // discount rate
        float taxRate = 0.07f;
        float discountRate = 0.10f;

        // Calculation
        float totalPriceBeforeDiscount = item1Price + item2Price + item3Price;
        float discountAmount = totalPriceBeforeDiscount * discountRate;
        float priceAfterDiscount = totalPriceBeforeDiscount - discountAmount;
        float totalPriceAfterTax = priceAfterDiscount + (priceAfterDiscount * taxRate);

        System.out.println("Customer Name : " + customerName);
        System.out.println("Custoemr ID : " + customerID);
        System.out.println("Item 1 Price : " + item1Price);
        System.out.println("Item 2 Price : " + item2Price);
        System.out.println("Item 3 Price : " + item3Price);
        System.out.println("Total Price Before Discount : " + totalPriceBeforeDiscount);
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Price After Discount : " + priceAfterDiscount);
        System.out.println("Total Price After Tax : "  + totalPriceAfterTax);

    }

}

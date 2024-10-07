public class gadgetInformationSystem {
    public static void main (String [] args) {
        String gadgetName = "Smartphone";
        String gadgetModel = "Galaxy S21";
        float priceGadget = 9000.0f;
        float discountRate = 0.50f;
        float taxRate = 0.15f;

        // Calculation

        float discountAmount = priceGadget * discountRate;
        float priceAfterDiscount = priceGadget - discountAmount;
        float taxAmount = priceAfterDiscount * taxRate;
        float totalPriceAfterTax = taxAmount + priceAfterDiscount;

        System.out.println("Gadget Name : " + gadgetName);
        System.out.println("Gadget Model : " + gadgetModel);
        System.out.println("Price Gadget : " + priceGadget);
        System.out.println("Discount Rate : " + discountRate);
        System.out.println("Tax Rate : " + taxRate);
        System.out.println("Total Price : " +totalPriceAfterTax);

    }
}

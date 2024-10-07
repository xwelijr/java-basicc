public class ifelse {
    public static void main (String[] args) {
        float customerSpend = 100.0f;
        int personAge = 11;
        float finalPrice;

        // if else conditions ?

        if (personAge >= 65 ) {
            finalPrice = customerSpend - (customerSpend * 0.30f);
        } else if (personAge >= 13 && personAge <= 18) {
            finalPrice = customerSpend - (customerSpend * 0.12f);
        } else if (personAge < 13 ) {
            finalPrice = customerSpend - (customerSpend * 0.50f);
        } else {
            finalPrice = customerSpend; //no discount
        }

         System.out.println("Final Price : $" + finalPrice);
    }
}

public class telco {
    public static void main (String[] args) {
        float baseCoast = 10.0f;
        int dataUsage = 1;
        boolean isLoyaltyMember = true;

        float totalCost = baseCoast * dataUsage;

       if (dataUsage > 20 ) {
           totalCost = totalCost - (totalCost * 0.15f);
       }
       else if (dataUsage < 5) {
           totalCost = totalCost + 5.0f;
       }

       if (isLoyaltyMember){
           totalCost = totalCost - (totalCost * 0.05f);
       }

       // print
        System.out.println("Final Price . $" + totalCost);

    }
}

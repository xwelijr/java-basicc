public class electricitybill {
    public static void main (String[] args) {
        float baseCoastPerKwh = 0.25f;
        int electricityUsage = 500;
        boolean isLoyaltyMember = true;


        // calculated logic
        float finalBill = baseCoastPerKwh * electricityUsage;

        // if else
        if (electricityUsage > 500) {
            finalBill = finalBill - (finalBill * 0.10f);
        }

        // if the usage is lower than 100kWh
        else if (electricityUsage < 100) {
            finalBill = finalBill + 15.0f;
        }

        if (isLoyaltyMember) {
            finalBill = finalBill - (finalBill * 0.05f);
        }

        System.out.println("Final Bill $" + finalBill);

    }
}

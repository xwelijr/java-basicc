public class travelCalculation {
    public static void displayTripDetails(TravelInfo trip) {
    }

    public class TravelCalculation {
        // Method to calculate the total fuel cost
        public static float calculateFuelCost(TravelInfo trip) {
            return (trip.travelDistance / trip.fuelEfficiency) * trip.fuelPricePerLiter;
        }

        // Method to calculate the total trip cost
        public static float calculateTotalCost(TravelInfo trip) {
            float fuelCost = calculateFuelCost(trip);
            return fuelCost + trip.foodExpenses;
        }

        // Method to display travel details and costs
        public static void displayTripDetails(TravelInfo trip) {
            System.out.println("Destination: " + trip.destination);
            System.out.println("Travel Distance: " + trip.travelDistance + " km");
            System.out.println("Fuel Efficiency: " + trip.fuelEfficiency + " km/l");
            System.out.println("Fuel Price per Liter: $" + trip.fuelPricePerLiter);
            System.out.println("Food Expenses: $" + trip.foodExpenses);

            float totalFuelCost = calculateFuelCost(trip);
            float totalCost = calculateTotalCost(trip);

            System.out.println("Total Fuel Cost: $" + totalFuelCost);
            System.out.println("Total Trip Cost: $" + totalCost);
        }
    }

}

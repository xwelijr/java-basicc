public class TravelInfo {
    // Attributes
    String destination;
    int travelDistance;
    float fuelEfficiency;
    float fuelPricePerLiter;
    float foodExpenses;

    // Constructor to initialize the attributes
    public TravelInfo(String destination, int travelDistance, float fuelEfficiency, float fuelPricePerLiter, float foodExpenses) {
        this.destination = destination;
        this.travelDistance = travelDistance;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelPricePerLiter = fuelPricePerLiter;
        this.foodExpenses = foodExpenses;
    }
}

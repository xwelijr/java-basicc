public class MovieTicketPrice {
    public static void main(String[] args) {
        int age = 25; // Set the age value to test different scenarios
        int ticketPrice;

        // Check the age and assign the ticket price based on conditions
        if (age < 12) {
            ticketPrice = 5; // For children under 12
        } else if (age <= 60) {
            ticketPrice = 10; // For adults between 12 and 60
        } else {
            ticketPrice = 7; // For seniors over 60
        }

        // Output the result
        System.out.println("Age: " + age);
        System.out.println("Ticket Price: $" + ticketPrice);
    }
}

public class MovieTicketPricing {
    public static void main(String[] args) {
        int typeOfWeek = 1; // Change this value to test different days
        String dayOfWeek;
        float priceMovie;
        boolean isMovie3d = true; // Change to false to test no 3D
        boolean isCustStudent = false; // Change to true to test student discount

        // Determine the day of the week and the base price
        switch (typeOfWeek) {
            case 1:
                dayOfWeek = "Monday";
                priceMovie = 10.0f;
                break;
            case 2:
                dayOfWeek = "Tuesday";
                priceMovie = 10.0f;
                break;
            case 3:
                dayOfWeek = "Wednesday";
                priceMovie = 10.0f;
                break;
            case 4:
                dayOfWeek = "Thursday";
                priceMovie = 10.0f;
                break;
            case 5:
                dayOfWeek = "Friday";
                priceMovie = 12.0f;
                break;
            case 6:
                dayOfWeek = "Saturday";
                priceMovie = 12.0f;
                break;
            case 7:
                dayOfWeek = "Sunday"; // Corrected from "Monday" to "Sunday"
                priceMovie = 12.0f;
                break;
            default:
                dayOfWeek = "Invalid";
                priceMovie = 0;
                break;
        }

        // Apply additional charges or discounts
        if (isMovie3d) {
            priceMovie += 3.00f;
        }

        if (isCustStudent) {
            priceMovie -= 2.00f;
        }

        // Ensure the final price is not negative
        priceMovie = Math.max(priceMovie, 0);

        // Print the results
        System.out.println("Day of the Week: " + dayOfWeek);
        System.out.println("Final Price of the Movie: $" + priceMovie);
    }
}

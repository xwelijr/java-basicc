import org.w3c.dom.ls.LSOutput;

public class loopgaming {
    public static void main(String[] args) {
        int sum = 0;

        // Loop from 2 to 20, incrementing by 2 to get only even numbers
        for (int i = 1; i <= 15; i += 3 ) {
            sum += i; // Add each even number to the sum
        }

        // Print the total sum
        System.out.println("The sum of even numbers from 2 to 20 is: " + sum);
    }
}
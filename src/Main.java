import java.util.Scanner;

class BirthMonth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Ask the user to enter their birth month
        // Check if the input is a valid integer
        // Check if the month is between 1 and 12
        // Display the birth month or an error message

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            int month = in.nextInt();
            in.nextLine();

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Run the program again and enter a valid number!");
        }
    }
}
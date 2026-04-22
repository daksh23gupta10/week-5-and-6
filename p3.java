import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}

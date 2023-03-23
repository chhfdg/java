import java.util.Scanner;

 class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input from the user
        System.out.print("Enter the number to be printed: ");
        int num = input.nextInt();
        System.out.print("Max Number of times printed: ");
        int n = input.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        input.close();
    }
}

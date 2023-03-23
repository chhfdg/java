import java.util.Scanner;

 class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            int yearsLeft = 18 - age;
            System.out.println("Sorry, you are not eligible to vote yet.");
            System.out.println("You will be eligible to vote in " + yearsLeft + " years.");
        } else {
            System.out.println("Congratulations, you are eligible to vote!");
        }
    }
}

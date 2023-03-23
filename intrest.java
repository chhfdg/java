import java.util.Scanner;

 class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();
        System.out.print("Are you a senior citizen? (true/false): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

        double rateOfInterest = isSeniorCitizen ? 0.12 : 0.10;
        double simpleInterest = (principal * rateOfInterest * time);

        System.out.println("Simple Interest: " + simpleInterest);
    }
}

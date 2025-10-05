import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose the input unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();

        switch (choice) {
            case 1:
                // Celsius to Fahrenheit and Kelvin
                double f1 = (temperature * 9 / 5) + 32;
                double k1 = temperature + 273.15;
                System.out.printf("%.2f°C = %.2f°F\n", temperature, f1);
                System.out.printf("%.2f°C = %.2fK\n", temperature, k1);
                break;

            case 2:
                // Fahrenheit to Celsius and Kelvin
                double c2 = (temperature - 32) * 5 / 9;
                double k2 = c2 + 273.15;
                System.out.printf("%.2f°F = %.2f°C\n", temperature, c2);
                System.out.printf("%.2f°F = %.2fK\n", temperature, k2);
                break;

            case 3:
                // Kelvin to Celsius and Fahrenheit
                double c3 = temperature - 273.15;
                double f3 = (c3 * 9 / 5) + 32;
                System.out.printf("%.2fK = %.2f°C\n", temperature, c3);
                System.out.printf("%.2fK = %.2f°F\n", temperature, f3);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        sc.close();
    }
}

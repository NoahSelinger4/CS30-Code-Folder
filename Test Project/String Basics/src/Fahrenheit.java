//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class Fahrenheit {
    // Method to convert Celsius to Fahrenheit
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();
        
        // Convert and display the result
        double fahrenheit = convertToFahrenheit(celsiusInput);
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsiusInput, fahrenheit);
        
        scanner.close();
    }
}


    }
}


//Program Name: Assignment8
//Student Name: Noah Selinger
//Date: October 5th 2024
//Program Description: Program that takes input of two integers and two doubles and adds them together

import static java.lang.System.*;
import java.util.Scanner;

public class Assignment8 {
public static void main (String[] args)

  {

      Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");
      intOne = keyboard.nextInt();

      System.out.print("Enter an integer :: ");
      intTwo = keyboard.nextInt();

      double doubleOne, doubleTwo; 

      System.out.print("Enter an double :: ");
      doubleOne = keyboard.nextDouble();

      System.out.print("Enter an double :: ");
      doubleTwo = keyboard.nextDouble();

 
      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);


 
      System.out.println("double one = " + doubleOne);
      System.out.println("double two = " + doubleTwo);

      int intAdded = intOne + intTwo;
      double doubleAdded = doubleOne + doubleTwo;

      System.out.println("intOne + intTwo = " + intAdded);
      System.out.println("doubleOne + doubleTwo = " + doubleAdded);

   }
}

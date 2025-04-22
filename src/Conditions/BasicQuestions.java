package Conditions;
import java.util.*;

public class BasicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Odd or Even
        System.out.println("1. Odd or Even");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // 2. Maximum of Two Numbers
        System.out.println("\n2. Maximum of Two Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Max is: " + a);
        } else {
            System.out.println("Max is: " + b);
        }

        // 3. Positive / Negative / Zero
        System.out.println("\n3. Positive / Negative / Zero");
        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        if (value > 0) {
            System.out.println("Positive");
        } else if (value < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // 4. Leap Year Checker
        System.out.println("\n4. Leap Year Checker");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        // 5. Grade Calculator
        System.out.println("\n5. Grade Calculator");
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

        // 6. Vowel or Consonant
        System.out.println("\n6. Vowel or Consonant");
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        // 7. Simple Calculator
        System.out.println("\n7. Simple Calculator");
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.println("Result: " + (n1 + n2));
            case '-' -> System.out.println("Result: " + (n1 - n2));
            case '*' -> System.out.println("Result: " + (n1 * n2));
            case '/' -> System.out.println("Result: " + (n1 / n2));
            case '%' -> System.out.println("Result: " + (n1 % n2));
            default -> System.out.println("Invalid operator");
        }

        // 8. Triangle Validity Check
        System.out.println("\n8. Triangle Validity Check");
        System.out.print("Enter three angles of a triangle: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        // 9. Number in Range 1 to 100
        System.out.println("\n9. Number in Range 1-100");
        System.out.print("Enter a number: ");
        int check = sc.nextInt();
        if (check >= 1 && check <= 100) {
            System.out.println("Yes, number is in range 1-100");
        } else {
            System.out.println("No, number is out of range");
        }

        // 10. Smallest of Three Numbers
        System.out.println("\n10. Smallest of Three ");
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int smallest = (x < y && x < z) ? x : (y < z ? y : z);
        System.out.println("Smallest number is: " + smallest);
    }
}

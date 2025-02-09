import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) { //Defining main method

Scanner input = new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");

double radius = input.nextDouble();
double area = Math.PI * Math.pow(radius, 2);
double circumference = 2 * Math.PI * radius;

System.out.printf("Radius: %.2f%n", radius); //Printing all out the declared variables
System.out.printf("Area: %.2f%n", area);
System.out.printf("Circumference: %.2f%n", circumference);
input.close();

    }
}
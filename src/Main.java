import java.util.Scanner;

/*
    Name: Callum Anderson
    Course: COMP 1131
    Assignment: 2.3
    Professor: Aaron Hunter
    Date: December 9, 2022
*/
public class Main {
    public static void main(String[] args) {
        // create scanner object reference
        Scanner scanner = new Scanner(System.in);
        // capture radius input
        System.out.println("Enter radius of sphere: ");
        double radius = scanner.nextDouble();

        System.out.println(CalculateCircumference(radius));
        System.out.println(CalculateVolume(radius));
        System.out.println(CalculateSurfaceArea(radius));
    }

    private static double CalculateSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    private static double CalculateVolume(double radius) {
        return radius;
    }

    private static double CalculateCircumference(double radius) {
        return radius;
    }
}
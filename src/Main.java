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

        // capture radius input and assign to variable
        System.out.println("Enter radius of sphere: ");
        double radius = scanner.nextDouble();

        // call each method to calculate volume, SA and circumference
        // pass radius as parameter to each method
        // round to 4 decimal places using format method
        System.out.format("Volume: %.4f \n", CalculateVolume(radius));
        System.out.format("Surface area: %.4f \n", CalculateSurfaceArea(radius));
        System.out.format("Circumference: %.4f", CalculateCircumference(radius));
    }

    private static double CalculateVolume(double radius) {
        // calculate and return the volume of sphere based on passed in radius
        // below volume formula is java implementation of  4/3 π r3
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    private static double CalculateSurfaceArea(double radius) {
        // calculate and return surface area of sphere based on passed in radius
        // below surface area formula is java implementation of 2 π r
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    private static double CalculateCircumference(double radius) {
        // calculate and return circumference of sphere based on passed in radius
        // below circumference formula is java implementation of 2 π r
        return 2 * Math.PI * radius;
    }
}
// Aim: Write a program to calculate volume of sphere using multilevel inheritance. The base class
//      method will accept the radius from user. A class will be derived from above mentioned class that
//      will have a method to find area of circle and another class derived from this will have methods to
//      calculate and display the volume of sphere.
// Name: Adyan Shaikh
// UIN: 231P063

package Experiment_7;
import java.util.Scanner;

class Radius {
    double radius(double r) {
        return r;
    }
}

class Area extends Radius {
    double area(double r) {
        return (3.14 * radius(r) * radius(r));
    }
}

class Volume extends Area {
    double volume(double r) {
        return ((4.0 / 3.0) * (radius(r) * area(r)));
    }

    void display(double r) {
        System.out.println("The volume of the sphere is: " + volume(r));
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Volume a = new Volume();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
        a.display(radius);
        sc.close();
        System.out.println("Name: Adyan Shaikh \nUIN:231P063 \nBranch:Comps A");
    }
}

package baskara;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, X1 = 0, X2 = 0, delta = 0;
        System.out.print(" Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();
        delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println(" Esta equação não possui raizes reais ");
        } else if (delta == 0) {
            X1 = -b + Math.sqrt(delta) / (2 * a);
            System.out.println("X1 = " + String.format("%.6f", X1));
            System.out.println("X2 = " + String.format("%.6f", X1));
        } else if (delta > 0) {
            X1 = -b + Math.sqrt(delta) / (2 * a);
            X2 = -b - Math.sqrt(delta) / (2 * a);
            System.out.println("X1 = " + String.format("%.6f", X1));
            System.out.println("X2 = " + String.format("%.6f", X2));
        }

    }
}
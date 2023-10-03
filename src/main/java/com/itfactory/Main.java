package com.itfactory;

import com.itfactory.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeometricFigure geometricFigure = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam alegeti figura geometrica pentru care doriti sa calculati perimetrul.");
        System.out.println("Optiunile dumneavoastra sunt urmatoarele: 0 - triunghi; 1 - cerc; 2 - dreptunghi; 3 - patrat.");
        String option = scanner.nextLine();
        switch (option) {
            case "0":
                System.out.print("Introduceti dimensiunea primei catete:");
                double sideLength1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Introduceti dimensiunea celei de-a doua catete:");
                double sideLength2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Introduceti dimensiunea ipotenuzei:");
                double hypotenuseLength = Double.parseDouble(scanner.nextLine());
                geometricFigure = new Triangle(sideLength1, sideLength2, hypotenuseLength);
                System.out.println("Perimetrul triunghiului este egal cu: " + geometricFigure.calculatePerimeter());
                break;
            case "1":
                System.out.print("Introduceti dimensiunea razei cercului:");
                double radius = Double.parseDouble(scanner.nextLine());
                geometricFigure = new Circle(radius);
                System.out.println("Perimetrul cercului este egal cu: " + geometricFigure.calculatePerimeter());
                break;
            case "2":
                System.out.print("Introduceti dimensiunea lungimii dreptunghiului:");
                double length = Double.parseDouble(scanner.nextLine());
                System.out.print("Introduceti dimensiunea latimii dreptunghiului:");
                double width = Double.parseDouble(scanner.nextLine());
                geometricFigure = new Rectangle(length, width);
                System.out.println("Perimetrul dreptunghiului este egal cu: " + geometricFigure.calculatePerimeter());
                break;
            case "3":
                System.out.print("Introducetii dimensiunea laturii patratului:");
                double sideLength = Double.parseDouble(scanner.nextLine());
                geometricFigure = new Square(sideLength);
                System.out.println("Perimetrul patratului este egal cu: " + geometricFigure.calculatePerimeter());
                break;
            default:
                System.out.print("Optiunea introdusa de catre dumneavoastra nu este valida.");
        }
    }
}

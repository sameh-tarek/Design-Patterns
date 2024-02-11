package org.example;

import org.example.operatingsystem.factory.OperatingSystemFactory;
import org.example.operatingsystem.factory.impl.OperatingSystemFactoryImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start....");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which OS you want to create?");
        System.out.println("1. Windows OS");
        System.out.println("2. Linux OS");
        System.out.println("3. Android OS");

        int choice = scanner.nextInt();

        OperatingSystemFactory osFactory = new OperatingSystemFactoryImpl();
        osFactory.createOS(choice).boot();
    }
}
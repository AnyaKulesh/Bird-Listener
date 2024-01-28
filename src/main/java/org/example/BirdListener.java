package org.example;

import org.example.homework.BirdUtils;

import java.util.Scanner;

public class BirdListener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a bird:");
        System.out.println("1 - Cuckoo");
        System.out.println("2 - Nightingale");
        System.out.println("Press any other number to exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> BirdUtils.callCuckoo();
            case 2 -> BirdUtils.callNightingale();
        }
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021
 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int length = name.length();
        String output = String.format(name + " has "+ length + " characters.");

        System.out.print(output);
        scanner.close();
    }
}
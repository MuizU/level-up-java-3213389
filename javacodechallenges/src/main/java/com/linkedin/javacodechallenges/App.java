package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        boolean hasNum = password.chars().anyMatch(Character::isDigit);
        boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = password.chars().anyMatch(Character::isLowerCase);
        return password.length() >= 6 && hasNum && hasUpper && hasLower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}

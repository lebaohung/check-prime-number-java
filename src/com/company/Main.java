package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("CHECK PRIME NUMBER.");
        System.out.print("Enter positive integer number: ");
        Scanner scanner = new Scanner(System.in);
        String yearStr = scanner.nextLine();
        if(yearStr.matches("^(-?)[0-9]+$") ) {
            int year = Integer.parseInt(yearStr);
            if (year <= 1 || (year > 2 && year % 2 == 0)){
                System.out.println(year + " is not a prime number");
            } else {
                switch (year){
                    case 2:
                    case 3:
                        System.out.println(year + " is a prime number");
                        break;
                    default:
                        boolean status = true;
                        for (int i = 3; i < Math.sqrt(year); i+=2) {
                            if (year % i == 0) {
                                System.out.println(year + " is not a prime number");
                                status = false;
                                break;
                            }
                        }
                        if (status) System.out.println(year + " is a prime number");
                }
            }
        } else {
            System.out.println("\n" + yearStr + " : Invalid input!");
            main(args);
        }
    }
}


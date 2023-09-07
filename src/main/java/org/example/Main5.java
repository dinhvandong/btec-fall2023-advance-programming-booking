package org.example;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int n = 1234;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        n = scanner.nextInt();
        while(n>0){
            int d = n%10;
            System.out.println(d);
            n = n/10;

        }
        scanner.close();

    }
}

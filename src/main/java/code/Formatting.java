package main.java.code;

import java.util.Scanner;

public class Formatting {

    private static void formattedInput() {
        
        //Formatted input
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um endereço: ");
        String eStr = s.nextLine();
        System.out.println("O endereço digitado foi: " + eStr);

    }

    private static void formattedOutput() {

        //Formatted output
        //Formated output
        int x = 4, y = 8;
        System.out.printf("%d/%d = %f%n", y,x , (float)(y/x) );

    }

    private static void sumOutput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Limite: ");
        int limit = sc.nextInt();
        int sum = 0;

        for(var i = 1; i <= limit; i++) {
            System.out.printf("%3d. Partial sum = %6d%n", i, sum);
            sum += i;
        }

        System.out.printf("Total sum[0..%3d] = %6d%n", limit, sum);
        sc.close();

    }

    public static void main(String[] args) {
        // formattedInput();
        // formattedOutput();
        sumOutput();
    }
}
package main.java.code;

import java.util.Calendar;
import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite no. do mes [1-12]? ");
        int mes = s.nextInt();

        int ndias = switch(mes) {
            case 1, 3, 5, 7, 8, 10, 12: yield 31;
            case 4, 6, 9, 11: yield 30;
            default: yield 28 + (Calendar.getInstance().get(Calendar.YEAR) % 4 == 0 ? 1 : 0);
        };
        System.out.printf("Mes #%d tem %d dias.\n", mes, ndias);
    }
}
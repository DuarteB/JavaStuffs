package main.java.code;

public class BreakDirective {
    public static void main(String[] args) {
        int valor = 10;

        for(int i = 1; i < 100; i++) {
            System.out.println("Valor = " + valor + " i = " + i);
            if(valor/i == 2) {
                break;
            }
        }
    }
}
// Escreva um programa que leia o termo inicial e a razão de uma progressão aritmética e imprima os 5 primeiros termos desta progressão.
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inicial, razao;

        System.out.print("Insira o termo inicial: ");
        inicial = sc.nextDouble();

        System.out.print("Insira a razão: ");
        razao = sc.nextDouble();

        double termo = inicial;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Termo %d: %.2f%n", i + 1, termo + (razao * i));
        }

        sc.close();

    }
}

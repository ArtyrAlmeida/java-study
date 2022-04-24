// Faça um programa que receba 3 inteiros e calcule a média aritmética entre eles
import java.util.Scanner;

public class Ex001 {
    public static void main(String args[]) {
        int valor1, valor2, valor3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");
        valor2 = sc.nextInt();

        System.out.print("Insira o terceiro valor: ");
        valor3 = sc.nextInt();

        double media = (double) (valor1 + valor2 + valor3) / 3;

        System.out.printf("A média é %.2f%n", media);

        sc.close();
    }
}
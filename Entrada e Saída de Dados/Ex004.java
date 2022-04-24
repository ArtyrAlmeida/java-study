// Escreva um programa que leia os valores de dois ângulos internos de um triângulo e calcule o valor do terceiro ângulo
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 180,
               a1, a2, a3;

        System.out.print("Insira o valor do primeiro ângulo: ");
        a1 = sc.nextDouble();

        System.out.print("Insira o valor do segundo ângulo: ");
        a2 = sc.nextDouble();

        a3 = soma - a1 - a2;

        System.out.printf("O valor do terceiro ângulo é %.2f%n", a3);

        sc.close();
    }
}

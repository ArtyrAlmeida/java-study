//Escreva um programa que leia o número inteiro positivo e calcule o seu dobro, o seu triplo, o seu quadrado, o seu cubo e a sua raiz quadrada.
import java.util.Scanner;
import java.lang.Math;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiro;

        do {
            System.out.print("Insira um inteiro positivo: ");
            inteiro = sc.nextInt();
        }while (inteiro < 0);

        int dobro = inteiro * 2,
            triplo = inteiro * 3,
            quadrado = inteiro * inteiro,
            cubo = quadrado * inteiro;

        double raiz = Math.sqrt(inteiro);

        System.out.printf("Inteiro: %d%nDobro: %d%nTriplo: %d%nQuadrado: %d%nCubo: %d%nRaiz Quadrada: %.2f%n", inteiro, dobro, triplo, quadrado, cubo, raiz);
        sc.close();
    }
}

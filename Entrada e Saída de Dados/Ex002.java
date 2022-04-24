// Escreva um programa que leia o valor do lado de um quadrado e calcule a sua área e o seu perímetro.
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;
        
        System.out.print("Insira a medida do lado do quadrado: ");
        lado = sc.nextDouble();

        if(lado < 0) {
            lado *= -1;
        }

        double area = lado * lado,
               perimetro = lado * 4;
            
        System.out.printf("A área vale %.2f e o perímetro vale %.2f%n", area, perimetro);

        sc.close();
    }
}

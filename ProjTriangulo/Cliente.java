package ProjTriangulo;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira os valores dos lados do triangulo: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();

            Triangulo trianguloDigitado = new Triangulo(a, b, c);

            if(trianguloDigitado.isEquilatero()) {
                System.out.println("O triangulo eh equilatero");
            } else if (trianguloDigitado.isIsoceles()) {
                System.out.println("O triangulo eh isoceles");
            } else if (trianguloDigitado.isEscaleno()) {
                System.out.println("O triangulo eh escaleno");
            } else {
                System.out.println("O triangulo eh invalido");
            }
        }
    }
}

package ProjTriangulo;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;
    private boolean ehValido;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ehValido = isTriangulo();
    }

    private boolean isTriangulo() {
        return ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB;
    }
}
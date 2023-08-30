package ProjTriangulo;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    private boolean isTriangulo() {
        return ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB;
    }

    public boolean isIsoceles() {
        return isTriangulo() && (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC);
    }

    public boolean isEquilatero() {
        return isTriangulo() && (ladoA == ladoB && ladoC == ladoB);
    }

    public boolean isEscaleno() {
        return isTriangulo() && (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC);
    }
}
package ProjDado;

public class Cliente {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int i = 0; i < 3; i++) {


            dado1.sortearDado();
            dado2.sortearDado();

            int resultadoDosDados = dado1.getLadoSorteado() + dado2.getLadoSorteado();

            System.out.printf("Dado1: %d, Dado2: %d | Resultado: %d\n", dado1.getLadoSorteado(), dado2.getLadoSorteado(), resultadoDosDados);
        }
    }
}

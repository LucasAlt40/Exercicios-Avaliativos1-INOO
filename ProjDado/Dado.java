package ProjDado;

import java.util.Random;

public class Dado {

    private int ladoSorteado;

    public void sortearDado() {
        Random gerador = new Random();
        ladoSorteado = gerador.nextInt(1, 6);
    }

    public int getLadoSorteado() {
        return ladoSorteado;
    }
}

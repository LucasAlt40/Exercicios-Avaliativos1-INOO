package ProjUsMoney;

public class Cliente {
    public static void main(String[] args) {
        UsMoney money1 = new UsMoney(5, 0);
        UsMoney money2 = new UsMoney(1, 0);

        UsMoney money3 = money1.plus(money2);

        System.out.println(money3.mostraValor());
    }
}

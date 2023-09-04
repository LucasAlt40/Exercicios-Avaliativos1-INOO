package ProjUsMoney;

public class Cliente {
    public static void main(String[] args) {

        // Caso 1 - centavos em 0 sem precisar somar com dolar
        UsMoney money1Case1 = new UsMoney(5, 0);
        UsMoney money2Case1 = new UsMoney(1, 0);
        UsMoney money3Case1 = money1Case1.plus(money2Case1);

        // Caso 2 - centavos acima de 99 para somar com dolar
        UsMoney money1Case2 = new UsMoney(12, 800);
        UsMoney money2Case2 = new UsMoney(1, 30);
        UsMoney money3Case2 = money1Case2.plus(money2Case2);

        // Caso 3 - centavos nas duas instancias acima de 99 para somar com dolar
        UsMoney money1Case3 = new UsMoney(12, 521);
        UsMoney money2Case3 = new UsMoney(121, 330);
        UsMoney money3Case3 = money1Case3.plus(money2Case3);

        // Caso 4 - dolar com valor negativo deveria retornar "valor invalido"
        UsMoney money1Case4 = new UsMoney(-12, 521);
        UsMoney money2Case4 = new UsMoney(121, 330);
        UsMoney money3Case4 = money1Case4.plus(money2Case4);

        // Caso 5 - centavo com valor negativo deveria retornar "valor invalido"
        UsMoney money1Case5 = new UsMoney(76, 21);
        UsMoney money2Case5 = new UsMoney(87, -213);
        UsMoney money3Case5 = money1Case5.plus(money2Case5);


        System.out.println(money3Case1.mostraValor());
        System.out.println(money3Case2.mostraValor());
        System.out.println(money3Case3.mostraValor());
        System.out.println(money3Case4.mostraValor());
        System.out.println(money3Case5.mostraValor());

    }
}

package ProjUsMoney;

public class UsMoney {
    private int cents;
    private int dollars;

    public UsMoney(int dollars, int cents) {
        this.cents = cents;
        this.dollars = dollars;
        if(isCentsValid() && isDollarValid()) {
            addCentsToDollars();
        }
    }

    public int getCents() {
        return cents;
    }

    public int getDollars() {
        return dollars;
    }

    private boolean isCentsValid() {
        return cents >= 0;
    }

    private boolean isDollarValid() {
        return dollars >= 0;
    }

    private boolean isCentsValidToAdd() {
        return cents > 99;
    }

    private void addCentsToDollars() {
        if(isCentsValidToAdd()) {
            dollars += cents / 100;
            cents = cents % 100;
        }
    }

    public UsMoney plus(UsMoney usMoney) {
        int newCents = usMoney.getCents() + this.cents;
        int newDollars = usMoney.getDollars() + this.dollars;

        return new UsMoney(newDollars, newCents);
    }

    public String mostraValor() {
        if(isCentsValid() && isDollarValid()) {
            return "Valor: " + dollars + " dollars e " + cents + " cents";
        }
        return "Valor invalido.";
    }
}

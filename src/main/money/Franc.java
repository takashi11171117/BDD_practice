package money;

public class Franc {
    private int amount;
    Franc(int amount) {
        this. amount = amount;
    }
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    public boolean equals(Object object) {
        Franc flanc = (Franc) object;
        return amount == flanc.amount;
    }
}

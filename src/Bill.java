public class Bill {
    private int denomination;
    private int amount;

    public Bill(int denomination, int amount) {
        this.denomination = denomination;
        this.amount = amount;
    }

    public int getDenomination() {
        return denomination;
    }

    public int getAmount() {
        return amount;
    }
}

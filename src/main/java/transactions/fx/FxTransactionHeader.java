package transactions.fx;

import transactions.Transaction;

/**
 * Created by artem on 14.04.15.
 */
public class FxTransactionHeader implements Transaction {
    private final String instrumentPair;
    private final FxTransactionDirection direction;
    private final int amountsLeft;
    private final int amountsRight;

    public FxTransactionHeader(String instrumentPair, FxTransactionDirection direction, int amountsLeft, int amountsRight) {
        this.instrumentPair = instrumentPair;
        this.direction = direction;
        this.amountsLeft = amountsLeft;
        this.amountsRight = amountsRight;
    }

    public String getInstrumentPair() {
        return instrumentPair;
    }

    public FxTransactionDirection getDirection() {
        return direction;
    }

    public int getAmountsLeft() {
        return amountsLeft;
    }

    public int getAmountsRight() {
        return amountsRight;
    }
}

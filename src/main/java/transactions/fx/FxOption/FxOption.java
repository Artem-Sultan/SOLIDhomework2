package transactions.fx.FxOption;

import transactions.Transaction;
import transactions.TransactionHeader;
import transactions.fx.FxTransactionHeader;

/**
 * Created by artem on 03.04.15.
 */
public class FxOption implements Transaction {
    private final TransactionHeader transactionHeader;
    private final FxTransactionHeader fxTransactionHeader;
    private final OptionType optionType;
    private final double strike;
    private final double price;


    public FxOption(TransactionHeader transactionHeader, FxTransactionHeader fxTransactionHeader, OptionType optionType, double strike, double price) {
        this.transactionHeader = transactionHeader;
        this.fxTransactionHeader = fxTransactionHeader;
        this.optionType = optionType;
        this.strike = strike;
        this.price = price;
    }

    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    public FxTransactionHeader getFxTransactionHeader() {
        return fxTransactionHeader;
    }

    public OptionType getOptionType() {
        return optionType;
    }

    public double getStrike() {
        return strike;
    }

    public double getPrice() {
        return price;
    }
}

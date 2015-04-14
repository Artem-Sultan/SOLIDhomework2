package transactions.fx.SimpleFx;

import transactions.Transaction;
import transactions.TransactionHeader;
import transactions.fx.FxTransactionHeader;

import java.time.LocalDate;

/**
 * Created by artem on 03.04.15.
 */
public class SimpleFx implements Transaction {
    private final TransactionHeader transactionHeader;
    private final FxTransactionHeader fxTransactionHeader;
    private final double rate;
    private final LocalDate settlementDate;


    public SimpleFx(TransactionHeader transactionHeader, FxTransactionHeader fxTransactionHeader, double rate, LocalDate settlementDate) {
        this.transactionHeader = transactionHeader;
        this.fxTransactionHeader = fxTransactionHeader;
        this.rate = rate;
        this.settlementDate = settlementDate;
    }

    public double getRate() {
        return rate;
    }

    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    public FxTransactionHeader getFxTransactionHeader() {
        return fxTransactionHeader;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }
}

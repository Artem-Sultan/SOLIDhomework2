package transactions.equity;

import transactions.Transaction;
import transactions.TransactionHeader;

/**
 * Created by artem on 03.04.15.
 */
public class EquityTransaction implements Transaction {
    private final TransactionHeader transactionHeader;
    private final EquityTransactionHeader equityTransactionHeader;


    public EquityTransaction(TransactionHeader transactionHeader, EquityTransactionHeader equityTransactionHeader) {
        this.transactionHeader = transactionHeader;
        this.equityTransactionHeader = equityTransactionHeader;
    }

    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    public EquityTransactionHeader getEquityTransactionHeader() {
        return equityTransactionHeader;
    }
}

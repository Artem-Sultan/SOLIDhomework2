package transactions.fx.FxOption;

import transactions.Transaction;
import transactionGeneration.abstractFactory.TransactionFactory;

import java.util.List;

/**
 * Created by artem on 14.04.15.
 */
public class FxOptionFactory implements TransactionFactory {
    @Override
    public Transaction createTransactionWithArgumentList(List<String> argumentList) {
        return null;
    }
}

package transactionGeneration.abstractFactory;

import transactions.Transaction;

import java.util.List;

/**
 * Created by artem on 14.04.15.
 */
public interface TransactionFactory {
    Transaction createTransactionWithArgumentList(List<String> argumentList);
}

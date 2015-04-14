package transactionsDbSave;

import transactions.Transaction;

/**
 * Created by artem on 14.04.15.
 */
public interface DbSaver {
    DbSaveMessage saveTransaction (Transaction transaction);
}

package transactionsDbSave;

import transactions.Transaction;

import java.sql.Connection;

/**
 * Created by artem on 14.04.15.
 */
public class DbSaverSQL implements DbSaver {
    private final Connection connection;

    public DbSaverSQL(Connection connection) {
        this.connection = connection;
    }

    @Override
    public DbSaveMessage saveTransaction(Transaction transaction) {
        return null;
    }
}

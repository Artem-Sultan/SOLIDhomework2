package transactionGeneration.abstractFactory;

import transactions.equity.EquityTransactionFactory;
import transactions.fx.FxOption.FxOptionFactory;
import transactions.fx.SimpleFx.SimpleFxFactory;

/**
 * Created by artem on 03.04.15.
 */
public class TransactionFactoryProducer {
    public static TransactionFactory getTransactionFactory(String transactionType) {
        switch (transactionType){
            case "Equity": return new EquityTransactionFactory();
            case "FxOption": return new FxOptionFactory();
            case "Fx": return new SimpleFxFactory();
            default: throw new IllegalArgumentException("Wrong transaction type");
        }
    }
}

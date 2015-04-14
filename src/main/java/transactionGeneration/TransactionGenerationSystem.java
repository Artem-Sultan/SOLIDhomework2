package transactionGeneration;

import transactionGeneration.parser.Parser;
import transactionGeneration.parser.ParserOutputParameters;
import transactionGeneration.abstractFactory.TransactionFactoryProducer;
import transactions.Transaction;

/**
 * Created by artem on 14.04.15.
 */
public class TransactionGenerationSystem {
    private Parser parser;

    public TransactionGenerationSystem(Parser parser) {
        this.parser = parser;
    }

    public Transaction getTransactionFromMessage(String message) {
        ParserOutputParameters parameters = parser.parse(message);
        return TransactionFactoryProducer.getTransactionFactory(parameters.getTransactionType()).createTransactionWithArgumentList(parameters.getTransactionParameters());
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public Parser getParser() {
        return parser;
    }
}

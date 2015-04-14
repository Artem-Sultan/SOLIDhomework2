package transactionGeneration.parser;

import java.util.List;

/**
 * Created by artem on 14.04.15.
 */
public class ParserOutputParameters {
    private final String transactionType;
    private final List<String> transactionParameters;

    public ParserOutputParameters(String transactionType, List<String> transactionParameters) {
        this.transactionType = transactionType;
        this.transactionParameters = transactionParameters;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public List<String> getTransactionParameters() {
        return transactionParameters;
    }

}

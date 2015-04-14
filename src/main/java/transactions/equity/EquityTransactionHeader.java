package transactions.equity;

import java.time.LocalDate;

/**
 * Created by artem on 14.04.15.
 */
public class EquityTransactionHeader {
    private final String instrument;
    private final int amounts;
    private final double price;
    private final String currency;
    private final LocalDate settlementDate;

    public EquityTransactionHeader(String instrument, int amounts, double price, String currency, LocalDate settlementDate) {
        this.instrument = instrument;
        this.amounts = amounts;

        this.price = price;
        this.currency = currency;
        this.settlementDate = settlementDate;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAmounts() {
        return amounts;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }
}

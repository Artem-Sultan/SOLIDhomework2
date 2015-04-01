package ru.sbt.bit.ood.patterns.mc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;

public class DefaultTradeValidator implements TradeValidator {

    private Collection<String> knownCcyPairs = Arrays.asList("EURUSD", "USDRUB", "EURRUB", "GBPUSD");

    @Override
    public TradeValidationStatus validateFxSpotTrade(String currencyPair, double leftAmount, double rate, LocalDate date, LocalTime time) {
        return knownCcyPairs.contains(currencyPair) ? TradeValidationStatus.OK : TradeValidationStatus.WARNING;
    }

    @Override
    public TradeValidationStatus validateFxOptionTrade(String currencyPair, double leftAmount, double price, double strike, LocalDate date, LocalTime time) {
        return price < (strike - 1.33) * leftAmount ? TradeValidationStatus.OK : TradeValidationStatus.ALERT;
    }

    @Override
    public TradeValidationStatus validateEquityTrade(String currencyPair, double qty, double price, LocalDate date, LocalTime time) {
        return TradeValidationStatus.WARNING;
    }

}

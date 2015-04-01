package ru.sbt.bit.ood.patterns.mc;

import java.time.LocalDate;
import java.time.LocalTime;

public interface TradeValidator {

    TradeValidationStatus validateFxSpotTrade(String currencyPair, double leftAmount, double rate, LocalDate date, LocalTime time);
    TradeValidationStatus validateFxOptionTrade(String currencyPair, double leftAmount, double price, double strike, LocalDate date, LocalTime time);
    TradeValidationStatus validateEquityTrade(String currencyPair, double qty, double price, LocalDate date, LocalTime time);

}

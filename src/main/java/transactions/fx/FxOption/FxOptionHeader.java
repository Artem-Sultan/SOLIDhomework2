package transactions.fx.FxOption;

/**
 * Created by artem on 14.04.15.
 */
public class FxOptionHeader {
    private final OptionType optionType;
    private final double strike;
    private final double price;

    public FxOptionHeader(OptionType optionType, double strike, double price) {
        this.optionType = optionType;
        this.strike = strike;
        this.price = price;
    }

    public OptionType getOptionType() {
        return optionType;
    }

    public double getStrike() {
        return strike;
    }

    public double getPrice() {
        return price;
    }
}

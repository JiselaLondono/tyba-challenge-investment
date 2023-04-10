package Utils;

public enum InvestmentProduct {
    CDT("CDT", 0.07),
    STOCKS("Acciones", 0.12),
    INVESTMENT_FUNDS("Fondos de inversión", 0.2);

    private final String name;
    private final Double percentage;

    InvestmentProduct(String name, Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public Double getPercentage() {
        return percentage;
    }
}

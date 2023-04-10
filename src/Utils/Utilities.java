package Utils;

import java.text.DecimalFormat;

public final class Utilities {

    public static String getFormattedNumber(double number) {
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(number);
    }

    public static String getCalculatedProfit(int amount, double percentage) {
        double profit = amount + amount * percentage;
        return getFormattedNumber(profit);
    }

    public static InvestmentProduct getInvestmentProduct(int amount) {
        if (amount < 5000000) {
            return InvestmentProduct.CDT;
        } else if (amount < 25000000) {
            return InvestmentProduct.STOCKS;
        } else {
            return InvestmentProduct.INVESTMENT_FUNDS;
        }
    }
}

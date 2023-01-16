package util;

public class CurrencyConverter {

	public static Double dollarValue(Double dollarPrice, Double dollarBought) {
		Double dollarValue = dollarBought * dollarPrice;
		return dollarValue + dollarValue * 6 / 100;
	}

}

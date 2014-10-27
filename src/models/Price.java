package models;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
	private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;
	private static int DECIMALS = Currency.getInstance("USD").getDefaultFractionDigits(); //In the US this is 2.
	private BigDecimal price;
	
	public Price(String money)
	{
		this.price  = new BigDecimal(money);
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal subtractFromBalance(String balanceInAccount)
	{
		BigDecimal balance = new BigDecimal(balanceInAccount);
		
		BigDecimal result = balance.subtract(this.getPrice());
		
		return result;
	}
	public BigDecimal subtractFromBalance(BigDecimal other)
	{
		return other.subtract(this.getPrice());
	}
	

}

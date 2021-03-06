package com.dagobert_engine.core.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Statistics for a currency
 * 
 * @author Michael Kunzmann (mail@michaelkunzmann.com)
 * @version 0.1-ALPHA
 *
 * License http://www.apache.org/licenses/LICENSE-2.0
 *
 */
@XmlRootElement
public class CurrencyStatistics {
	
	/**
	 * Last trade in aux currency
	 */
	@XmlElement
	private CurrencyData lastTradeDefaultCurrency;
	
	/**
	 * Last trade of any currency
	 */
	@XmlElement
	private CurrencyData lastTradeAnyCurrency;
	
	/**
	 * Last trade converted to aux currency
	 */
	@XmlElement
	private CurrencyData lastTradeConvertedToDefault;
	
	/**
	 * Time of data
	 */
	@XmlElement
	private Date time;
	
	/**
	 * Time of data in micro seconds
	 */
	@XmlElement
	private long timestampMicroSecs;
	
	/**
	 * Buy
	 */
	@XmlElement
	private CurrencyData buy;
	

	/**
	 * Sell
	 */
	@XmlElement
	private CurrencyData sell;
	
	
	
	public CurrencyStatistics(CurrencyData lastTradeDefaultCurrency,
			CurrencyData lastTradeAnyCurrency,
			CurrencyData lastTradeConvertedToDefault, Date time,
			long timestampMicroSecs, CurrencyData buy, CurrencyData sell) {
		super();
		this.lastTradeDefaultCurrency = lastTradeDefaultCurrency;
		this.lastTradeAnyCurrency = lastTradeAnyCurrency;
		this.lastTradeConvertedToDefault = lastTradeConvertedToDefault;
		this.time = time;
		this.timestampMicroSecs = timestampMicroSecs;
		this.buy = buy;
		this.sell = sell;
	}

	public CurrencyStatistics() {
		
	}
	
	public CurrencyData getLastTradeDefaultCurrency() {
		return lastTradeDefaultCurrency;
	}
	public void setLastTradeDefaultCurrency(CurrencyData lastTradeDefaultCurrency) {
		this.lastTradeDefaultCurrency = lastTradeDefaultCurrency;
	}
	public CurrencyData getLastTradeAnyCurrency() {
		return lastTradeAnyCurrency;
	}
	public void setLastTradeAnyCurrency(CurrencyData lastTradeAnyCurrency) {
		this.lastTradeAnyCurrency = lastTradeAnyCurrency;
	}
	public CurrencyData getLastTradeConvertedToDefault() {
		return lastTradeConvertedToDefault;
	}
	public void setLastTradeConvertedToDefault(
			CurrencyData lastTradeConvertedToDefault) {
		this.lastTradeConvertedToDefault = lastTradeConvertedToDefault;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public long getTimestampMicroSecs() {
		return timestampMicroSecs;
	}
	public void setTimestampMicroSecs(long timestampMicroSecs) {
		this.timestampMicroSecs = timestampMicroSecs;
	}

	public CurrencyData getBuy() {
		return buy;
	}

	public void setBuy(CurrencyData buy) {
		this.buy = buy;
	}

	public CurrencyData getSell() {
		return sell;
	}

	public void setSell(CurrencyData sell) {
		this.sell = sell;
	}
	
	
	
}

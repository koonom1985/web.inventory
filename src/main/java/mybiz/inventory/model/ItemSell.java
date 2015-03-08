package mybiz.inventory.model;

// Generated 2015-2-14 12:51:33 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * ItemSell generated by hbm2java
 */
public class ItemSell implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long itemSellId;
	private Long itemSellItemInId;
	private Integer sellSiez;
	private BigDecimal sellPrice;
	private Date sellDatetime;
	private String sellAddress;
	private BigDecimal sellTelphone;
	
	private ItemIn itemIn;

	public ItemSell() {
	}

	public ItemSell(int itemSellId) {
		this.itemSellId = itemSellId;
	}

	public ItemSell(int itemSellId, Long itemSellItemInId, Integer sellSiez,
			BigDecimal sellPrice, Date sellDatetime, String sellAddress,
			BigDecimal sellTelphone) {
		this.itemSellId = itemSellId;
		this.itemSellItemInId = itemSellItemInId;
		this.sellSiez = sellSiez;
		this.sellPrice = sellPrice;
		this.sellDatetime = sellDatetime;
		this.sellAddress = sellAddress;
		this.sellTelphone = sellTelphone;
	}

	public long getItemSellId() {
		return this.itemSellId;
	}

	public void setItemSellId(long itemSellId) {
		this.itemSellId = itemSellId;
	}

	public Long getItemSellItemInId() {
		return this.itemSellItemInId;
	}

	public void setItemSellItemInId(Long itemSellItemInId) {
		this.itemSellItemInId = itemSellItemInId;
	}

	public Integer getSellSiez() {
		return this.sellSiez;
	}

	public void setSellSiez(Integer sellSiez) {
		this.sellSiez = sellSiez;
	}

	public BigDecimal getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Date getSellDatetime() {
		return this.sellDatetime;
	}

	public void setSellDatetime(Date sellDatetime) {
		this.sellDatetime = sellDatetime;
	}

	public String getSellAddress() {
		return this.sellAddress;
	}

	public void setSellAddress(String sellAddress) {
		this.sellAddress = sellAddress;
	}

	public BigDecimal getSellTelphone() {
		return this.sellTelphone;
	}

	public void setSellTelphone(BigDecimal sellTelphone) {
		this.sellTelphone = sellTelphone;
	}

	public ItemIn getItemIn() {
		return itemIn;
	}

	public void setItemIn(ItemIn itemIn) {
		this.itemIn = itemIn;
	}

}

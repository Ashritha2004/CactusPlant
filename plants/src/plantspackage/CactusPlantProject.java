package plantspackage;

import java.math.BigDecimal;

public class CactusPlantProject{
	private String pname;
	private BigDecimal original_price;
	private BigDecimal discount_price;
	private String image;

	public CactusPlantProject() {}

	public CactusPlantProject(String pname, BigDecimal original_price, BigDecimal discount_price, String image) {
		this.pname = pname;
		this.original_price = original_price;
		this.discount_price = discount_price;
		this.image = image;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public BigDecimal getOriginalprice() {
		return original_price;
	}

	public void setOriginalprice(BigDecimal original_price) {
		this.original_price = original_price;
	}
	
	public BigDecimal getDiscountprice() {
		return discount_price;
	}

	public void setDiscountprice(BigDecimal discount_price) {
		this.discount_price = discount_price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "CactusPlantProject [pname=" + pname + ", original_price=" + original_price + ", discount_price="
				+ discount_price + ", image=" + image + "]";
	}
	

}
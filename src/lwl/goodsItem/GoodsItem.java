package lwl.goodsItem;

import java.math.BigDecimal;

public class GoodsItem {
	
	private String goodsId;

	private String picturePath;
	
	private String goodsName;
	
	private String goodsColor;
	
	private BigDecimal nowGoodsPrice;
	
	private BigDecimal pastGoodsPrice;
	
	private int goodsCount;
	
	private BigDecimal prices;

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsColor() {
		return goodsColor;
	}

	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}

	public BigDecimal getNowGoodsPrice() {
		return nowGoodsPrice;
	}

	public void setNowGoodsPrice(BigDecimal nowGoodsPrice) {
		this.nowGoodsPrice = nowGoodsPrice;
	}

	public BigDecimal getPastGoodsPrice() {
		return pastGoodsPrice;
	}

	public void setPastGoodsPrice(BigDecimal pastGoodsPrice) {
		this.pastGoodsPrice = pastGoodsPrice;
	}

	public int getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(int goodsCount) {
		this.goodsCount = goodsCount;
	}

	public BigDecimal getPrices() {
		return prices;
	}

	public void setPrices(BigDecimal prices) {
		this.prices = prices;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	
	@Override
	 public boolean equals(Object obj){  
        if(obj == null){  
            return false;  
        }  
        //如果是同一个对象返回true，反之返回false  
        if(this == obj){  
            return true;  
        }   
        //判断是否类型相同  
        if(this.getClass() != obj.getClass()){  
            return false;  
        }  
        GoodsItem user = (GoodsItem)obj;  
        return goodsId.equals(user.goodsId);  
    }
	
}

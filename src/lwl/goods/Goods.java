package lwl.goods;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Goods {

	private String goodsId;
	
	private String goodsName;
	
	private int goodsType;
	
	private BigInteger goodsNum; 
	
	private BigDecimal nowGoodsPrice;
	
	private BigDecimal pastGoodsPrice;
	
	private String picturePath;
	
	private String pictureName;
	
	private String goodsColor;
	
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}

	public BigInteger getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(BigInteger goodsNum) {
		this.goodsNum = goodsNum;
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

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public String getGoodsColor() {
		return goodsColor;
	}

	public void setGoodsColor(String goodsColor) {
		this.goodsColor = goodsColor;
	}
	
	public static void main(String[] args) {
		System.out.println("aaaa");
	}

	
}

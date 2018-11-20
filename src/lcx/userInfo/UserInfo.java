package lcx.userInfo;

public class UserInfo {
	
	private String userId ;					//用户编号
	private String receiptName;		//收货人
	private String phoneNumber;	//联系方式
	private String province;				//省
	private String city;							//市
	private String country;					//县
	private String detail;						//详细信息
	private int defaultAddres;		//是否为默认地址
	//下面是get和set方法
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReceiptName() {
		return receiptName;
	}
	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getDefaultAddres() {
		return defaultAddres;
	}
	public void setDefaultAddres(int defaultAddres) {
		this.defaultAddres = defaultAddres;
	}
}

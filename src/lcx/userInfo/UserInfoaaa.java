package lcx.userInfo;

public class UserInfoaaa {
	//关于地址的解释：
	//地址序列：一个人的多个收货地址需要去 加一个特殊的数字去识别，否则无法使用
	//默认收货地址：用0表示是默认收货地址，1表示不是默认收货地址
	private String userId ;					//用户编号
	private String receiptName;		//收货人
	private String phoneNumber;	//联系方式
	private String province;				//省
	private String city;							//市
	private String country;					//县
	private String detail;						//详细信息
	private int defaultAddres;		//地址序列
	private int defaultAddressNum; //是否为默认收货地址
	public int getDefaultAddressNum() {
		return defaultAddressNum;
	}
	public void setDefaultAddressNum(int defaultAddressNum) {
		this.defaultAddressNum = defaultAddressNum;
	}
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

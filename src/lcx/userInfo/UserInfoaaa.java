package lcx.userInfo;

public class UserInfoaaa {
	//���ڵ�ַ�Ľ��ͣ�
	//��ַ���У�һ���˵Ķ���ջ���ַ��Ҫȥ ��һ�����������ȥʶ�𣬷����޷�ʹ��
	//Ĭ���ջ���ַ����0��ʾ��Ĭ���ջ���ַ��1��ʾ����Ĭ���ջ���ַ
	private String userId ;					//�û����
	private String receiptName;		//�ջ���
	private String phoneNumber;	//��ϵ��ʽ
	private String province;				//ʡ
	private String city;							//��
	private String country;					//��
	private String detail;						//��ϸ��Ϣ
	private int defaultAddres;		//��ַ����
	private int defaultAddressNum; //�Ƿ�ΪĬ���ջ���ַ
	public int getDefaultAddressNum() {
		return defaultAddressNum;
	}
	public void setDefaultAddressNum(int defaultAddressNum) {
		this.defaultAddressNum = defaultAddressNum;
	}
	//������get��set����
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

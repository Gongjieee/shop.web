package lcx.userInfo;

import java.util.List;

public class UserInfoservice {

	public List<UserInfoaaa> ModifyInfo(UserInfoaaa userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().ModifyInfoDao(userInfo);
		}else {
			System.out.println("ModifyInfoserviceû�н��յ�����!!!!!!!");
			return null;
		}
	}
	
	public boolean delInfo(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().delInfoDao(userId, defaultAddres);
		}else {
			System.out.println("delInfoserviceû�н��յ�����!!!!!!!!");
			return false;
		}
	}
	
	public boolean addInfo(UserInfoaaa userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().addInfoDao(userInfo);
		}else {
			System.out.println("addInfoserviceû�н��յ�����!!!!!!!!");
			return false;
		}
	}
	
	public boolean modifyDefaultAddress(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().modifyDefaultAddressDao(userId, defaultAddres);
		}else {
			System.out.println("modifyDefaultAddressserviceû�н��յ����ݣ���������");
			return false;
		}
	}
	
	public List<UserInfoaaa> searchUserInfoService(String userId) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().searchUserInfoDao(userId);
		}else {
			System.err.println("searchUserInfoServiceû�н��յ����ݣ���������");
			return null;
		}
	}
}

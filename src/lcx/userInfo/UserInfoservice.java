package lcx.userInfo;

import java.util.List;

public class UserInfoservice {

	public List<UserInfoaaa> ModifyInfo(UserInfoaaa userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().ModifyInfoDao(userInfo);
		}else {
			System.out.println("ModifyInfoservice没有接收到数据!!!!!!!");
			return null;
		}
	}
	
	public boolean delInfo(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().delInfoDao(userId, defaultAddres);
		}else {
			System.out.println("delInfoservice没有接收到数据!!!!!!!!");
			return false;
		}
	}
	
	public boolean addInfo(UserInfoaaa userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().addInfoDao(userInfo);
		}else {
			System.out.println("addInfoservice没有接收到数据!!!!!!!!");
			return false;
		}
	}
	
	public boolean modifyDefaultAddress(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().modifyDefaultAddressDao(userId, defaultAddres);
		}else {
			System.out.println("modifyDefaultAddressservice没有接收到数据！！！！！");
			return false;
		}
	}
	
	public List<UserInfoaaa> searchUserInfoService(String userId) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().searchUserInfoDao(userId);
		}else {
			System.err.println("searchUserInfoService没有接收到数据！！！！！");
			return null;
		}
	}
}

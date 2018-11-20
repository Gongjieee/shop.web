package lcx.userInfo;

import java.util.List;

public class UserInfoservice {

	public List<UserInfo> ModifyInfo(UserInfo userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().ModifyInfoDao(userInfo);
		}else {
			System.out.println("没有接收到数据");
			return null;
		}
	}
	
	public boolean delInfo(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().delInfoDao(userId, defaultAddres);
		}else {
			System.out.println("没有接收到数据");
			return false;
		}
	}
	
	public boolean addInfo(UserInfo userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().addInfoDao(userInfo);
		}else {
			System.out.println("没有接收到数据");
			return false;
		}
	}
	
	public boolean modifyDefaultAddress(String userId,int defaultAddres) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().modifyDefaultAddressDao(userId, defaultAddres);
		}else {
			System.out.println("没有接收到数据！！！！！");
			return false;
		}
	}
	
	public List<UserInfo> searchUserInfoService(String userId) {
		if((!"".equals(userId))&&userId!=null) {
			return new UserInfoDao().searchUserInfoDao(userId);
		}else {
			System.out.println("没有接收到数据！！！！！");
			return null;
		}
	}
}

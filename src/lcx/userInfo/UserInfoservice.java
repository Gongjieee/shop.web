package lcx.userInfo;

public class UserInfoservice {

	public boolean ModifyInfo(UserInfo userInfo) {
		if((!"".equals(userInfo.getUserId()))&&userInfo.getUserId()!=null) {
			return new UserInfoDao().ModifyInfoDao(userInfo);
		}else {
			System.out.println("没有接收到数据");
			return false;
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
}

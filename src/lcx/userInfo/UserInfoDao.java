package lcx.userInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import commen.utils.DbUtil;

/**
 * 收货地址处理Dao层 
 * @author ChenxiLi
 *
 */
public class UserInfoDao {
	
	/**
	 * 
	 * 修改收货地址
	 * @param userInfo
	 * @return
	 */
	public List<UserInfoaaa> ModifyInfoDao(UserInfoaaa userInfo) {
		String sql = "update user_info set receipt_name ='"+userInfo.getReceiptName()+"',phonenumber = '"+userInfo.getPhoneNumber()+"',province='"+userInfo.getProvince()+"',city='"+userInfo.getCity()+"',county='"+userInfo.getCountry()+"',detail='"+userInfo.getDetail()+"' where user_id = '"+userInfo.getUserId()+"' and default_add="+userInfo.getDefaultAddres();
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			statement.execute(sql);
			return new UserInfoDao().searchUserInfoDao(userInfo.getUserId());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement);
		}
		return null;
	}
	
	/**
	 * 删除收货地址
	 * @param userId
	 * @param defaultAddres
	 * @return
	 */
	public boolean delInfoDao(String userId,int defaultAddres) {
		String sql = "delete from user_info where user_id ='"+userId+"' and default_add="+defaultAddres;
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			return statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement);
		}
		return false;
	}
	
	/**
	 * 添加收货地址
	 * @param userInfo
	 * @return
	 */
	public boolean addInfoDao(UserInfoaaa userInfo) {
		String sql1 = "select default_add from user_info where user_id='"+userInfo.getUserId()+"'";
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			rs = statement.executeQuery(sql1);
			int i=0;
			while(rs.next()) {
				i++;
			}
			userInfo.setDefaultAddres(i);
			String sql = "insert into user_info values('"+userInfo.getUserId()+"','"+userInfo.getReceiptName()+"', '"+userInfo.getPhoneNumber()+"','"+userInfo.getProvince()+"','"+userInfo.getCity()+"','"+userInfo.getCountry()+"','"+userInfo.getDetail()+","+userInfo.getDefaultAddres();
			return statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement, rs);
		}
		return false;
	}
	
	/**
	 * 设置默认地址
	 * @param userId
	 * @param defaultAddres
	 * @return
	 */
	public boolean modifyDefaultAddressDao(String userId,int defaultAddres) {
		String sql = "update user_info set default_addnum = "+1+" where user_id='"+userId+"' and default_addnum ="+0;
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			statement.execute(sql);
			sql = "update user_info set default_addnum = "+0+"where user_id ='"+userId+"' and default_add = "+defaultAddres;
			return statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement);
		}
		return false;
	}
	
	/**
	 * 查询收货地址
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("null")
	public List<UserInfoaaa> searchUserInfoDao(String userId) {
		String sql ="select * from user_info where user_id = '"+userId+"'";
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<UserInfoaaa> arrayList = null;
		UserInfoaaa userInfo = null;
		arrayList = new ArrayList<UserInfoaaa>();
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				userInfo.setUserId(userId);
				userInfo.setReceiptName(rs.getString(1));
				userInfo.setPhoneNumber(rs.getString(2));
				userInfo.setProvince(rs.getString(3));
				userInfo.setCity(rs.getString(4));
				userInfo.setCountry(rs.getString(5));
				userInfo.setDetail(rs.getString(6));
				userInfo.setDefaultAddres(rs.getInt(7));
				userInfo.setDefaultAddressNum(rs.getInt(8));
				arrayList.add(userInfo);
			}
			return arrayList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	} 
}

package lcx.userInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import commen.utils.DbUtil;

public class UserInfoDao {
	
	public boolean ModifyInfoDao(UserInfo userInfo) {
		String sql = "update user_info set receipt_name ='"+userInfo.getReceiptName()+"',phonenumber = '"+userInfo.getPhoneNumber()+"',province='"+userInfo.getProvince()+"',city='"+userInfo.getCity()+"',county='"+userInfo.getCountry()+"',detail='"+userInfo.getDetail()+"' where user_id = '"+userInfo.getUserId()+"' and default="+userInfo.getDefaultAddres();
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
	
	public boolean delInfoDao(String userId,int defaultAddres) {
		String sql = "delete from user_info where user_id ='"+userId+"' and default="+defaultAddres;
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
	
	public boolean addInfoDao(UserInfo userInfo) {
		String sql = "insert into user_info set valus('"+userInfo.getUserId()+"' andreceipt_name ='"+userInfo.getReceiptName()+"',phonenumber = '"+userInfo.getPhoneNumber()+"',province='"+userInfo.getProvince()+"',city='"+userInfo.getCity()+"',county='"+userInfo.getCountry()+"',detail='"+userInfo.getDetail()+",default="+userInfo.getDefaultAddres();
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
}

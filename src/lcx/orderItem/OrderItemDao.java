package lcx.orderItem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import commen.utils.DbUtil;

public class OrderItemDao {

	public void setOrderItem(OrderItem order,int defaultAddress) {
		String sql= "select * from user_info where user_id ='"+order.getUserId()+"' and default_add="+defaultAddress;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs =null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			order.setUserName(rs.getString(1));
			order.setPhoneNumber(rs.getString(2));
			order.setProvince(rs.getString(3));
			order.setCity(rs.getString(4));
			order.setCounty(rs.getString(5));
			order.setDetail(rs.getString(6));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement,rs);
		}
	}
}

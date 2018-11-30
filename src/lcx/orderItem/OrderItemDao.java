package lcx.orderItem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import commen.utils.DbUtil;

public class OrderItemDao {

	public void setOrderItem(OrderItem order,int defaultAddress) {
		
		String sql= "";
		Connection conn = null;
		Statement statement = null;
		try {
			conn = DbUtil.getConn();
			statement = conn.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, statement);
		}
	}
}

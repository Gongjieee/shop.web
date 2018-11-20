package commen.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alibaba.druid.pool.DruidDataSource;

public class DbUtil {

	private static DruidDataSource dds;		
	private static String url= "jdbc:mysql://localhost:3306/xtnbteam";
	private static String driverClassName= "com.mysql.jdbc.Driver";
	private static String username= "root";
	private static String password= "root";
	
	static {
		dds = new DruidDataSource();
		dds.setUrl(url);
		dds.setDriverClassName(driverClassName);
		dds.setUsername(username);
		dds.setPassword(password);
	}
	
	public static DruidDataSource getDataSource() {
		return dds;
	}
	
	public static Connection getConn() {
		try {
			return dds.getPooledConnection().getConnection();
		} catch (SQLException e) {
			System.out.println("ªÒ»° ß∞‹£°£°£°");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close( Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close( Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close( Connection conn,Statement st) {
		
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close( ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void close( Connection conn,Statement st,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package gzj.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import commen.utils.DbUtil;
import gzj.customer.Shop;

public class RegisterAndLoginDao {
	
	private QueryRunner qr = null;
	
	public void init() {
		qr = new QueryRunner(DbUtil.getDataSource());
	}

	/**
	 * 添加用户（邮箱用户）
	 * @param shop
	 */
	public void addMail(Shop shop) {
		init();
		String sql = "insert into user(user_id,password,mail) values (?,?,?)";
		try {
			qr.insert(sql, new BeanListHandler<Shop>(Shop.class),shop.getUser_id(),shop.getPassword(),shop.getMail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 添加用户（手机用户）
	 */
	public void addPhone(Shop shop) {
		init();
		String sql = "insert into user(user_id,password,phone) values (?,?,?)";
		try {
			qr.insert(sql, new BeanListHandler<Shop>(Shop.class),shop.getUser_id(),shop.getPassword(),shop.getPhone());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 查询是否有邮箱，用户名，手机号,与密码配对，若成功返回true
	 * @param shop
	 */
	public List<Shop> select(Shop shop) {
		init();
		String sql = "select * from user where password=? and mail=?";
		List<Shop> s = null;
		try {
			s = qr.query(sql, new BeanListHandler<Shop>(Shop.class), shop.getPassword(),shop.getMail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(s.size()==0) {
			sql = "select * from user where password=? and phone=?";
			try {
				s = qr.query(sql, new BeanListHandler<Shop>(Shop.class), shop.getPassword(),shop.getPhone());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return s;
	}
}

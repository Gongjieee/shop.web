package gzj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commen.utils.BaseServlet;
import commen.utils.MD5Util;
import gzj.customer.Shop;
import gzj.dao.RegisterAndLoginDao;

@WebServlet("/login.do")
public class LoginServlet extends BaseServlet {

	private static final long serialVersionUID = -37912240012405082L;

	public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String miPass = MD5Util.getInstance().getMD5(req.getParameter("pass")).toString();
		Shop shop = new Shop();
		System.out.println(123123);
		shop.setMail(req.getParameter("name"));
		shop.setPhone(req.getParameter("name"));
		shop.setPassword(miPass);
		RegisterAndLoginDao rd = new RegisterAndLoginDao();
		List<Shop> s = rd.select(shop);
		if(s.size()==0) {
			System.out.println("没有用户");
		}else {
			Shop sd = s.get(0);
			System.out.println("登陆邮箱："+sd.getMail());
			System.out.println("登陆手机号："+sd.getPhone());
			System.out.println("登陆ID："+sd.getUser_id());
		}
	}
}

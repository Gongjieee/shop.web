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
			req.setAttribute("loginRe", "无此手机号或邮箱，或者密码错误！");
			try {
				req.getRequestDispatcher("home/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}else {
			Shop sd = s.get(0);
			req.getSession().setAttribute("", sd);
			resp.sendRedirect("");//传入的jsp页面自己搞，在这修改后告诉我让我把数据下载下来防止冲突，
								  //注意判断到底是邮箱登陆还是手机号登陆，若为邮箱登陆手机号为null，手机号登陆邮箱为null
		}
	}
}

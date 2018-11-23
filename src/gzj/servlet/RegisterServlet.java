package gzj.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commen.utils.BaseServlet;
import commen.utils.MD5Util;
import gzj.customer.Shop;
import gzj.dao.RegisterAndLoginDao;

@WebServlet("/register.do")
public class RegisterServlet extends BaseServlet {

	private static final long serialVersionUID = 4990061731637159869L;

	/**
	 * 接受email表单提交的数据
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	public void email(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = UUID.randomUUID().toString();
		String miPass = MD5Util.getInstance().getMD5(req.getParameter("passwd")).toString();
		Shop shop = new Shop();
		shop.setMail(req.getParameter("mail"));
		shop.setPassword(miPass);
		shop.setUser_id(id);
		RegisterAndLoginDao rd = new RegisterAndLoginDao();
		rd.addMail(shop);
		
	}
	
	/**
	 * 手机号注册
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	public void phone(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = UUID.randomUUID().toString();
		String miPass = MD5Util.getInstance().getMD5(req.getParameter("passwdd")).toString();
		Shop shop = new Shop();
		shop.setPhone(req.getParameter("telenum"));
		shop.setPassword(miPass);
		shop.setUser_id(id);
		RegisterAndLoginDao rd = new RegisterAndLoginDao();
		rd.addPhone(shop);
		req.getSession().setAttribute("", shop);
		resp.sendRedirect("");//传入的jsp页面自己搞，在这修改后告诉我让我把数据下载下来防止冲突，
							  //注意判断到底是邮箱注册还是手机号注册，若为邮箱注册手机号为null，手机号注册邮箱为null
	}
}

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
	 * 锟斤拷锟斤拷email锟斤拷锟结交锟斤拷锟斤拷锟斤拷
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
		shop.setMail(req.getParameter("mail"));System.out.println(123);
		shop.setPassword(miPass);
		shop.setUser_id(id);
		RegisterAndLoginDao rd = new RegisterAndLoginDao();
		rd.addMail(shop);
		Shop sd=new Shop();
		sd.setLoginPerson(0);
		sd.setMail(req.getParameter("mail"));
		sd.setUser_id(id);
		req.getSession().setAttribute("user", sd);
		resp.sendRedirect("index.jsp");//锟斤拷锟斤拷锟絡sp页锟斤拷锟皆硷拷锟姐，锟斤拷锟斤拷锟睫改猴拷锟斤拷锟斤拷锟斤拷锟斤拷野锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟街癸拷锟酵伙拷锟�
							  //注锟斤拷锟叫断碉拷锟斤拷锟斤拷锟斤拷锟斤拷注锟结还锟斤拷锟街伙拷锟斤拷注锟结，锟斤拷为锟斤拷锟斤拷注锟斤拷锟街伙拷锟斤拷为null锟斤拷锟街伙拷锟斤拷注锟斤拷锟斤拷锟斤拷为null
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
	/**
	 * 锟街伙拷锟斤拷注锟斤拷
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
		Shop sd=new Shop();
		sd.setLoginPerson(0);
		sd.setMail(req.getParameter("telenum"));
		sd.setUser_id(id);
		req.getSession().setAttribute("user", sd);
		resp.sendRedirect("index.jsp");//锟斤拷锟斤拷锟絡sp页锟斤拷锟皆硷拷锟姐，锟斤拷锟斤拷锟睫改猴拷锟斤拷锟斤拷锟斤拷锟斤拷野锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟街癸拷锟酵伙拷锟�
							  //注锟斤拷锟叫断碉拷锟斤拷锟斤拷锟斤拷锟斤拷注锟结还锟斤拷锟街伙拷锟斤拷注锟结，锟斤拷为锟斤拷锟斤拷注锟斤拷锟街伙拷锟斤拷为null锟斤拷锟街伙拷锟斤拷注锟斤拷锟斤拷锟斤拷为null
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}

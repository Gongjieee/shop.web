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
	 * ����email���ύ������
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
		req.getSession().setAttribute("", shop);
		resp.sendRedirect("");//�����jspҳ���Լ��㣬�����޸ĺ���������Ұ���������������ֹ��ͻ��
							  //ע���жϵ���������ע�ỹ���ֻ���ע�ᣬ��Ϊ����ע���ֻ���Ϊnull���ֻ���ע������Ϊnull
	}
	
	/**
	 * �ֻ���ע��
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
		resp.sendRedirect("");//�����jspҳ���Լ��㣬�����޸ĺ���������Ұ���������������ֹ��ͻ��
							  //ע���жϵ���������ע�ỹ���ֻ���ע�ᣬ��Ϊ����ע���ֻ���Ϊnull���ֻ���ע������Ϊnull
	}
}

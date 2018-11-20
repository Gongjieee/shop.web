package gzj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 4990061731637159869L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String mail = req.getParameter("mail");
		System.out.println(mail);
		String passwd = req.getParameter("passwd");
		System.out.println(passwd);
		String passwder = req.getParameter("passwder");
		System.out.println(passwder);
	}
}

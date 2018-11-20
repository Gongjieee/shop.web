package lcx.userInfo.userInfoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commen.utils.FormUtil;
import lcx.userInfo.UserInfo;
import lcx.userInfo.UserInfoservice;

public class AddInfoServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserInfo userInfo = (UserInfo)FormUtil.formToBean(request, UserInfo.class);
		new UserInfoservice().addInfo(userInfo);
	}
}

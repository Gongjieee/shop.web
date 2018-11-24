package lcx.userInfo.userInfoServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import lcx.userInfo.UserInfoaaa;
import lcx.userInfo.UserInfoservice;


@WebServlet("/modifyUserInfo")
public class ModifyUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	List<UserInfoaaa> list = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		UserInfoaaa userInfo = new UserInfoaaa();
		userInfo.setUserId((String) request.getSession().getAttribute("userid"));
		userInfo.setProvince(request.getParameter("province"));
		userInfo.setCity(request.getParameter("city"));
		userInfo.setCountry(request.getParameter("country"));
		userInfo.setDetail("detail");
		userInfo.setDefaultAddressNum(1);
		userInfo.setPhoneNumber(request.getParameter("phoneNumber"));
		list  = new UserInfoservice().ModifyInfo(userInfo);
		response.getWriter().write(new Gson().toJson(list));
		response.getWriter().close();
	}
}

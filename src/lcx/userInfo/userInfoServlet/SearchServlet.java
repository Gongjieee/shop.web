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


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<UserInfoaaa> list = null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("SearchServlet«Î«Û ˝æ›");
		String userId =(String) request.getSession().getAttribute("userid");
		list =  new UserInfoservice().searchUserInfoService(userId);
		response.getWriter().write(new Gson().toJson(list));
		response.getWriter().close();
	}
}

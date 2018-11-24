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
import lcx.userInfo.UserInfoDao;
import lcx.userInfo.UserInfoservice;

@WebServlet("/ModifyDefaultAddressServlet")
public class ModifyDefaultAddressServlet extends HttpServlet{

	List<UserInfoaaa> list = null;
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userid");
		String defaultAddre = request.getParameter("defaultAddres");
		int defaultAddres  = Integer.parseInt(defaultAddre); 
		if(new UserInfoservice().modifyDefaultAddress(userId, defaultAddres)) {
			list =  new UserInfoDao().searchUserInfoDao(userId);
		}
		response.getWriter().write(new Gson().toJson(list));
		response.getWriter().close();
	}
}

package lcx.userInfo.userInfoServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import lcx.userInfo.UserInfoDao;
import lcx.userInfo.UserInfoaaa;
import lcx.userInfo.UserInfoservice;

@WebServlet("/AddInfoServlet")
public class AddInfoServlet extends HttpServlet{

	List<UserInfoaaa> list = null;
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserInfoaaa userInfo = new UserInfoaaa();
		userInfo.setUserId((String) request.getSession().getAttribute("userid"));
		userInfo.setReceiptName(request.getParameter("receiptName"));
		userInfo.setProvince(request.getParameter("province"));
		userInfo.setCity(request.getParameter("city"));
		userInfo.setCountry(request.getParameter("country"));
		userInfo.setDetail(request.getParameter("detail"));
		userInfo.setDefaultAddressNum(1);
		userInfo.setPhoneNumber(request.getParameter("phoneNumber"));
		
		if(new UserInfoservice().addInfo(userInfo)) {
			System.out.println("AddInfoServlet请求数据");
			list =  new UserInfoDao().searchUserInfoDao(userInfo.getUserId());
		}else{
			System.out.println("AddInfoServlet请求数据出错！！！！");
			return;
		}
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().write(new Gson().toJson(list));
		response.getWriter().close();
	}
}

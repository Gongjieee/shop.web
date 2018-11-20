package lcx.userInfo.userInfoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lcx.userInfo.UserInfoservice;

public class ModifyDefaultAddressServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String defaultAddre = request.getParameter("defaultAddres");
		int defaultAddres  = Integer.parseInt(defaultAddre); 
		if(new UserInfoservice().modifyDefaultAddress(userId, defaultAddres)) {
			
		}
	}
}

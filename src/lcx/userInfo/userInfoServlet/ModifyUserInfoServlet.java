package lcx.userInfo.userInfoServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commen.utils.FormUtil;
import lcx.userInfo.UserInfo;
import lcx.userInfo.UserInfoservice;


@WebServlet("/modifyUserInfo")
public class ModifyUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserInfo userInfo = (UserInfo)FormUtil.formToBean(request, UserInfo.class);
		if(new UserInfoservice().ModifyInfo(userInfo)) {//传输数据并返回数据
			
		}else {
			System.out.println("修改数据出错！！！！！");
		}
	}
}

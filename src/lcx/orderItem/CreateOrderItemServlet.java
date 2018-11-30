package lcx.orderItem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import lcx.userInfo.UserInfoaaa;
import lwl.goods.Goods;
import lwl.goods.GoodsDao;


@WebServlet("/OrderItemServlet")
public class CreateOrderItemServlet extends HttpServlet {
	
	/**
	 * 
	 */
	List<UserInfoaaa> list = null;
	Goods good=null;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodsId = request.getParameter("");
		try {
			good = new GoodsDao().getGoodsByGoodsId(goodsId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().write(new Gson().toJson(good));
		response.getWriter().close();
	}
}

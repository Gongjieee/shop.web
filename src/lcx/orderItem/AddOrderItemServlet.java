package lcx.orderItem;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddOrderItemServlet
 */
@WebServlet("/AddOrderItemServlet")
public class AddOrderItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String goodsId = request.getParameter("goodsID");
		String goodsNum = request.getParameter("goodsNum");
		System.out.println(goodsNum);
		int goodsNumber = Integer.parseInt(goodsNum);
		String defaultAddressValue = request.getParameter("defaultAddressValue");
		int defaultAddress = Integer.parseInt(defaultAddressValue);
		String userId = (String)request.getSession().getAttribute("userid");
		OrderItem order = new OrderItem();
		order.setUserId(userId);
		order.setGoodsId(goodsId);
		order.setGoodsNumber(goodsNumber);
		order.setOrderStatus(0);
		order.setOrderId(UUID.randomUUID().toString());
		new OrderItemDao().setOrderItem(order, defaultAddress);
	}

}

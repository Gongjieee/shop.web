package lwl.shopCart;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import commen.utils.BaseServlet;
import lwl.goods.GoodsDao;
import lwl.goodsItem.GoodsItem;
import lwl.goodsItem.GoodsItemService;

@WebServlet("/joinShopCart")
public class JoinShopCartServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
     
	GoodsItemService orderService=new GoodsItemService();
	
	GoodsDao goodsDao=new GoodsDao();

	private JoinShopCartDao showGoodsDao=new JoinShopCartDao();
	
	//生成购物车清单
	public void addShopCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodsId = request.getParameter("goodsId");
		String goodsCount=request.getParameter("goodsCount");
		Object oList = request.getSession().getAttribute("orderItemList");
		List<GoodsItem> gtList = null;
		if(oList != null) {
			gtList = (List<GoodsItem>) oList;
		}else {
			gtList = new LinkedList<GoodsItem>();
		}
		List<GoodsItem> orderItemsList=showGoodsDao.getGoodsCartList(goodsId,goodsCount,gtList);
		request.getSession().setAttribute("orderItemList", orderItemsList); 
		response.sendRedirect("home/shopCart.jsp");
	}
	
	//删除购物车中部分商品
	public void delGoods(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String goodsId = request.getParameter("goodsId");
		Object oList = request.getSession().getAttribute("orderItemList");
		GoodsItem orderItem=orderService.getOrderItemByGoodsId(goodsId);
		List<GoodsItem> gtList = null;
		if(oList != null) {
			gtList = (List<GoodsItem>) oList;
		}else {
			gtList = new LinkedList<GoodsItem>();
		}
		gtList=showGoodsDao.delGoodsList(orderItem, gtList);
		request.getSession().setAttribute("orderItemList", gtList);
		response.sendRedirect("home/shopCart.jsp");
	}

}

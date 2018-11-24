package lwl.goodsItem;

import org.apache.commons.beanutils.BeanUtils;

import lwl.goods.Goods;
import lwl.goods.GoodsDao;

public class GoodsItemService {

	private GoodsDao gd = new GoodsDao();
	
	public GoodsItem getOrderItemByGoodsId(String goodsId) throws Exception {
		GoodsItem gdItem = new GoodsItem();
		Goods goods = gd.getGoodsByGoodsId(goodsId);
		BeanUtils.copyProperties(gdItem, goods);
		return gdItem;
	}
}

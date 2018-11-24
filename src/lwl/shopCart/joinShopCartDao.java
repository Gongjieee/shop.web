package lwl.shopCart;

import java.util.List;

import lwl.goodsItem.GoodsItem;
import lwl.goodsItem.GoodsItemService;

public class joinShopCartDao {
	
	private GoodsItemService goodsItemService=new GoodsItemService();
	  
	public List<GoodsItem> getGoodsCartList(String goodsId,String goodsCount,List<GoodsItem> gtList){
		Integer gc = 0;
		if(goodsCount != null && !"".equals(goodsCount)) {
			gc = Integer.parseInt(goodsCount);
		}else {
			gc = 1;
		}
		boolean isNotExist = true;
		for(GoodsItem oi : gtList) {
			if(oi.getGoodsId().equals(goodsId)) {
				oi.setGoodsCount(oi.getGoodsCount()+gc);
				isNotExist = false;
				break;
			}
		}
		if(isNotExist) {
			try {
				GoodsItem oi = goodsItemService.getOrderItemByGoodsId(goodsId);
				oi.setGoodsCount(gc);
				gtList.add(oi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return gtList;	
		
	}
	
	public List<GoodsItem> delGoodsList(GoodsItem goodsItem,List<GoodsItem> gtList){
		gtList.remove(goodsItem);
		return gtList;
	}
}

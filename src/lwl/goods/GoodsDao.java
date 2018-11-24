package lwl.goods;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import commen.utils.DbUtil;

public class GoodsDao {

private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public Goods getGoodsByGoodsId(String goodsId) throws SQLException {
		String sql = "select goods_Id goodsId, goods_Name goodsName ,now_goods_price  nowGoodsPrice,past_goods_price pastGoodsPrice ,picture_path picturePath,goods_color goodsColor from goods where goods_Id ='" + goodsId + "'" ;
		return qr.query(sql, new BeanHandler<Goods>(Goods.class));
	}
	
	public void deleteGoodsByGoodsId(String goodsId) throws SQLException {
		String sql = "delete from goods where goods_Id ='" + goodsId + "'" ;
		qr.update(sql);
	}
}

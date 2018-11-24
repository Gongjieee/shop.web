<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" scope="session"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>购物车页面</title>

		<link href="${ctxPath }/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="${ctxPath }/basic/css/demo.css" rel="stylesheet" type="text/css" />
		<link href="${ctxPath }/css/cartstyle.css" rel="stylesheet" type="text/css" />
		<link href="${ctxPath }/css/optstyle.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="${ctxPath }/js/jquery.js"></script>

	</head>

	<body>

		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
					<div class="menu-hd">
						<a href="#" target="_top" class="h">亲，请登录</a>
						<a href="#" target="_top">免费注册</a>
					</div>
				</div>
			</ul>
			<ul class="message-r">
				<div class="topMessage home">
					<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
				</div>
				<div class="topMessage my-shangcheng">
					<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
				</div>
				<div class="topMessage mini-cart">
					<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
				</div>
				<div class="topMessage favorite">
					<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
			</ul>
			</div>

			<!--悬浮搜索框-->

			<div class="nav white">
				<div class="logo"><img src="${ctxPath }/images/logo.png" /></div>
				<div class="logoBig">
					<li><img src="${ctxPath }/images/logobig.png" /></li>
				</div>

				<div class="search-bar pr">
					<a name="index_none_header_sysc" href="#"></a>
					<form>
						<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
						<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
					</form>
				</div>
			</div>

			<div class="clear"></div>

			<!--购物车 -->
			<div class="concent">
				<div id="cartTable">
					<div class="cart-table-th">
						<div class="wp">
							<div class="th th-chk">
								<div id="J_SelectAll1" class="select-all J_SelectAll">

								</div>
							</div>
							<div class="th th-item">
								<div class="td-inner">商品信息</div>
							</div>
							<div class="th th-price">
								<div class="td-inner">单价</div>
							</div>
							<div class="th th-amount">
								<div class="td-inner">数量</div>
							</div>
							<div class="th th-sum">
								<div class="td-inner">金额</div>
							</div>
							<div class="th th-op">
								<div class="td-inner">操作</div>
							</div>
						</div>
					</div>
					   <tbody>
				        <c:if test="${orderItemList != null}">
					        <c:forEach var="GoodsItem" items="${orderItemList}">
								<tr class="item-list">
									<div class="bundle  bundle-last ">
										<div class="bundle-main">
											<ul class="item-content clearfix">
												<li class="td td-chk">
													<div class="cart-checkbox ">
														<input class="check" id="J_CheckBox_170037950254" name="items[]" value="170037950254" type="checkbox">
														<label for="J_CheckBox_170037950254"></label>
													</div>
												</li>
												<li class="td td-item">
													<div class="item-pic">
														<a href="#" target="_blank"class="J_MakePoint" data-point="tbcart.8.12">
															<img src="${GoodsItem.picturePath } " class="itempic J_ItemImg"></a>
													</div>
													<div class="item-info">
														<div class="item-basic-info">
															<a href="#" target="_blank"class="item-title J_MakePoint" data-point="tbcart.8.11">${GoodsItem.goodsName }</a>
														</div>
													</div>
												</li>
												<li class="td td-info">
													<div class="item-props item-props-can">
														<span class="sku-line">颜色：${GoodsItem.goodsColor }</span>
														<span class="sku-line">包装：裸装</span>
														<i class="theme-login am-icon-sort-desc"></i>
													</div>
												</li>
												<li class="td td-price">
													<div class="item-price price-promo-promo">
														<div class="price-content">
															<div class="price-line">
																<em class="price-original">${GoodsItem.pastGoodsPrice }</em>
															</div>
															<div class="price-line">
																<em class="J_Price price-now" tabindex="0">${GoodsItem.nowGoodsPrice }</em>
															</div>
														</div>
													</div>
												</li>
												<li class="td td-amount">
													<div class="amount-wrapper ">
														<div class="item-amount ">
															<div class="sl">
																<input class="min am-btn" name="" type="button" value="-" />
																<input class="text_box" name="goodsCount" type="text" value="3" style="width:30px;" />
																<input class="add am-btn" name="" type="button" value="+" />
															</div>
														</div>
													</div>
												</li>
												<li class="td td-sum">
													<div class="td-inner">
														<em tabindex="0" class="J_ItemSum number">${GoodsItem.nowGoodsPrice*GoodsItem.goodsCount }</em>
													</div>
												</li>
												<li class="td td-op">
													<div class="td-inner">
														<a title="移入收藏夹" class="btn-fav" href="#">移入收藏夹</a>
														<a href="joinShopCart?mn=delGoods&&goodsId=${GoodsItem.goodsId }"class="delete">删除</a>
													</div>
												</li>
											</ul>
										</div>
									</div>
								</tr>
							</c:forEach>
						 </c:if>
				 	</tbody>	
					<div class="clear"></div>
				<div class="float-bar-wrapper">
					<div id="J_SelectAll2" class="select-all J_SelectAll">
						<div class="cart-checkbox">
							<input class="check-all check" id="J_SelectAllCbx2" name="select-all" value="true" type="checkbox">
							<label for="J_SelectAllCbx2"></label>
						</div>
						<span>全选</span>
					</div>
					<div class="operations">
						<a href="#" hidefocus="true" class="deleteAll">删除</a>
						<a href="#" hidefocus="true" class="J_BatchFav">移入收藏夹</a>
					</div>
					<div class="float-bar-right">
						<div class="amount-sum">
							<span class="txt">已选商品</span>
							<em id="J_SelectedItemsCount">0</em><span class="txt">件</span>
							<div class="arrow-box">
								<span class="selected-items-arrow"></span>
								<span class="arrow"></span>
							</div>
						</div>
						<div class="price-sum">
							<span class="txt">合计:</span>
							<strong class="price">¥<em id="J_Total">0.00</em></strong>
						</div>
						<div class="btn-area">
							<a href="pay.html" id="J_Go" class="submit-btn submit-btn-disabled">
								<span>结&nbsp;算</span></a>
						</div>
					</div>

				</div>

				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">兴唐科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
				</div>

			</div>
	</body>

</html>
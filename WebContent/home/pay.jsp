<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<<c:set  var="ctxPath" value="${pageContext.request.contextPath } " scope="session"></c:set>
<!DOCTYPE html PUBLIitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>结算页面</title>

		<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />

		<link href="../basic/css/demo.css" rel="stylesheet" type="text/css" />
		<link href="../css/cartstyle.css" rel="stylesheet" type="text/css" />

		<link href="../css/jsstyle.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="../js/address.js"></script>

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
				<div class="logo"><img src="../images/logo.png" /></div>
				<div class="logoBig">
					<li><img src="../images/logobig.png" /></li>
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
			<div class="concent">
				<!--地址 -->
				<div class="paycont">
					<div class="address">
						<h3>确认收货地址 </h3>
						<div class="clear"></div>
<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 存放地址js@@@@@@@@@@@@@@@@@@@@ -->
						<ul id="showUserInfo">
							
						</ul>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>
<!-- %%%%%%%%%%%%%%%%%%%%%%支付方式%%%%%%%%%%%%%%%%%5 -->
					<div class="logistics">
						<ul class="pay-list">
							<li class="pay card"><img src="../images/wangyin.jpg" />银联<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

<!--&&&&&&&&&&&&&&&&&&订单信息&&&&&&&&&&&&77 -->
					<div class="concent">
						<div id="payTable">
							<h3>确认订单信息</h3>
							<div class="cart-table-th">
								<div class="wp">
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
									<div class="th th-oplist">
										<div class="td-inner">配送方式</div>
									</div>
								</div>
							</div>
							<div class="clear"></div>
							<tr class="item-list">
								<div class="bundle  bundle-last">
									<div class="bundle-main" id="goodsItem">
										
										<div class="clear"></div>
									</div>
							</tr>
							<div class="clear"></div>
							</div>
							<div class="clear"></div>
							<!--含运费小计 -->
							<div class="buy-point-discharge ">
								<p class="price g_price ">
									合计（含运费） <span>¥</span><em class="pay-sum"></em>
								</p>
							</div>

							<!--信息 -->
							<div class="order-go clearfix">
								<div class="pay-confirm clearfix">
									<div class="box">
										<div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
											<span class="price g_price ">
                                    		<span>¥</span> <em class="style-large-bold-red " id="J_ActualFee"></em>
											</span>
										</div>
									</div>

									<div id="holyshit269" class="submitOrder">
										<form action="AddOrderItemServlet" method="post">
											<div class="go-btn-wrap">
												<input type="hidden" name="goodsID" value="${goodsId}">
												<input type="hidden" name="goodsNum" value="${goodsnum}">
												<input type="hidden" name="defaultAddressValue" value="${defaultAddressValue }">
												<button id="J_Go" class="btn-go" >提交订单</button>
											</div>
										</form>
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
						</p>
					</div>
				</div>
			</div>
			<div class="theme-popover-mask"></div>
			<div class="theme-popover">

			<div class="clear"></div>
			<script type="text/javascript">
					$(document).ready(function(){
						$.ajax({
							type:"post",
							url:"${ctxPath}/SearchServlet",
							dataType:"JSON",
							success:function(data){
								$("#showUserInfo").html("<div></div>");
								$.each(data,function(){
									$("#showUserInfo").append("<li class='user-addresslist defaultAddr'>"+
											"<span class='new-option-r'><i class='am-icon-check-circle'></i>默认地址</span>"+
											"<p class='new-tit new-p-re'>"+
											"<span class='new-txt'>"+this.receiptName+"</span>"+
												"<span class='new-txt-rd2'>"+this.phoneNumber+"</span>"+
											"</p><div class='new-mu_l2a new-p-re'>"+
											"<p class='new-mu_l2cw'>"+
											"<span class='title'>地址：</span><span class='province'>"+this.province+"</span>"+
														"<span class='city'>"+this.city+"</span>"+
														"<span class='dist'>"+this.country+"</span>"+
														"<span class='street'>"+this.detail+"</span></p><input type='hidden'  class='defaultAddressValue' value ="+this.defaultAddres+">"+
														"</div><div class='new-addr-btn'>"+
													"<a href='#’><i class='am-icon-edit'></i>编辑</a>"+
													"<span class='new-addr-bar'>|</span>"+
													"<a class='delUserInfo'><i class='am-icon-trash'></i>删除</a></div></li>")
								})
							},
							error : function() {
			                    alert("异常！");
			                }
						});
				});
				$(document).ready(function(){
					$.ajax({
						type:"post",
						url:"${ctxPath}/OrderItemServlet",
						dataType:"JSON",
						success:function(data){
							$("#goodsItem").html("<div></div>");
							$.each(data,function(){
								$("#goodsItem").append("<ul class='item-content clearfix' >"
										+"<div class='pay-phone'>"
										+"<li class='td td-item'>"
									+"<div class='item-pic'>"
										+"<a href='#' class='J_MakePoint'>"
											+"<img src='../images/kouhong.jpg_80x80.jpg' class='itempic J_ItemImg'></a></div>"
										+"<div class='item-info'>"
										+"<div class='item-basic-info'><input type='hidden' id='goodsId' value='${"+this.goodsId+" }'>"
											+"<a href='#' class='item-title J_MakePoint' data-point='tbcart.8.11'>"+this.goodsName+"</a></div></div></li>"
								+"<li class='td td-price'>"
									+"<div class='item-price price-promo-promo'>"
										+"<div class='price-content'>"
											+"<em class='J_Price price-now'>"+this.nowGoodsPrice+"</em></div></div></li></div>"
							+"<li class='td td-amount'>"
								+"<div class='amount-wrapper'>"
									+"<div class='item-amount'>"
										+"<span class='phone-title'>购买数量</span>"
										+"<div class='sl'>"
											+"<input class='min am-btn' name='' type='button' value='-'' />"
											+"<input class='text_box' name='goodsnum' type='text' value='3' style='width:30px;'/>"
											+"<input class='add am-btn' name='' type='button' value='+' /></div></div></div></li>"
							+"<li class='td td-sum'>"
							+"<div class='td-inner'>"
									+"<em tabindex='0' class='J_ItemSum number'>117.00</em></div></li>"
							+"<li class='td td-oplist'>"
							+"<div class='td-inner'>"
									+"<span class='phone-title'>配送方式</span>"
									+"<div class='pay-logis'>快递<b class='sys_item_freprice'>10</b>元</div></div></li></ul>")
							})});
				});
			</script>
	</body>

</html>
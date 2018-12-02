<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>个人资料</title>

		<link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="../css/personal.css" rel="stylesheet" type="text/css">
		<link href="../css/infstyle.css" rel="stylesheet" type="text/css">
		<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="../AmazeUI-2.4.2/assets/js/amazeui.js"></script>	
		<script type="text/javascript" src="js/jquery-3.3.1.js" ></script>		
	</head>
	
	<script type="text/javascript">
		$(function(){
			if(${user.user_id!=null})
	       		$("#hide").html("欢迎登陆:   ${ user.loginPerson==0?user.mail:user.phone}")
		});
		
		</script>
<script type="text/javascript">
window.onload=function(){
var selects = document.getElementsByTagName("select");//通过标签名获取select对象
var date = new Date();
var nowYear = date.getFullYear();//获取当前的年
for(var i=nowYear-100;i<=nowYear;i++){
var optionYear = document.createElement("option");
optionYear.innerHTML=i;
optionYear.value=i;
selects[0].appendChild(optionYear);
}
for(var i=1;i<=12;i++){
var optionMonth = document.createElement("option");
optionMonth.innerHTML=i;
optionMonth.value=i;
selects[1].appendChild(optionMonth);
}
getDays(selects[1].value,selects[0].value,selects);
}
// 获取某年某月存在多少天
function getDaysInMonth(month,year){
var days;
if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
days=31;
}else if (month==4 || month==6 || month==9 || month==11){
days=30;
}else{
if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {     // 判断是否为润二月
days=29; 
}else { 
days=28; 
}
}
return days;
}
function setDays(){
var selects = document.getElementsByTagName("select");
var year = selects[0].options[selects[0].selectedIndex].value;
var month = selects[1].options[selects[1].selectedIndex].value;
getDays(month,year,selects);
}
function getDays(month,year,selects){
var days = getDaysInMonth(month,year);
selects[2].options.length = 0;
for(var i=1;i<=days;i++){
var optionDay = document.createElement("option");
optionDay.innerHTML=i;
optionDay.value=i;
selects[2].appendChild(optionDay);
}
}
</script>
	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd" id="hide">
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="http://localhost/shop.web/" target="_top" class="h">商城首页</a></div>
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
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
			</div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						<hr/>

						<!--头像 -->
						<div class="user-infoPic">

							<div class="filePic">
								<input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
								<img class="am-circle am-img-thumbnail" src="../images/getAvatar.do.jpg" alt="" />
							</div>

							<p class="am-form-help">头像</p>

							<div class="info-m">
								<div><b>用户名：<i id=""></i></b></div>
								<div class="vip">
                                      <span></span><a href="#">会员专享</a>
								</div>
							</div>
						</div>

						<!--个人信息 -->
						<div class="info-main">
<form class="am-form am-form-horizontal">
			<div class="am-form-group">
				<label for="user-name2" class="am-form-label">用户名</label>
				<div class="am-form-content">
					<input type="text" id="user-name2" placeholder="name">
                                     <small>昵称长度不能超过10个汉字</small>
				</div>
			</div>

			<div class="am-form-group">
				<label for="user-name" class="am-form-label">银行卡号</label>
				<div class="am-form-content">
					<input type="text" id="user-name2" placeholder="BankCardNumber">
                                    
				</div>
			</div>

			<div class="am-form-group">
				<label class="am-form-label">性别</label>
				<div class="am-form-content sex">
					<label class="am-radio-inline">
						<input type="radio" name="radio10" value="male" data-am-ucheck> 男
					</label>
					<label class="am-radio-inline">
						<input type="radio" name="radio10" value="female" data-am-ucheck> 女
					</label>
					<label class="am-radio-inline">
						<input type="radio" name="radio10" value="secret" data-am-ucheck> 保密
					</label>
				</div>
			</div>
	
			<div class="am-form-group">
				<label for="user-birth" class="am-form-label">生日</label>
				<div class="am-form-content birth">
				<div class="birth-select">
					<select data-am-selected="{maxHeight: 170}">
					</select>
					<em>年</em>
				</div>
				<div class="birth-select2">
					<select data-am-selected="{maxHeight: 170}">
					</select>
					<em>月</em></div>
				<div class="birth-select2">
					<select data-am-selected="{maxHeight: 170}">
					</select>
					<em>日</em></div>
		</div>
			</div>
			<div class="am-form-group">
				<label for="user-phone" class="am-form-label">电话</label>
				<div class="am-form-content">
					<input id="user-phone" placeholder="telephonenumber" type="tel">

				</div>
			</div>
			<div class="am-form-group">
				<label for="user-email" class="am-form-label">电子邮件</label>
				<div class="am-form-content">
					<input id="user-email" placeholder="Email" type="email">

				</div>
			</div>
			<div class="am-form-group address">
				<label for="user-address" class="am-form-label">收货地址</label>
				<div class="am-form-content address">
					<a href="address.html">
						<p class="new-mu_l2cw">
							<span class="province">湖北</span>省
							<span class="city">武汉</span>市
							<span class="dist">洪山</span>区
							<span class="street">雄楚大道666号(中南财经政法大学)</span>
							<span class="am-icon-angle-right"></span>
						</p>
					</a>

				</div>
			</div>
			<div class="am-form-group safety">
				<label for="user-safety" class="am-form-label">账号安全</label>
				<div class="am-form-content safety">
					<a href="safety.html">
						<span class="am-icon-angle-right"></span>
					</a>
				</div>
			</div>
			<div class="info-btn">
				<div class="am-btn am-btn-danger">保存修改</div>
			</div>
</form>
						</div>

					</div>

				</div>
				<!--底部-->
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

			<aside class="menu">
				<ul>
					<li class="person active">
						<a href="index.html"><i class="am-icon-user"></i>个人中心</a>
					</li>
					<li class="person">
						<p><i class="am-icon-newspaper-o"></i>个人资料</p>
						<ul>
							<li> <a href="information.html">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li> <a href="address.html">地址管理</a></li>
							<li> <a href="cardlist.html">快捷支付</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-balance-scale"></i>我的交易</p>
						<ul>
							<li><a href="order.html">订单管理</a></li>
							<li> <a href="change.html">退款售后</a></li>
							<li> <a href="comment.html">评价商品</a></li>
						</ul>
					</li>
					<li class="person">
						<p><i class="am-icon-dollar"></i>我的资产</p>
						<ul>
							<li> <a href="points.html">我的积分</a></li>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="walletlist.html">账户余额</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-tags"></i>我的收藏</p>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>														
						</ul>
					</li>

					<li class="person">
						<p><i class="am-icon-qq"></i>在线客服</p>
						<ul>
							<li> <a href="consultation.html">商品咨询</a></li>
							<li> <a href="suggest.html">意见反馈</a></li>							
							
							<li> <a href="news.html">我的消息</a></li>
						</ul>
					</li>
				</ul>

			</aside>
		</div>

	</body>

</html>
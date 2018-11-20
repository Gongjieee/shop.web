<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" scope="session"></c:set>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<title>登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<link rel="stylesheet" href="../AmazeUI-2.4.2/assets/css/amazeui.css" />
		<link href="../css/dlstyle.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<div class="login-boxtitle">
			<a href="home.html"><img alt="logo" src="../images/logobig.png" /></a>
		</div>
		<div class="login-banner">
			<div class="login-main">
				<div class="login-banner-bg"><span></span><img src="../images/big.jpg" /></div>
				<div class="login-box">
				<h3 class="title">登录商城</h3>
				<div class="clear"></div>
			<div class="login-form">
<form action="${ctxPath}/login.do" method="post">
					<input name="mn" type="hidden" value="login">
				   <div class="user-name">
					    <label for="user"><i class="am-icon-user"></i></label>
					    <input type="text" name="name" id="user" placeholder="邮箱/手机/用户名">
                 </div>
                 <div class="user-pass">
					<label for="password"><i class="am-icon-lock"></i></label>
					<input type="password" name="pass" id="password" placeholder="请输入密码">
                 </div>
</form>
           </div><span id="1234" style="color: red;font: 12px;"></span>
            <div class="login-links">
                <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
				<a href="#" class="am-fr">忘记密码</a>
				<a href="register.jsp" class="zcnext am-fr am-btn-default">注册</a>
				<br />
            </div>
			<div class="am-cf">
				<input type="submit" id="sub" value="登 录" class="am-btn am-btn-primary am-btn-sm">
			</div>
			<div class="partner">		
					<h3>合作账号</h3>
				<div class="am-btn-group">
					<li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
					<li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
					<li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
				</div>
			</div>	
				</div>
			</div>
		</div>
		<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">十点十分</a>
								<b>|</b>
								<a href="# ">商城首页</a>
								<b>|</b>
								<a href="# ">支付宝</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								<a href="# ">半工半读</a>
								<a href="# ">胜多负少</a>
								<a href="# ">热热威威</a>
								<a href="# ">而又热舞</a>
								<em>© 2018-2025 annyroom.top 版权所有. 欲与天公试比高 - Collect from <a href="#" target="_blank">欲上天宫揽明月</a></em>
							</p>
						</div>
					</div>
	<script>
				$(function() {
				    $('#sub').click(function(){
				    	var pwd = $("input[name='pass']").val();
			    		var name = $("input[name='name']").val();
			    		var pattern = new RegExp(/^[\w_-]{6,16}$/);
			    		if(!pattern.test(pwd)){
			    			$('#1234').html("密码长度大于6位!");
			    			$("input[name='pass']").val("");
				    		return false;
			    		}
			    		$("form:first").submit();
		    	    });
				  })
			</script>
	</body>

</html>
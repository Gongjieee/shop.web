<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" scope="session"></c:set>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="UTF-8">
		<title>注册</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, 
		initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="stylesheet" href="../AmazeUI-2.4.2/assets/css/amazeui.min.css" />
		<link href="../css/dlstyle.css" rel="stylesheet" type="text/css">
		<script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="../AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	</head>
	<body>
		<div class="login-boxtitle">
			<a href="home/demo.html"><img alt="" src="../images/logobig.png" /></a>
		</div>
		<div class="res-banner">
			<div class="res-main">
				<div class="login-banner-bg"><span></span><img src="../images/big.jpg" /></div>
				<div class="login-box">
				<div class="am-tabs" id="doc-my-tabs">
					<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
						<li class="am-active"><a href="">邮箱注册</a></li>
						<li><a href="">手机号注册</a></li>
					</ul>
				<div class="am-tabs-bd">
					<div class="am-tab-panel am-active">
	<form action="${ctxPath}/register.do" method="post">
					<input name="mn" type="hidden" value="email">
				   <div class="user-email">
					<label for="email"><i class="am-icon-envelope-o"></i></label>
					<input type="email" name="mail" value="" id="email" placeholder="请输入邮箱账号">
                 </div>
                 <div class="user-pass">
				    <label for="password"><i class="am-icon-lock"></i></label>
				    <input type="password" name="passwd" value="" id="password" placeholder="设置密码">
                 </div>										
                 <div class="user-pass">
				    <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
				    <input type="password" name="passwder" id="passwordRepeat" placeholder="确认密码">
                 </div>	<span id="123" style="color: red;font: 12px;"></span>
   	</form>
				 <div class="login-links">
						<label for="reader-me">
							<input id="reader-me" type="checkbox" checked="checked"> 点击表示您同意商城《服务协议》
						</label>
			  	</div>
				<div class="am-cf">
					<input type="submit" value="注册"  id="sub"
					class="am-btn am-btn-primary am-btn-sm am-fl">
				</div>
				</div>
				<div class="am-tab-panel">
<form action="${ctxPath}/register.do" method="post">
				<input name="mn" type="hidden" value="phone">
                 <div class="user-phone">
				    <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
				    <input type="tel" name="telenum" id="phone" placeholder="请输入手机号">
                 </div>
				<div class="verification">
					<label for="code"><i class="am-icon-code-fork"></i></label>
					<input type="tel" name="yzm" id="code" placeholder="请输入验证码">
					<a class="btn" href="javascript:void(0);" onclick="sendMobileCode();"
					id="sendMobileCode">
						<span id="dyMobileButton"><img id="img" 
					src="${ctxPath}/CaptchaServlet" onclick="refresh();" alt="点击更换验证码"/></span></a>
				</div>
                 <div class="user-pass">
				    <label for="password"><i class="am-icon-lock"></i></label>
				    <input type="password" name="passwdd" value="" id="password" placeholder="设置密码">
                 </div>
                 <div class="user-pass">
				    <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
				    <input type="password" name="passwdder" id="passwordRepeat" placeholder="确认密码">
                 </div>	<span id="1234" style="color: red;font: 12px;"></span>
</form>
				 <div class="login-links">
						<label for="reader-me">
							<input id="reader-me" type="checkbox" checked="checked"> 点击表示您同意商城《服务协议》
						</label>
			  	</div>
					<div class="am-cf">
						<input type="submit" value="注册" id="subb"
						class="am-btn am-btn-primary am-btn-sm am-fl">
					</div>
			
				<hr>
			</div>
			<script>
				function refresh() {
				    document.getElementById('img').src="${ctxPath}/CaptchaServlet?"+Math.random();
				}
				$(function() {
				    $('#doc-my-tabs').tabs();
				    $('#sub').click(function(){
			    	    var pwd = $("input[name='passwd']").val();
			    	    var cpwd = $("input[name='passwder']").val();
			    		var name = $("input[name='mail']").val();
			    		var reg=new RegExp(/^([a-zA-Z0-9._-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/);
			    		var pattern = new RegExp(/^[\w_-]{6,16}$/);
			    		if(!reg.test(name)){
			    			$('#123').html("邮箱格式不合法!");
				    		return false;
			    		}
			    		if(!pattern.test(pwd)){
			    			$('#123').html("密码长度大于6位!");
				    		return false;
			    		}
			    	    if(pwd != cpwd){
			    			$('#123').html("两次密码不一致!");
				    	    $("input[name='passwder']").val("");
				    		return false;
			    	    }
			    		$('#123').html("");
			    		$("form:first").submit();
		    	    });
				    $('#subb').click(function(){
				    	$.ajax({
							url:"${ctxPath}/register.do",
							dataType:"JSON",
							data:{yzm:$("input[name='yzm']").val()},
							success:function(result){
								alert(result);
								var logindata = JSON.parse(result);
								
							}
						});
			    	    var pwd = $("input[name='passwdd']").val();
			    	    var cpwd = $("input[name='passwdder']").val();
			    		var name = $("input[name='telenum']").val();
			    		var yzm = $("input[name='yzm']").val();
				    	var reg=new RegExp(/^1[34578]\d{9}$/);
			    		var pattern = new RegExp(/^[\w_-]{6,16}$/);
			    		if(!reg.test(name)){
			    			$('#1234').html("手机号格式不合法!");
				    		return false;
			    		}
			    		if(!pattern.test(pwd)){
			    			$('#1234').html("密码长度大于6位!");
				    		return false;
			    		}
			    	    if(pwd != cpwd){
			    			$('#1234').html("两次密码不一致!");
				    	    $("input[name='passwdder']").val("");
				    		return false;
			    	    }
			    		$('#1234').html("");
			    		$("form:last").submit();
		    	    });
				  })
			</script>

			</div>
		</div>
				</div>
			</div>
					<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">好好学习</a>
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
								<a href="# ">天天向上</a>
								<a href="# ">合作伙伴</a>
								<a href="# ">联系我们</a>
								<a href="# ">网站地图</a>
								<em>© 2015-2025 www.annyroom.top 版权所有<a href="#" target="_blank">
								代码真香</a> - Collect from <a href="#" target="_blank">熬夜真爽</a></em>
							</p>
						</div>
					</div>
	</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Sctipt-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolcar" content="no"/>
	<meta name="descriprion" content=""/>
	<meta name="keywords" content=""/>

	<title>管理者画面</title>

	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
		}

		h1{
			text-align: center;
		}

		#main {
			witdh: 100%;
			padding: 50px 10%;
		}

		#left {
			float: left;
			width: 160px;
			text-align: center;
			margin: 30px;
			padding: 10px;
		}

		#right {
			float: right;
			width: 160px;
			text-align: center;
			margin: 30px;
			padding: 10px;
		}

		.bottun{
			width: 140px;
			height: 40px;
			border-radius: 10px;
		}

		#header{
			width: 100%;
			height: 80px;
			background-color: black;
		}

		#footer{
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}



	</style>

</head>
<body>

	<div id="header">
	</div>

	<h1>管理者画面</h1>

	<div id="main">
		<div id="left">
			<h3>商品</h3>
			<s:form action="ItemCreateAction">
				<s:submit value="新規登録" class="bottun"/>
			</s:form>
			<s:form action="ItemListAction">
				<s:submit value="一覧" class="bottun"/>
			</s:form>
		</div>

		<div id="right">
			<h3>ユーザー</h3>
			<s:form action="UserCreateAction">
				<s:submit value="新規登録" class="bottun"/>
			</s:form>
			<s:form action="UserListAction">
				<s:submit value="一覧" class="bottun"/>
			</s:form>
		</div>
	</div>

	<div id="footer">
	</div>

</body>
</html>
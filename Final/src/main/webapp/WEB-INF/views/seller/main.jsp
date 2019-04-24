<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
	.login {
		width: 310px;
		margin: 0 auto;
	}
	
	/**/
	
</style>

<div class="login">

<c:if test="${not sellerLogin }">
<div>
<h3>판매자 로그인</h3>
</div>

<form action="/seller/login" method="POST">
<div style="text-align: center;">
<span style="margin: 10px;" class="glyphicon glyphicon-user" aria-hidden="true"></span>
<input style="height: 30px; width: 250px; margin: 10px" type="text" name="sellerId" />
<br>
<span style="margin: 10px;" class="glyphicon glyphicon-lock" aria-hidden="true"></span>
<input style="height: 30px; width: 250px; margin: 10px" type="password" name="sellerPw" />
<br>

<div style="text-align: right; margin: 10px;">
<input style="margin: 10px;" type="checkbox" id="saveId" /><label for="saveId" id="saveId">아이디 저장</label>
<input style="margin: 10px;" type="checkbox" id="autoLogin" /><label for="autoLogin" id="autoLogin">자동 로그인</label>
</div>

<button style="width: 300px;" class="btn btn-primary">로그인</button>
</div>
</form>
</c:if>

<c:if test="${sellerLogin }">
채팅창
</c:if>

</div>
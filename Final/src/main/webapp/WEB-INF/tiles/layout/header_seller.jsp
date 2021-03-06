<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style type="text/css">
	
	#logo {
		float: left;
		margin-left: 10px;
	}
	
	.li {
		display: list-item;
	}
	
	#menu {
		font-weight: bold;
	}
	
	#menu ul {
		list-style: none;
		margin: 0 auto;
		text-algin: center;
	}
	
	#menu ul li {
		position: relative;
		float: left;
		height: 100px;
		padding-left: 50px;
		padding-right: 10px;
 		padding-top: 38px;
		font-size: 17px;
	}
	
	#menu ul li a {
		text-decoration: none;
		color: #000;
	}
	
	#sellerLogin {
		float: right;
		margin-top: 33px;
		margin-right: 30px;
	}
	
</style>

<div class="header" style="height: 100px">

	<div id="logo">
	<a href="/seller/main">
		<img src="http://bigissue.kr/wp-content/themes/canvas/images/Bigissue_kr_logo_main.png">
	</a>
	</div>
	
	<nav id="menu">
		<div>
			<ul>
				<li>
					<a href="/seller/time">판매 관리</a>
				</li>
				<li>
					<a href="/seller/review/list/all">빅돔 후기</a>
				</li>
				<li>
					<a href="/seller/booking/list">예약 내역</a>
				</li>
			</ul>
		</div>
		
		<div>
			<button id="sellerLogin" class="btn">로그인</button>
		</div>
	</nav>
	
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>诗人列表</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<%@ include file="layout/head.jsp" %>
</head>
<body>
	<%@include file="layout/topbar.jsp" %>

	<div class="content">
		<div class="maincontent">
			<div class="maintitle">
				<img src="<%=basePath %>images/quanbu.png" width="20px"><span>全部诗人</span>
			</div>
			<ul id="list">
				<c:forEach items="${list}" var="row">
					<li>
						<div class="hang">
							<img src="<%=basePath %>images/user.png" height="20px"><span class="txt1">诗人：</span>
							<span class="txt2"><c:out value="${row.name}" /></span>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div class="right">
			<img src="<%=basePath %>images/sr.jpg" width="300px">
		</div>

		<c:if test="${pagination!=null}">
			<c:out value="${pagination}" escapeXml="false" />
		</c:if>
		
	</div>

</body>


</html>
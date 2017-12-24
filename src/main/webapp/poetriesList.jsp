<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>全唐诗搜索</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<%@ include file="layout/head.jsp" %>
</head>
<body>
	<%@include file="layout/topbar.jsp" %>

	<div class="content">
		<div class="maincontent">
			<div class="maintitle">
				<img src="<%=basePath %>images/quanbu.png" width="20px"><span>全部诗歌</span>
			</div>
			<ul id="list">
				<c:forEach items="${list}" var="row">
					<li>
						<div class="hang">
							<img src="<%=basePath %>images/user.png" height="20px"><span class="txt1">诗人：</span>
							<span class="txt2"><c:out value="${row.poet.name}"/></span>
						</div>
						<c:url var="url" value="/poetries/get.do">
							<c:param name="id" value="${row.id}" />
						</c:url>
						<div class="hang">
							<img src="<%=basePath %>images/zan.png" height="20px"><span class="txt1">标题：</span>
							<span class="txt2"><a href="<c:out value="${url}" />"><c:out value="${row.title}" /></a></span>
						</div>
						<div class="hang">
							<img src="<%=basePath %>images/ding.png" height="20px"><span class="txt">内容：</span>
							<div class="txt3">
								<c:choose>
									<c:when test="${row.content.length()>=25}">
										<a href="<c:out value="${url}" />"><c:out value="${row.content.substring(0,24)}" />......</a>
									</c:when>
									<c:otherwise>
										<c:out value="${row.content}" />
									</c:otherwise>
								</c:choose>
							</div>
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
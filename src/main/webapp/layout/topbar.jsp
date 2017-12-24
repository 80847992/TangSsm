<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="header">
	<div class="logo">
		<img src="<%=request.getContextPath() %>/images/logo.jpg" width="100px;">
	</div>
	<div class="title">全唐诗搜索网</div>
	<div class="nav">
		<div class="home">
			<img src="<%=request.getContextPath() %>/images/home.png" width="30px;">
		</div>
		<a class="sy" href="<%=request.getContextPath() %>">首页</a>
		<div class="search">
			<form id="search" action="search.do" method="GET">
				<input type="text" id="poet_name" name="poet_name" value="作者" onblur="if(this.value==''){this.value='作者'}" onfocus="this.value=''" style="width: 60px;" />
				<input type="text" id="poetry_title" name="poetry_title" value="标题" onblur="if(this.value==''){this.value='标题'}" onfocus="this.value=''" style="width: 100px;" />
				<input type="text" id="poetry_content" name="poetry_content" value="内容" onblur="if(this.value==''){this.value='内容'}" onfocus="this.value=''" style="width: 150px;" />
				<input type="submit" value="搜索" style="width: 60px; height: 30px;" onclick="return submitCheck()" />
			</form>
		</div>
	</div>
</div>
<script type="text/javascript">
function submitCheck(){
	var poet_name = document.getElementById("poet_name");
	var poetry_title = document.getElementById("poetry_title");
	var poetry_content = document.getElementById("poetry_content");
	
	if (poet_name.value == "作者"){
		poet_name.value = "";
	}
	if (poetry_title.value == "标题"){
		poetry_title.value = "";
	}
	if (poetry_content.value == "内容"){
		poetry_content.value = "";
	}
	return true;
}
</script>
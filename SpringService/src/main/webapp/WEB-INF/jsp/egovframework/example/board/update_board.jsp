<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Board</title>
	<script type="text/javascript">
		function fn_save() {
			document.detailForm.action = "<c:out value="/board/edit.do"/>";
            document.detailForm.submit();
		}
		function fn_delete(){
			document.detailForm.action = "<c:out value="/board/delete.do"/>";
            document.detailForm.submit();
		}
	</script>
</head>
<body>

<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="detailForm" name="detailForm" method="post">
		<input type="hidden" name="id" value="<c:out value="${boardVO.id}"/>" />
		<div class="mb-3">
		  <label for="title" class="form-label">title</label>
		  <input type="text" 
		         class="form-control" 
		         id="title" 
		         name="title"
		         value="<c:out value="${boardVO.title}"/>"
		         placeholder="부서명">
		</div>
		
		<div class="mb-3">
		  <label for="content" class="form-label">content</label>
		  <input type="text" 
		         class="form-control" 
		         id="content" 
		         name="content"
		         value="<c:out value="${boardVO.content}"/>"
		         placeholder="부서위치">
		</div>
		
		<div class="mb-3">
			<button type="button" 
			        class="btn btn-warning"
			        onclick="fn_save()"
			>
			   수정
			</button>
			<button type="button" 
			        class="btn btn-danger"
			        onclick="fn_delete()"
			>
			   삭제
			</button>
		</div>
	</form>

</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>




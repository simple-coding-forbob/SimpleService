<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Board</title>
	<script type="text/javascript" defer="defer">
		function fn_save() {
			document.addForm.action = "<c:out value="/board/add.do"/>";
			document.addForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="addForm" name="addForm" method="post">
		<div class="mb-3">
		  <label for="title" class="form-label">title</label>
		  <input type="text" 
		         class="form-control" 
		         id="title" 
		         name="title"
		         placeholder="부서명">
		</div>
		
		<div class="mb-3">
		  <label for="content" class="form-label">content</label>
		  <input type="text" 
		         class="form-control" 
		         id="content" 
		         name="content"
		         placeholder="부서위치">
		</div>
		
		<div class="mb-3">
			<button type="button" 
			        class="btn btn-primary"
			        onclick="fn_save()"
			>저장</button>
		</div>
	</form>
</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>




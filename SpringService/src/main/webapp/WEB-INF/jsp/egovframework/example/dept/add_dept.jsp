<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
			
<!-- 	css 부트스트랩 cdn  -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
	
	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>

</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="page mt5">
	<form id="addForm" name="addForm" method="post">
		<div class="mb3">
		  <label for="dname" class="form-label">dname</label>
		  <input type="text" 
		         class="form-control" 
		         id="dname" 
		         name="dname"
		         placeholder="부서명">
		</div>
		
		<div class="mb3">
		  <label for="loc" class="form-label">loc</label>
		  <input type="text" 
		         class="form-control" 
		         id="loc" 
		         name="loc"
		         placeholder="부서위치">
		</div>
		
		<div class="mb3">
			<button type="button" 
			        class="btn btn-primary"
			        onclick="fn_save()"
			>저장</button>
		</div>
	</form>
</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
	<script type="text/javascript" defer="defer">
		function fn_save() {
			$("#addForm").attr("action",'<c:out value="/dept/add.do" />')
			.submit();
		}
	</script>
</body>
</html>




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

</head>
<body>

<jsp:include page="/common/header.jsp"></jsp:include>
<div class="page mt5">
	<form id="addForm" name="addForm" method="post">
		<input type="hidden" id="dno" name="dno" value="<c:out value="${dept.dno}"/>" />
		<div class="mb-3">
		  <label for="dname" class="form-label">dname</label>
		  <input type="text" 
		         class="form-control" 
		         id="dname" 
		         name="dname"
		         value="<c:out value="${dept.dname}"/>"
		         placeholder="부서명">
		</div>
		
		<div class="mb3">
		  <label for="loc" class="form-label">loc</label>
		  <input type="text" 
		         class="form-control" 
		         id="loc" 
		         name="loc"
		         value="<c:out value="${dept.loc}"/>"
		         placeholder="부서위치">
		</div>
		
		<div class="mb3">
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
	
	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
	<script type="text/javascript">
		function fn_save() {
 			$("#addForm").attr("action",'<c:out value="/dept/edit" />')
			.submit();
		}
		function fn_delete(){
			$("#addForm").attr("action",'<c:out value="/dept/delete" />')
			.submit();
		}
		
	</script>
</body>
</html>




1<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Member</title>
	<script type="text/javascript">
		function fn_save() {
			document.detailForm.action = "<c:out value="/emp/edit.do"/>";
            document.detailForm.submit();
		}
		function fn_delete(){
			document.detailForm.action = "<c:out value="/emp/delete.do"/>";
            document.detailForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="detailForm" name="detailForm" method="post">
		<input type="hidden" name="eno" value="<c:out value="${empVO.eno}"/>" />
		<div class="mb-3">
		  <label for="ename" class="form-label">ename</label>
		  <input type="text" 
		         class="form-control" 
		         id="ename" 
		         name="ename"
		         value="<c:out value="${empVO.ename}"/>"
		         placeholder="사원명">
		</div>
		
		<div class="mb-3">
		  <label for="job" class="form-label">job</label>
		  <input type="text" 
		         class="form-control" 
		         id="job" 
		         name="job"
		         value="<c:out value="${empVO.job}"/>"
		         placeholder="직위">
		</div>	
		
		<div class="mb-3">
		  <label for="manager" class="form-label">manager</label>
		  <input type="text" 
		         class="form-control" 
		         id="manager" 
		         name="manager"
		         value="<c:out value="${empVO.manager}"/>"
		         placeholder="관리자">
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

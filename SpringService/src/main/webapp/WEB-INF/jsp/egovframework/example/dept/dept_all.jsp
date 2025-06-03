<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
	<script type="text/javascript" defer="defer">
		function fn_egov_selectList() {
			document.listForm.action = "<c:out value="/dept/dept.do" />";
			document.listForm.submit();
		}
		function fn_addView() {
			document.listForm.action="<c:out value="/dept/addition.do"/>";
            document.listForm.submit();
        }
	    function fn_select(dno) {
			document.listForm.dno.value = dno;
			document.listForm.action="<c:out value="/dept/edition.do"/>";
	        document.listForm.submit();
	    }
	</script>
	
	<script>
	    /* 자동완성 + debouncing(성능업, 입력후 0.5초 이후에 AJAX 실행) */
	    $(function () {
	    	let timer;
	        $("#searchKeyword").keyup(function () {
	        	clearTimeout(timer);  // 이전 타이머 취소
	        	timer=setTimeout(function() {fn_ajax();},500)
	        });
	    });
	    function fn_ajax() {
	    	let searchKeyword = $("#searchKeyword").val();
	        $.ajax({
	            url: "/api/dept/dept.do",
	            type: "GET",
	            dataType: "json",
	            data: {"searchKeyword":searchKeyword},
	            success: function (data) {
	            	console.log(data);
	            	$("#result").empty();
	            	if(searchKeyword !="") {
	            		/* 화면에 보이기 */
	            		fn_view(data);
	            	}
	            },
	            error: function (request) {
	                console.error(request);
	            }
	        });			
		}
	    function fn_view(data) {
	       	let res="";
	           $.each(data, function (index, value) {
					res+=value.dname + "<br>";
			})
			$("#result").html(res);		
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<form id="listForm" name="listForm" method="get" >
    <input type="hidden" name="dno" />
		
	<div class="page mt5">
		<h2>전체 조회</h2>
			
    	<div class="input-group mb3 mt3">
		  <input type="text" 
		         class="form-control" 
		         id="searchKeyword"
		         name="searchKeyword"
		         placeholder="부서명입력"
		  >
		  <button class="btn btn-primary" 
		          type="button" 
		          onclick="fn_egov_selectList()"
		  >
		          검색
		  </button>
		</div>
		<div id="result"></div>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">dno</th>
		      <th scope="col">dname</th>
		      <th scope="col">loc</th>
		    </tr>
		  </thead>
		  <tbody>
			<c:forEach var="data" items="${list}">
		    <tr>
		      <td>
				<a href="javascript:fn_select('<c:out value="${data.dno}"/>')">
				   <c:out value="${data.dno}"/>
				</a>
		      </td>
		      <td><c:out value="${data.dname}"/></td>
		      <td><c:out value="${data.loc}"/></td>
		    </tr>
			</c:forEach>
		  </tbody>
		</table>
		<div class="text-center">
			<a href="javascript:fn_addView()" class="btn btn-primary">추가</a> 
		</div>
	</div>
</form>

<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>




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
<form id="listForm" name="listForm" method="get" >
    <input type="hidden" id="dno" name="dno" />
		
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
	
	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
	<script type="text/javascript" defer="defer">
		function fn_egov_selectList() {
			$("#listForm").attr("action",'<c:out value="/dept" />')
					.submit();
			
		}
		function fn_addView() {
			$("#listForm").attr("action",'<c:out value="/dept/addition" />')
			.submit();
        }
	    function fn_select(dno) {
			$("#dno").val(dno); 
			$("#listForm").attr("action",'<c:out value="/dept/edition" />')
						.submit();
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
	            url: "/api/dept",
	            type: "GET",
	            dataType: "json",
	            data: {"searchKeyword":searchKeyword},
	            success: function (data) {
	            	console.log(data);
	            	$("#result").empty();     // 값 지우기
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
			// for (var i = 0; i < data.length; i++) {
       		//    res+=data[i].dname + "<br>";
		    // }
			// 자바의 stream 과 유사(자동 반복문 실행, index(인덱스번호), value(배열값))
	        $.each(data, function (index, value) {
					res+=value.dname + "<br>";
			})
			$("#result").html(res);
		}
	</script>
</body>
</html>




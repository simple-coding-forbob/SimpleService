<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Dept</title>
    <meta charset="UTF-8">
    <meta name="description" content="게시판 조회 페이지입니다.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<form class="container mx-auto mt-8 px-3" id="listForm" name="listForm" method="get">
    <input type="hidden" id="id" name="id"/>

    <h1 class="text-2xl font-bold mb-6">게시판 조회</h1>

    <div class="flex justify-center mb-4">
        <input type="text"
               class="w-full border border-gray-300 rounded-l p-2 focus:outline-none focus:ring focus:ring-blue-500"
               id="searchKeyword"
               name="searchKeyword"
               placeholder="부서명입력"
        >
        <button class="bg-blue-700 text-white hover:bg-blue-800 px-4 py-2 rounded-r min-w-[5rem]"
                type="button"
                onclick="fn_egov_selectList()"
        >
            검색
        </button>
    </div>

    <table class="w-[100%] border border-gray-200">
        <thead class="bg-blue-700 text-white">
        <tr>
            <th scope="col" class="px-4 py-2 border-b">id</th>
            <th scope="col" class="px-4 py-2 border-b">title</th>
            <th scope="col" class="px-4 py-2 border-b">content</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="data" items="${list}">
            <tr  class="hover:bg-gray-50">
                <td class="px-4 py-2 border-b text-center">
                    <a href="/board/edition?id=<c:out value='${data.id}'/>">
                        <c:out value="${data.id}"/>
                    </a>
                </td>
                <td class="px-4 py-2 border-b"><c:out value="${data.title}"/></td>
                <td class="px-4 py-2 border-b"><c:out value="${data.content}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>

<jsp:include page="/common/footer.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script type="text/javascript" defer="defer">
    function fn_egov_selectList() {
        $("#listForm").attr("action", "/board")
            .submit();
    }
</script>

</body>
</html>




<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Dept</title>
    <meta charset="UTF-8">
    <meta name="description" content="부서 조회 페이지입니다.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<%--머리말--%>
<form class="container mx-auto mt-8 px-3" id="listForm" name="listForm">


    <h1 class="text-2xl font-bold mb-6">부서 조회</h1>

    <div class="flex justify-center mb-4">
        <input type="text"
               class="w-full border border-gray-300 rounded-l p-2 focus:outline-none focus:ring focus:ring-blue-500"
               id="searchKeyword"
               name="searchKeyword"
               placeholder="부서명입력"
        >
        <button class="bg-blue-700 text-white hover:bg-blue-800 px-4 py-2 rounded-r min-w-[5rem]"
                type="button"
        >
            검색
        </button>
    </div>

    <table class="w-[100%] border border-gray-200">
        <thead class="bg-blue-700 text-white">
        <tr>
            <th scope="col" class="px-4 py-2 border-b">dno</th>
            <th scope="col" class="px-4 py-2 border-b">dname</th>
            <th scope="col" class="px-4 py-2 border-b">loc</th>
        </tr>
        </thead>
        <tbody>
            <tr  class="hover:bg-gray-50">
                <td class="px-4 py-2 border-b text-center">
                        11
                </td>
                <td class="px-4 py-2 border-b">22</td>
                <td class="px-4 py-2 border-b">33</td>
            </tr>
        </tbody>
    </table>
</form>

</body>
</html>




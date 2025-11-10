<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
		<img src="<c:url value='/images/simple-coding.png'/>" width="20" height="20" />
    	simple-coding
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            그룹관리
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<c:url value='/dept'/>">Dept</a></li>
            <li><a class="dropdown-item" href="<c:url value='/emp'/>">Emp(퀴즈)</a></li>
            <li><a class="dropdown-item" href="<c:url value='/board'/>">Board(마무리퀴즈)</a></li>
          </ul>
        </li>

      </ul>

    </div>
  </div>
</nav>

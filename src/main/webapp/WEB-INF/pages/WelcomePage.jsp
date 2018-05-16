<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<h1>Welcome page</h1>

<h2>ClassName : ${classname}</h2>
<h4>Executed Time : <fmt:formatNumber value="${executeTime}" pattern="#,###.##"/> ms </h4>

</body>
</html>
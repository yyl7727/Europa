<%--
  Created by IntelliJ IDEA.
  User: HNNC
  Date: 2020/05/07
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
    <script>
        $(function () {
            $("button:eq(0)").click(function () {
                $.ajax({
                    type: "post",
                    url: "/Europa/0507/f1",
                    data: {v:"1-fak-yyl"},
                    headers: {
                        "content-type": "application/yyl"
                    }
                })
            })
        })
    </script>
    <button>go</button>
</body>
</html>

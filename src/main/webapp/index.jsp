<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>欢迎界面</h2>
<h5><a href="/info">显示管理员信息</a></h5>
<script type="text/javascript">
    document.write("这是通过script标签嵌入的代码");
</script><br>

<%--引入的外部js脚步--%>
<script type="text/javascript" src="js/demo.js"></script><br>

<%--在html属性中直接嵌入script--%>
<p onclick="alert('你点击了我')">点击这里</p>

<%--table表单测试玩   --%>
<table style="width: 290px; background: cyan">
    <tbody>
    <tr>
        <td>输入一个数字：</td>
        <td><input id="demo1" type="text"></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <%--在JavaScript代码中绑定事件--%>
            <input onclick="alert(Math.round(document.getElementById('demo1').value))" value="四舍五入" type="button">
        </td>
    </tr>
    </tbody>
</table>

<%--event对象 当前事件--%>
<div id="demo" ; style="background: darkgray">在这里单击</div>
<script type="text/javascript">
    document.getElementById("demo").onclick=function(e){
        var eve=e;
        var x=eve.x; // X坐标
        var y=eve.y;  // Y坐标
        alert("X坐标："+x+"\nY坐标："+y);
    }
</script>
<%--在DOM元素(HTML标签)中直接绑定--%>
<input  onclick="myAlert()"  type="button"  value="点击我，弹出警告框" />
<script type="text/javascript">
    function myAlert(){
        alert("谢谢支持");
    }
</script>


</body>
</html>

<%@ page import="com.software_development_practice.StudentDao"%>  
<%@page import="org.springframework.web.context.WebApplicationContext"%>  
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查找</title>
</head>
<body>
<a href="./">返回</a>

<center>  
        通过controller访问<br/>  
        欢迎<br/>  
        <%  
            WebApplicationContext wac = WebApplicationContextUtils  
                    .getWebApplicationContext(this.getServletContext());  
            StudentDao studentDao = (StudentDao) wac.getBean("studentDaoImpl");  
            String in=(String)request.getParameter("id");  
        System.out.println(in);  
            int num=Integer.parseInt(in);             
        %>  
    <%=studentDao.findStudentById(num)%><br />   
    <%--     <%=userDao.findUserById(2)%><br />  
        <%=userDao.findUserById(3)%><br />  
        <%=userDao.findUserById(4)%><br /> --%>  
    </center>  
</body>
</html>
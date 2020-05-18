<%-- 
    Document   : teste
    Created on : 18/05/2020, 20:10:41
    Author     : Rodney
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <%
 // se estiver autenticado exibe o nome de login             
  HttpSession sessao = request.getSession();
  out.print(sessao.getAttribute("var_sessao_login"));
  
 // se não estiver autenticado redireciona para a index
  if(sessao.getAttribute("var_sessao_login")==null)
  response.sendRedirect("index.jsp");

        %> 
        
        
        
        
        
    </body>
</html>

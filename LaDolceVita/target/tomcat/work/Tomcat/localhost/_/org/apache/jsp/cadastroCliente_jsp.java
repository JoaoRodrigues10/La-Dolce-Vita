/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-19 00:55:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login_style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/menu.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<title>Cadastro do Cliente</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <div class=\"main-login\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"left-login\">\r\n");
      out.write("            <h2 class=\"label\"> CRIE SUA CONTA <BR> E COMPRE CONOSCO !</h2>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <a href=\"Home.html\">\r\n");
      out.write("                <img class=\"img-logo\" src=\"img/newlogo.png\" alt=\"\">\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <h6 class=\"label\"> Voltar a tela para fazer login !</h6>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"btn\">\r\n");
      out.write("                <a href=\"login.jsp\">\r\n");
      out.write("                <button class=\"btn-custom\" type=\"submit\">Login</button>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"right-login\">\r\n");
      out.write("            <div class=\"card-login\">\r\n");
      out.write("                <h1 class=\"label\">Cadastra-se</h1>\r\n");
      out.write("                <form action=\"/create-cliente\" method=\"post\">\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("\r\n");
      out.write("                    <label><h5>E-mail</h5></label>\r\n");
      out.write("                    <input type=\"text\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite seu e-mail\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("                    <label><h5>CPF</h5></label>\r\n");
      out.write("                        <input type=\"text\" name=\"cpf\" id=\"cpf\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cpf}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite seu CPF\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("                    <label><h5>Nome</h5></label>\r\n");
      out.write("                    <input type=\"text\" name=\"nome-cliente\" id=\"nome-cliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite seu nome\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("                    <label><h5>Data de Nascimento</h5></label>\r\n");
      out.write("                    <input type=\"text\" name=\"data-nascimento\" id=\"data-nascimento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite sua data de nasciento\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("                    <label><h5>Celular</h5></label>\r\n");
      out.write("                    <input type=\"text\" name=\"celular\" id=\"celular\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.celular}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite seu telefone\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"textfield\">\r\n");
      out.write("                    <label><h5>Senha</h5></label>\r\n");
      out.write("                    <input type=\"password\" name=\"senha\" id=\"senha\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.senha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"Digite sua senha\">\r\n");
      out.write("                    </div>\r\n");
      out.write("<br>\r\n");
      out.write("                    <div class=\"btn\">\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"btn-custom\" type=\"submit\">Cadastrar</button>\r\n");
      out.write("                        <button class=\"btn-custom\" type=\"submit\">Limpar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"aviso\">\r\n");
      out.write("        <div class=\"comunicado\">WWW.LADOLCEVITA.COM.BR</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

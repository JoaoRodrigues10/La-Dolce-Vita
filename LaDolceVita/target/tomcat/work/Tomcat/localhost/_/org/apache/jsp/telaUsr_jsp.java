/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-24 17:27:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class telaUsr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" \r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <link  rel=\"stylesheet\"href= \"css/menu.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"aviso\">\r\n");
      out.write("        <div class=\"comunicado\">FAÇA AGORA SEU PEDIDO ONLINE</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"cabecalho\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"/img/logo.jfif\" alt=\"\" onclick=\"window.location.href='/index.jsp'\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"opcoes\">\r\n");
      out.write("                    <a href=\"/index.jsp\"><buttom class=\"btn btn-custom\">INÍCIO</buttom></a>\r\n");
      out.write("                    <a href=\"/menu.jsp\"><buttom class=\"btn btn-custom\">MENU</buttom></a>\r\n");
      out.write("                    <a href=\"/index.jsp#sobre\"><buttom class=\"btn btn-custom\">SOBRE</buttom></a>\r\n");
      out.write("                    <a href=\"#rodape\"><buttom class=\"btn btn-custom\">CONTATO</buttom></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"acoes\">\r\n");
      out.write("            <a href=\"/menuADM.jsp\"><img src=\"/img/lupa.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"/login.jsp\"><img src=\"/img/perfil.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"/carrinho.jsp\"><img src=\"/img/sacola.png\" alt=\"\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"linha\"></div>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col\">\r\n");
      out.write("                   <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                           <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                           <li class=\"breadcrumb-item active\" aria-current=\"page\">Editar dados</li>\r\n");
      out.write("                         </ol>\r\n");
      out.write("                   </nav>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("               <div class=\"col-md-auto\"></div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col col-lg-1\">\r\n");
      out.write("                     ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main-endereco\">\r\n");
      out.write("        <div class=\"card-endereco\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Olá, ");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write(" Cadastrar novo Endereco</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"linha\" id=\"rodape\"></div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"rodape\">\r\n");
      out.write("        <div class=\"r1\">\r\n");
      out.write("            <img src=\"/img/logo.jfif\" alt=\"\" onclick=\"window.location.href='/index.jsp'\">\r\n");
      out.write("            <div class=\"icones\">\r\n");
      out.write("                <div class=\"btn fundo\">\r\n");
      out.write("                    <i class=\"fa-brands fa-whatsapp\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn fundo\">\r\n");
      out.write("                    <i class=\"fa-brands fa-linkedin-in\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn fundo\">\r\n");
      out.write("                    <i class=\"fa-brands fa-instagram\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn fundo\">\r\n");
      out.write("                    <i class=\"fa-brands fa-facebook-f\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"confeitaria\">Desde 2000 - Confeitaria La Dolce Vita</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"r2\">\r\n");
      out.write("            <div class=\"rtitulo\">HOME PAGE</div>\r\n");
      out.write("            <a href=\"menu.jsp\"><div class=\"ropcoes\">MENU</div></a>\r\n");
      out.write("            <a href=\"index.jsp#sobre\"><div class=\"ropcoes\">SOBRE</div></a>\r\n");
      out.write("            <a href=\"index.jsp#rodape\"><div class=\"ropcoes\">CONTATO</div></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"r3\">\r\n");
      out.write("            <div class=\"r3titulo\">CONTATO</div>\r\n");
      out.write("            <div class=\"rcombo\">\r\n");
      out.write("                <div class=\"subinfo\">Delivery</div>\r\n");
      out.write("                <div class=\"info\">(11) 9 9429-9161</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"rcombo\">\r\n");
      out.write("                <div class=\"subinfo\">Eventos</div>\r\n");
      out.write("                <div class=\"info\">(11) 9 9429-9161</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"rcombo\">\r\n");
      out.write("                <div class=\"subinfo\">Trabelhe conosco</div>\r\n");
      out.write("                <a href=\"/perfil.jsp\"><div class=\"info\">recrutamento@ladolcevita.com.br</div></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"aviso\">\r\n");
      out.write("            <div class=\"comunicado\" onclick=\"window.location.href='/index.jsp'\">WWW.LADOLCEVITA.COM.BR</div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"aviso\">\r\n");
      out.write("                <div class=\"comunicado\">Copyright © 2024 LA DOLCE VITTA  - Desenvolvido por SenacTeam.</div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /telaUsr.jsp(53,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("                        <a href=\"/logout\">Logout</a>\r\n");
        out.write("                      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /telaUsr.jsp(67,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}

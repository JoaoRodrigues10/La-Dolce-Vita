/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-11 00:54:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Componentes/cabecalho.jsp", Long.valueOf(1715386127113L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link  rel=\"stylesheet\"href= \"css/menu.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("    <title>InÃ­cio</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link  rel=\"stylesheet\"href= \"cabecalho.css\">\r\n");
      out.write("    <title>Cabeçalho</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"aviso\">\r\n");
      out.write("        <div class=\"comunicado\">FAÇA AGORA SEU PEDIDO ONLINE</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"cabecalho\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"/img/logo.jfif\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"opcoes\">\r\n");
      out.write("            <a href=\"/index.jsp\">INÍCIO</a>\r\n");
      out.write("            <a href=\"/menu.jsp\">MENU</a>\r\n");
      out.write("            <a href=\"/index.jsp#sobre\">SOBRE</a>\r\n");
      out.write("            <a href=\"#rodape\">CONTATO</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"acoes\">\r\n");
      out.write("            <a href=\"/\"><img src=\"/img/lupa.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"/login.jsp\"><img src=\"/img/perfil.png\" alt=\"\"></a>\r\n");
      out.write("            <a href=\"/carrinho.jsp\"><img src=\"/img/sacola.png\" alt=\"\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"linha\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("                          <div class=\"row\">\r\n");
      out.write("                              <div class=\"col\"></div>\r\n");
      out.write("                              <div class=\"col-md-auto\"></div>\r\n");
      out.write("\r\n");
      out.write("                              <div class=\"col col-lg-1\">\r\n");
      out.write("                                   ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\">\r\n");
      out.write("    <div class=\"carousel-indicators\">\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("        <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"img/banner.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"img/png/banner.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"img/png/banner.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("            <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("    </button>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container text-center\">\r\n");
      out.write("\r\n");
      out.write("    </br></br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <h2>Horario</h2>\r\n");
      out.write("            </br>\r\n");
      out.write("            <h3><small class=\"text-body-secondary\">TODOS OS DIAS. DAS 10H AS 22H.</small></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        </br></br></br>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col order-5\">\r\n");
      out.write("\r\n");
      out.write("            <h2>DELIVERY</h2>\r\n");
      out.write("            </br>\r\n");
      out.write("            <h3><small class=\"text-body-secondary\">Temos delivery todos os dias das 12 Ã s 22h em todas as unidades</small></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</br></br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"barra-topo\">\r\n");
      out.write("    <figure class=\"text-center\">\r\n");
      out.write("        <blockquote class=\"blockquote\">\r\n");
      out.write("            <p>FAÃA AGORA MESMO SEU PEDIDO.</p>\r\n");
      out.write("        </blockquote>\r\n");
      out.write("    </figure>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</br></br></br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container text-center\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-4\"><h2> VISÃO</h2>\r\n");
      out.write("            </br>\r\n");
      out.write("\r\n");
      out.write("            <h5>Ser reconhecida como a confeitaria referÃªncia em excelÃªncia, criatividade e sabor irresistÃ­vel, proporcionando momentos de doÃ§ura e felicidade aos nossos clientes.\r\n");
      out.write("            </h5></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-4 offset-md-4\"><h2>MISSÃO</h2>\r\n");
      out.write("            </br>\r\n");
      out.write("            <h5>Criar e oferecer produtos de confeitaria excepcionais, utilizando ingredientes de alta qualidade, tÃ©cnicas artesanais e uma dose generosa de paixÃ£o,\r\n");
      out.write("                para encantar os paladares mais exigentes e tornar cada momento especial e memorÃ¡vel.</h5>\r\n");
      out.write("            </br>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-8 offset-md-3\"><h2>VALORES</h2>\r\n");
      out.write("            </br>\r\n");
      out.write("            <h5>Comprometemo-nos com qualidade em cada etapa do processo, desde a escolha dos ingredientes atÃ© a apresentaÃ§Ã£o final dos produtos. Incentivamos a inovaÃ§Ã£o e\r\n");
      out.write("                originalidade para surpreender nossos clientes. Amamos o que fazemos, dedicando energia para criar experiÃªncias deliciosas. Agimos com honestidade,\r\n");
      out.write("                transparÃªncia e respeito em todas as relaÃ§Ãµes. Priorizamos a satisfaÃ§Ã£o do cliente, buscando sempre superar expectativas.</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</br></br></br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-2\">\r\n");
      out.write("        </br>\r\n");
      out.write("        <a href=\"\"><img src=\"img/png/bolo2.png\" alt=\"\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-md-4 offset-md-4\"></br></br>\r\n");
      out.write("        <h1>BOLO DE CHOCOLATE</h1>\r\n");
      out.write("        </br>\r\n");
      out.write("\r\n");
      out.write("        <h5 class=\"text\">A PARTIR</h5>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"list-inline\">\r\n");
      out.write("            <li class=\"list-inline-item display-2\">R$ 61,50 </li>\r\n");
      out.write("            <li class=\"list-inline-item\">/kg</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        </br>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("            <a href=\"#\" class=\"btn btn-primary btn-custom\">\r\n");
      out.write("                <strong> Compre jÃ¡!</strong>\r\n");
      out.write("            </a>\r\n");
      out.write("        </p>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"barra-nossa-loja text-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container text-center\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <h2>Nossas Loja</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><div class=\"col\">\r\n");
      out.write("        <h3>Com 3 pontos de venda espalhados por SÃ£o Paulo, encontre a loja mais prÃ³xima de vocÃª!</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"row align-items-start\">\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("                <strong>PINHEIROS</strong>\r\n");
      out.write("                <BR><BR>\r\n");
      out.write("                Rua dos GirassÃ³is, 123\r\n");
      out.write("                <br> (11) 9876-5432\r\n");
      out.write("                <br> <br><a href=\"https://www.google.com/maps/place/R.+dos+Girass%C3%B3is,+123+-+Parque+Fernanda,+S%C3%A3o+Paulo+-+SP,+05887-370/@-23.6754862,-46.7944333,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce5303659edac5:0x5d25d502d14fcef0!8m2!3d-23.6754862!4d-46.7944333?entry=ttu\" class=\"btn btn-primary btn-maps\">\r\n");
      out.write("                Maps\r\n");
      out.write("            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("                <strong>GUARULHOS</strong>\r\n");
      out.write("                <BR><BR>\r\n");
      out.write("                Avenida das Palmeiras, 456\r\n");
      out.write("                <br> (11) 7654-3210\r\n");
      out.write("                <br> <br><a href=\"#\" class=\"btn btn-primary btn-maps\">\r\n");
      out.write("                Maps\r\n");
      out.write("            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("                <strong>MORUMBI</strong>\r\n");
      out.write("                <BR><BR>\r\n");
      out.write("                Travessa das AcÃ¡cias, 789\r\n");
      out.write("                <br> (11) 8765-4321\r\n");
      out.write("                <br> <br><a href=\"#\" class=\"btn btn-primary btn-maps\">\r\n");
      out.write("                Maps\r\n");
      out.write("            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"img-rodape\">\r\n");
      out.write("\r\n");
      out.write("    <img src=\"img/png/roda-pe.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"titulo\">HOME</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"linha\" id=\"rodape\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"rodape\">\r\n");
      out.write("    <div class=\"r1\">\r\n");
      out.write("        <img src=\"img/logo.jfif\" alt=\"\">\r\n");
      out.write("        <div class=\"social-media text-center\">\r\n");
      out.write("            <ul class=\"list-social-media\">\r\n");
      out.write("                <a class=\"link-social-media\" href=\"#\">\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"item-social-media\">\r\n");
      out.write("                        <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"link-social-media\" href=\"#\">\r\n");
      out.write("                    <li class=\"item-social-media\">\r\n");
      out.write("                        <i class=\"fab fa-google-plus-g\"></i>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"link-social-media\" href=\"#\">\r\n");
      out.write("                    <li class=\"item-social-media\">\r\n");
      out.write("                        <i class=\"fab fa-linkedin-in\"></i>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </a>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"confeitaria\">Desde 2000 - Confeitaria La Dolce Vita</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"r2\">\r\n");
      out.write("        <div class=\"rtitulo\">HOME PAGE</div>\r\n");
      out.write("        <div class=\"ropcoes\">LOJA ONLINE</div>\r\n");
      out.write("        <div class=\"ropcoes\">SOBRE</div>\r\n");
      out.write("        <div class=\"ropcoes\">MINHA CONTA</div>\r\n");
      out.write("        <div class=\"ropcoes\">CONTATO</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"r3\">\r\n");
      out.write("        <div class=\"r3titulo\">CONTATO</div>\r\n");
      out.write("        <div class=\"rcombo\">\r\n");
      out.write("            <div class=\"subinfo\">Delivery</div>\r\n");
      out.write("            <div class=\"info\">(11) 9 9429-9161</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"rcombo\">\r\n");
      out.write("            <div class=\"subinfo\">Eventos</div>\r\n");
      out.write("            <div class=\"info\">(11) 9 9429-9161</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"rcombo\">\r\n");
      out.write("            <div class=\"subinfo\">Trabelhe conosco</div>\r\n");
      out.write("            <div class=\"info\">recrutamento@ladolcevita.com.br</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"aviso\">\r\n");
      out.write("    <div class=\"comunicado\">WWW.LADOLCEVITA.COM.BR</div>\r\n");
      out.write("</div>\r\n");
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
    // /index.jsp(25,35) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                       <span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("                                       <a href=\"/logout\">Logout</a>\r\n");
        out.write("                                   ");
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
}

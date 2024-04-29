package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class produto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"./styles/header.css\">\n");
      out.write("        <link href=\"./styles/paginaInicial.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./images/favicon.png\" type=\"image/x-icon\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-1\">\n");
      out.write("            <nav id=\"nav\" class=\"navbar bg-body-tertiary\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <a class=\"navbar-brand\">Gibelato Store</a>\n");
      out.write("                    <form class=\"d-flex\" role=\"search\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button id=\"btn-search\" class=\"btn btn-outline-success\" type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"categorias\">\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        <i class=\"fa-solid fa-list\"></i>Categorias\n");
      out.write("                    </button>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./masculino\"><i class=\"fa-solid fa-person\"></i>Masculino</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-person-dress\"></i>Feminino</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-shoe-prints\"></i>Calçados</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-star\"></i> Destaques</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-cart-shopping\"></i> Carrinho</button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-user\"></i> Minha conta</button>\n");
      out.write("            </div>    \n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

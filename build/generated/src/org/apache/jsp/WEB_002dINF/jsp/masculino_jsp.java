package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class masculino_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"./styles/masculino.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"./styles/header.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./images/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("        <title>Gibelato Store Masculino</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-1\">\r\n");
      out.write("            <nav id=\"nav\" class=\"navbar bg-body-tertiary\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <a class=\"navbar-brand\">Gibelato Store</a>\r\n");
      out.write("                    <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                        <button id=\"btn-search\" class=\"btn btn-outline-success\" type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"categorias\">\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa-solid fa-list\"></i>Categorias\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-person\"></i>Masculino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-person-dress\"></i>Feminino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-shoe-prints\"></i>Calçados</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-star\"></i> Destaques</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-cart-shopping\"></i> Carrinho</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-user\"></i> Minha conta</button>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <main class=\"main\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produtos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("produto");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <a href=\"\">\r\n");
          out.write("                    <div class=\"card\" style=\"width: 18rem;\">\r\n");
          out.write("                        <img src=\"./images/Vans/vans-1.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
          out.write("                        <div class=\"card-body\">\r\n");
          out.write("                          <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                          <p class=\"card-text\">Preco = $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.valor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                          <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </a>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

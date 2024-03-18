package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Head.jsp");
    _jspx_dependants.add("/Foot.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>Euro Thrifting</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"Assets/Template/main/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!--\n");
      out.write("        \n");
      out.write("        TemplateMo 546 Sixteen Clothing\n");
      out.write("        \n");
      out.write("        https://templatemo.com/tm-546-sixteen-clothing\n");
      out.write("        \n");
      out.write("        -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Additional CSS Files -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Template/main/assets/css/fontawesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Template/main/assets/css/templatemo-sixteen.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Template/main/assets/css/owl.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Template/form.css\">\n");
      out.write("        <style>\n");
      out.write("            #file_photo::before {\n");
      out.write("                content: \"Select Photo\";\n");
      out.write("            }\n");
      out.write("            #file_proof::before {\n");
      out.write("                content: \"Select Proof\";\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background:background: rgb(167,197,233);\n");
      out.write("background: linear-gradient(0deg, rgba(167,197,233,1) 0%, rgba(167,197,233,1) 100%);\">\n");
      out.write("\n");
      out.write("        <!-- ***** Preloader Start ***** -->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"jumper\">\n");
      out.write("                <div></div>\n");
      out.write("                <div></div>\n");
      out.write("                <div></div>\n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("        <!-- ***** Preloader End ***** -->\n");
      out.write("\n");
      out.write("        <!-- Header -->\n");
      out.write("        <header class=\"\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><h2> Euro <em> Thrifting </em></h2></a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"index.jsp\">Home\n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                            </li> \n");
      out.write("                            \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"User.jsp\">Customer</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Shop.jsp\">Seller</a>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Login.jsp\">Login</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <!-- Banner Starts Here -->\n");
      out.write("        <div class=\"banner header-text\" id=\"tab\" align=\"center\">\n");
      out.write("\n");
      out.write("<!-- Page Content -->\n");
      out.write("<!-- Banner Starts Here -->\n");
      out.write("\n");
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <div class=\"owl-banner owl-carousel\">\n");
      out.write("        <div class=\"banner-item-01\">\n");
      out.write("            <div class=\"text-content\">\n");
      out.write("                <h4>Best Offer</h4>\n");
      out.write("                <h2>New Arrivals On Sale</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"banner-item-02\">\n");
      out.write("            <div class=\"text-content\">\n");
      out.write("                <h4>Flash Deals</h4>\n");
      out.write("                <h2>Get your best products</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"banner-item-03\">\n");
      out.write("            <div class=\"text-content\">\n");
      out.write("                <h4>Last Minute</h4>\n");
      out.write("                <h2>Grab last minute deals</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-12\" align=\"center\">\n");
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <div class=\"row\" id=\"result\">\n");
      out.write("\n");
      out.write("        ");

            String selProduct = "select * from tbl_product p inner join tbl_subcategory sc on sc.subcategory_id=p.subcategory_id inner join tbl_category c on c.category_id=sc.category_id";
            ResultSet rsP = con.selectCommand(selProduct);
            while (rsP.next()) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 mb-2\" >\n");
      out.write("            <div class=\"card-deck\" >\n");
      out.write("                <div class=\"card border-secondary\" style=\"height: 500px\">\n");
      out.write("                    <img src=\"Assets/Files/");
      out.print(rsP.getString("product_photo"));
      out.write("\" class=\"card-img-top\" height=\"250\">\n");
      out.write("                    <div class=\"card-img-secondary\">\n");
      out.write("                        <h6  class=\"text-light bg-info text-center rounded p-1\">");
      out.print(rsP.getString("product_name"));
      out.write("</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title text-danger\">\n");
      out.write("                            MRP Price : <strike>");
      out.print(rsP.getString("MRP"));
      out.write("/-</strike>\n");
      out.write("                            Rate : ");
      out.print(rsP.getString("product_rate"));
      out.write("/-<br>\n");
      out.write("\n");
      out.write("                        </h4>\n");
      out.write("                        <h5>You saved ");
      out.print( rsP.getInt("MRP") - rsP.getInt("product_rate"));
      out.write("</h5>\n");
      out.write("                        <p>\n");
      out.write("                            Category  : ");
      out.print(rsP.getString("category_name"));
      out.write("<br>\n");
      out.write("                            Subcategory  : ");
      out.print(rsP.getString("subcategory_name"));
      out.write("<br>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- Banner Ends Here -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <div class=\"inner-content\">\n");
      out.write("                <p>\n");
      out.write("                    _Industry Buying _ \n");
      out.write("                        Leading B2B e-Commerce for Industrial Products\n");
      out.write("To combat the negative impact of delays in sourcing to the production process,\n");
      out.write("Industry Buying assists you in a hassle-free online buying process and create an easy way to handle the industrial product procurement process.\n");
      out.write("Our aim is to help you make substantial savings in supplies, raise the efficiency level of your inventory management and help you to sustain your growth.\n");
      out.write("We want to make online business to business and business to consumer procurement a time saving and smooth process.\n");
      out.write("\n");
      out.write("\n");
      out.write("                    Copyright &copy; 2023 S.S Industry Buying, PVT LTD.\n");
      out.write("\n");
      out.write("                <P> - Design: <a rel=\"nofollow noopener\" href=\"#\" target=\"_blank\">Euro Thrifting</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script src=\"Assets/Template/main/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"Assets/Template/main/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Additional Scripts -->\n");
      out.write("<script src=\"Assets/Template/main/assets/js/custom.js\"></script>\n");
      out.write("<script src=\"Assets/Template/main/assets/js/owl.js\"></script>\n");
      out.write("<script src=\"Assets/Template/main/assets/js/slick.js\"></script>\n");
      out.write("<script src=\"Assets/Template/main/assets/js/isotope.js\"></script>\n");
      out.write("<script src=\"Assets/Template/main/assets/js/accordions.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language = \"text/Javascript\">\n");
      out.write("    cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field\n");
      out.write("    function clearField(t) {                   //declaring the array outside of the\n");
      out.write("        if (!cleared[t.id]) {                      // function makes it static and global\n");
      out.write("            cleared[t.id] = 1;  // you could use true and false, but that's more typing\n");
      out.write("            t.value = '';         // with more chance of typos\n");
      out.write("            t.style.color = '#fff';\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

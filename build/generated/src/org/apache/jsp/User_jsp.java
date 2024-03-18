package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class User_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("        <title>PharmaMart</title>\n");
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
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><h2> Pharma <em> Mart </em></h2></a>\n");
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
      out.write("\n");
      out.write("        <div class=\"send-message\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <h2>Customer Registration</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"contact-form\">\n");
      out.write("                            <form enctype=\"multipart/form-data\" method=\"post\" action=\"Assets/ActionPages/UserUploadAction.jsp\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"text\" class=\"form-control\" name=\"txt_name\" id=\"txt_name\"  placeholder=\"Name\" required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"text\" class=\"form-control\"  name=\"txt_contact\" id=\"txt_contact\" placeholder=\"Contact\" required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"email\" class=\"form-control\" name=\"txt_email\" id=\"txt_email\" placeholder=\"E-Mail Address\" required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <textarea  rows=\"6\" class=\"form-control\" name=\"txt_address\" id=\"txt_address\" placeholder=\"Your Address\" required=\"\"></textarea>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                       <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <select class=\"form-control\" name=\"sel_district\" id=\"sel_district\" onchange=\"getPlace(this.value)\">\n");
      out.write("                                                <option value=\"\">Select State</option>\n");
      out.write("                                                ");

                                                    String selQryj = "select * from tbl_state";
                                                    ResultSet rsj = con.selectCommand(selQryj);
                                                    while (rsj.next()) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(rsj.getString("state_id"));
      out.write('"');
      out.write('>');
      out.print(rsj.getString("state_name"));
      out.write("</option>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <select class=\"form-control\" name=\"sel_district\" id=\"sel_district\" onchange=\"getPlace(this.value)\">\n");
      out.write("                                                <option value=\"\">Select District</option>\n");
      out.write("                                                ");

                                                    String selQry = "select * from tbl_district";
                                                    ResultSet rsd = con.selectCommand(selQry);
                                                    while (rsd.next()) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(rsd.getString("district_id"));
      out.write('"');
      out.write('>');
      out.print(rsd.getString("district_name"));
      out.write("</option>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <select class=\"form-control\" name=\"sel_place\" id=\"sel_place\">\n");
      out.write("                                                <option value=\"\">Select Place</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"file\" style=\"background: white\"  id=\"file_photo\" name=\"file_photo\"  required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"file\" style=\"background: white\" id=\"file_proof\" name=\"file_proof\"  required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"password\" class=\"form-control\" name=\"txt_password\" id=\"txt_password\"  placeholder=\"Password\" required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <input  type=\"password\" class=\"form-control\"  name=\"txt_cpassword\" id=\"txt_cpassword\" placeholder=\"Confirm Password\" required=\"\">\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-12\">\n");
      out.write("                                        <fieldset>\n");
      out.write("                                            <button type=\"submit\" id=\"form-submit\" name=\"btn_submit\" class=\"filled-button\">Register</button>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"Assets/JQuery/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                function getPlace(did)\n");
      out.write("                                                {\n");
      out.write("                                                    $.ajax({\n");
      out.write("                                                        url: \"Assets/AjaxPages/AjaxPlace.jsp?did=\" + did,\n");
      out.write("                                                        success: function(html) {\n");
      out.write("                                                            $(\"#sel_place\").html(html);\n");
      out.write("\n");
      out.write("                                                        }\n");
      out.write("                                                    });\n");
      out.write("                                                }</script>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("                   At PharmaMart, we specialize in providing top-of-the-line pharmaceutical equipment to meet the needs of \n");
      out.write("                   your pharmacy or laboratory. Our comprehensive range of products ensures that you have everything you need \n");
      out.write("                   to maintain efficiency, accuracy, and safety in your operations.\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--                <P> - Design: <a rel=\"nofollow noopener\" href=\"#\" target=\"_blank\">Euro Thrifting</a></p>-->\n");
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
      out.write("\n");
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

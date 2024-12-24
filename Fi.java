FirstServlet.java: 
import java.io.*;  
import javax.servlet.*; 
public class FirstServlet extends GenericServlet 
{ 
public void service(ServletRequest req,ServletResponse res)throws 
ServletException,IOException{ 
res.setContentType("text/html"); 
PrintWriter pw=res.getWriter(); 
pw.println("<html><head><title>First Servlet</title></head>");  
pw.println("<body><center><h1>This Message came from a servlet</h1>"); 
pw.println("</center></body></html>"); 
pw.close(); 
} 
} 
Web.xml: 
<web-app> 
<servlet> 
<servlet-name>abc</servlet-name> 
<servlet-class>FirstServlet</servlet-class> 
</servlet> 
<servlet-mapping> 
<servlet-name>abc</servlet-name> 
<url-pattern>/hello</url-pattern> 
</servlet-mapping> 
</web-app> 

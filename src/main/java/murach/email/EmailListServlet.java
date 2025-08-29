package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
import murach.database.UserDB;

public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; 
        }

        if (action.equals("join")) {
            url = "/index.html"; 
        }
        else if (action.equals("add")) {                
            // Lấy dữ liệu từ form
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dob = request.getParameter("dob");
            String hear = request.getParameter("hear");
            String news = request.getParameter("news");
            String emailNews = request.getParameter("emailNews");
            String contact = request.getParameter("contact");

            // Tạo User object
            User user = new User(firstName, lastName, email, dob, hear, news, emailNews, contact);

            // Lưu vào DB nếu cần
            UserDB.insert(user);
            
            // Gửi sang JSP
            request.setAttribute("user", user);
            url = "/thanks.jsp";   
        }
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    

    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}

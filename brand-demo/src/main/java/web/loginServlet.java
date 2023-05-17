package web;

import pojo.User;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class  loginServlet extends HttpServlet {
    private UserService service=new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        User user = service.Login(username, password);
        if(user!=null){
//            判断用户是否勾选remember
            if("1".equals(remember)){
                Cookie Ucookie = new Cookie("username",username);
                Cookie Pcookie = new Cookie("password",password);
//                设置cookie存活时间
                Ucookie.setMaxAge(60);
                Pcookie.setMaxAge(60);
//                发送
                response.addCookie(Ucookie);
                response.addCookie(Pcookie);

            }
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
//
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/selectAllServlet");
        }else {
            request.setAttribute("login_msg","用户名或密码错误");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

package web;

import pojo.User;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    private UserService service=new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
            User user = new User(username, password);
//
            Boolean register = service.Register(user);
            if (register) {
//            注册成功后跳转到登录页面
                request.setAttribute("register_msg", "注册成功，请登录");
                request.getRequestDispatcher("/Login.jsp").forward(request, response);
            } else {
//
                request.setAttribute("register_msg", "用户名已存在");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

package web;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req =(HttpServletRequest) request;
//        判断一下访问的资源路径是否和登陆注册相关
        String[] urls={"/Login.jsp","/javaweb.jpg","/login.css","/loginServlet","/register.jsp","/register.css","/registerServlet"};
//
        String s = req.getRequestURI().toString();
        for (String u:
             urls) {
            if(s.contains(u)){
                chain.doFilter(request,response);
                return;
            }
        }
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user != null){
            chain.doFilter(request,response);
        }else {
//
            req.setAttribute("login_msg","你尚未登录");
            req.getRequestDispatcher("/Login.jsp").forward(req,response);
        }
    }
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }


}

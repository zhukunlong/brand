package web;

import pojo.Brand;
import service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private BrandService service=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        接受表单中的一个数据，并封装Brand对象
        request.setCharacterEncoding("utf-8");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("companyDescription");
        String status = request.getParameter("status");
        System.out.println(brandName);
//        封装一个Brand对象
        Brand brand = new Brand(brandName,companyName,(Integer.parseInt(ordered)),description,(Integer.parseInt(status)));
//        调用service完成添加操作
        service.add(brand);
//        转发到查询所有的Servlet
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

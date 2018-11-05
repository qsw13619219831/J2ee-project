package demo1;

//这里是要通过实现继承httpservlet来开发动态网页所需要导入的包
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet01")
public class servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public servlet01() {
        super();
      
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//这里使用了doget的方法，doget方法，这个方法中又传入了两个对象一个是request，一个是response
		//这里用到了接口，数据以方法参数的形式传递；
		
		 request.setCharacterEncoding("utf-8");
		//接收的文本汉化方案
		 response.setContentType("text/html;charset=gb2312");
		//发送的文本汉化方案
		String[] favorite = request.getParameterValues("favorite");
		//复选框部分方法，用字符数组来记录喜爱
		String aaa= request.getParameter("username");
		//用字符串方法来记录用户名，密码这里用了request中一个重要的方法
		//getParameter方法
		String bbb= request.getParameter("mypassword");
		String ccc= request.getParameter("gender");
		if("qinshiwei".equals(aaa)&&"123456".equals(bbb)) {
			//这里用了response中一个getWriter方法
			response.getWriter().write("账号是:"+aaa);
			response.getWriter().write("<br/>");
			response.getWriter().write("密码是："+bbb);
			response.getWriter().write("<br/>");
			response.getWriter().write("性别为:"+ccc);
			response.getWriter().write("<br/>");
			response.getWriter().write("爱好为：");
			for (int i=0; favorite!=null && i<favorite.length; i++){
	            response.getWriter().write(favorite[i]+"&nbsp");
	            }
			
		}
		else{
			response.getWriter().write("密码错误或账号错误".toString());
		}
		

		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


package demo1;

//������Ҫͨ��ʵ�ּ̳�httpservlet��������̬��ҳ����Ҫ����İ�
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
		//����ʹ����doget�ķ�����doget����������������ִ�������������һ����request��һ����response
		//�����õ��˽ӿڣ������Է�����������ʽ���ݣ�
		
		 request.setCharacterEncoding("utf-8");
		//���յ��ı���������
		 response.setContentType("text/html;charset=gb2312");
		//���͵��ı���������
		String[] favorite = request.getParameterValues("favorite");
		//��ѡ�򲿷ַ��������ַ���������¼ϲ��
		String aaa= request.getParameter("username");
		//���ַ�����������¼�û�����������������request��һ����Ҫ�ķ���
		//getParameter����
		String bbb= request.getParameter("mypassword");
		String ccc= request.getParameter("gender");
		if("qinshiwei".equals(aaa)&&"123456".equals(bbb)) {
			//��������response��һ��getWriter����
			response.getWriter().write("�˺���:"+aaa);
			response.getWriter().write("<br/>");
			response.getWriter().write("�����ǣ�"+bbb);
			response.getWriter().write("<br/>");
			response.getWriter().write("�Ա�Ϊ:"+ccc);
			response.getWriter().write("<br/>");
			response.getWriter().write("����Ϊ��");
			for (int i=0; favorite!=null && i<favorite.length; i++){
	            response.getWriter().write(favorite[i]+"&nbsp");
	            }
			
		}
		else{
			response.getWriter().write("���������˺Ŵ���".toString());
		}
		

		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


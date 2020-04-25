package com.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.po.GoodsBean;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsSerelet
 */
@WebServlet("/GoodsSerelet")
public class GoodsSerelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsSerelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		if(action!=null){
			if(action.equals("add")){
				add(request,response);
			}
			else if(action.equals("findbyid"))
			{
				findbyid(request,response);
			}
			else if(action.equals("updategoods"))
			{
				updategoods(request,response);
			}
			else if(action.equals("findAll"))
			{
				findAll(request,response);
			}
			else if(action.equals("delid"))
			{
				delid(request,response);
			}
		}
	}

	private void delid(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.valueOf(request.getParameter("id"));
		GoodsService goods = new GoodsServiceImpl();
		int f=goods.delid(id);
		if(f>0)
		{
			response.sendRedirect("GoodsSerelet?action=findAll");
		}
		else
		{
			response.sendRedirect("addgoods.jsp");
		}
	}

	private void updategoods(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		GoodsBean b = new GoodsBean();
		b.setId(Integer.valueOf(request.getParameter("id")));
		b.setName(request.getParameter("name"));
		b.setPrice(Double.valueOf(request.getParameter("price")));
		b.setCategory(request.getParameter("category"));
		b.setPnum(Integer.valueOf(request.getParameter("pnum")));
		b.setImgurl(request.getParameter("imgurl"));
		b.setDescription(request.getParameter("description"));
		GoodsService goods = new GoodsServiceImpl();
		int f=goods.updategoods(b);
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GoodsService goods = new GoodsServiceImpl();
		List<GoodsBean> list=goods.findAll();
		if(list!=null){
		request.setAttribute("listGoodsBean", list);
		request.getRequestDispatcher("goodsBeanList.jsp").forward(request, response);
		}
		else
		{
			response.sendRedirect("findbyid.jsp");
		}
	}

	private void findbyid(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		int id=Integer.valueOf(request.getParameter("id"));
		GoodsService goods = new GoodsServiceImpl();
		GoodsBean g = goods.findbyid(id);
		request.setAttribute("pd", g);
		request.getRequestDispatcher("findbyid-info.jsp").forward(request, response);
		}

	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		GoodsBean b = new GoodsBean();
		b.setName(request.getParameter("name"));
		b.setPrice(Double.valueOf(request.getParameter("price")));
		b.setCategory(request.getParameter("category"));
		b.setPnum(Integer.valueOf(request.getParameter("pnum")));
		b.setImgurl(request.getParameter("imgurl"));
		b.setDescription(request.getParameter("description"));
		GoodsService goods = new GoodsServiceImpl();
		int f=goods.add(b);
		if(f>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("addgoods.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

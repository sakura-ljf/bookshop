package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.GoodsDao;
import com.po.GoodsBean;

import utils.ConnDB;

public class GoodsDaoImpl implements GoodsDao {
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	private PreparedStatement ps=null;
	
	@Override
	public int addGoodsDao(GoodsBean b) {
		// TODO Auto-generated method stub
		int f=0;
		try {
			conn=ConnDB.getConn();
			String sql="insert into tb_goods(name,price,category,pnum,imgurl,description) values(?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, b.getName());
			ps.setDouble(2, b.getPrice());
			ps.setString(3, b.getCategory());
			ps.setInt(4, b.getPnum());
			ps.setString(5, b.getImgurl());
			ps.setString(6, b.getDescription());
			f=ps.executeUpdate();
			ConnDB.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public GoodsBean findbyid(int id) {
		// TODO Auto-generated method stub
		GoodsBean g=new GoodsBean();
		try {
			conn=ConnDB.getConn();
			String sql="select * from tb_goods where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				g.setId(rs.getInt(1));
				g.setName(rs.getString(2));
				g.setPrice(rs.getDouble(3));
				g.setCategory(rs.getString(4));
				g.setPnum(rs.getInt(5));
				g.setImgurl(rs.getString(6));
				g.setDescription(rs.getString(7));
			}
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
	}

	@Override
	public int updategoods(GoodsBean b) {
		int f=0;
		try {
			conn=ConnDB.getConn();
			String sql = "update tb_goods set name=?,price=?,category=?,pnum=?,imgurl=?,description=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, b.getName());
			ps.setDouble(2, b.getPrice());
			ps.setString(3, b.getCategory());
			ps.setInt(4, b.getPnum());
			ps.setString(5, b.getImgurl());
			ps.setString(6, b.getDescription());
			ps.setInt(7, b.getId());
			f=ps.executeUpdate();
			ConnDB.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public List<GoodsBean> findAll() {
		List<GoodsBean> list=new ArrayList<GoodsBean>();
		try {
			conn=ConnDB.getConn();
			st=conn.createStatement();
			String sql = "select * from tb_goods";
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				GoodsBean g=new GoodsBean();
				g.setId(rs.getInt(1));
				g.setName(rs.getString(2));
				g.setPrice(rs.getDouble(3));
				g.setCategory(rs.getString(4));
				g.setPnum(rs.getInt(5));
				g.setImgurl(rs.getString(6));
				g.setDescription(rs.getString(7));
				list.add(g);
				ConnDB.close();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int delid(int id) {
		// TODO Auto-generated method stub
		int f=0;
		try {
			conn=ConnDB.getConn();
			String sql="delete from tb_goods where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			f=ps.executeUpdate();
			ConnDB.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

}

package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.UserDao;
import com.po.UserBean;

import utils.ConnDB;

public class UserDaoImpl implements UserDao {
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public int login(UserBean user){
		int f=0;
		try{
		conn=ConnDB.getConn();
		st=conn.createStatement();
		String sql="SELECT password from tb_user where username='"+user.getUsername()+"'";
		rs=st.executeQuery(sql);
		if(rs.next()){
			String pwd=rs.getString(1);
			if(pwd.equals(user.getPassword()))
			{
				f=1;
			}
			else
			{
				f=0;
			}
		}
		else
		{
			f=0;
		}
		}catch (ClassNotFoundException e){
		e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
			}
		return f;
	}
	public int reg(UserBean user){
		int f=0;
		PreparedStatement ps=null;
		try {
			conn=ConnDB.getConn();
		String sql="insert into tb_user(username,password,sex,age) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
		ps.setString(1, ""+user.getUsername()+"");
		ps.setString(2, ""+user.getPassword()+"");
		ps.setString(3, ""+user.getSex()+"");
		ps.setInt(4,user.getAge());
		f=ps.executeUpdate();
		if(f>0){
			System.out.println("×¢²á³É¹¦");
		}
		else{
			System.out.println("×¢²áÊ§°Ü");
		}
				ConnDB.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return f;
	}

}
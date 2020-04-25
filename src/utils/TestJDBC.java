package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestJDBC {
	private Connection conn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	@Test
	public void find() throws SQLException{
			try {
				conn=ConnDB.getConn();
			st=conn.createStatement();
			String sql="select * from tb_user";
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2)+"   ");
				System.out.print(rs.getString(3)+"   ");
				System.out.print(rs.getString(4)+"   ");
				System.out.print(rs.getInt(5)+"   ");
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				ConnDB.close();
			}
	}
	@Test
	public void adduser(){
		try {
			conn=ConnDB.getConn();
			String sql="insert into tb_user(username,password,sex,age) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, "凯撒·加图索");
			ps.setString(2, "tldf");
			ps.setString(3, "男");
			ps.setInt(4, 25);
			int b=ps.executeUpdate();
			if(b>0){
				System.out.println("成功插入数据");
			}
			else{
				System.out.println("失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				ConnDB.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

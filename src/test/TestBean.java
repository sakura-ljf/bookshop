package test;

import com.po.UserBean;

public class TestBean {
	public void test(){
		UserBean user = new UserBean();
		user.setUid(1);
		user.setUsername("ʸ��ӣ");
		user.setPassword("dayzs");
		user.setSex("Ů");
		user.setAge(22);
		
		System.out.println(user.getUid());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
	}
}

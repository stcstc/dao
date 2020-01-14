package com.neuedu.test;

import java.util.Date;

import com.neuedu.dao.impl.EmpDaoImpl;
import com.neuedu.entity.Emp;

public class Test {

	public static void main(String[] args) {
		//测试添加员工
		EmpDaoImpl dao=new EmpDaoImpl();
		
		/*Emp emp=new Emp();
		emp.setEmpno(88891);
		emp.setEname("测试1");
		emp.setDeptno(10);
		emp.setHiredate(new Date());
		
		
		int x=dao.addEmp(emp);
		if(x>0)System.out.println("插入成功");
		else System.out.println("插入失败");*/
		int[] arr={8889,8895};
		int x=0;
		x=dao.delEmpByIds(arr);
		if(x>0)System.out.println("批量删除成功");
		else System.out.println("批量删除失败");
		
		
		
		
	}

}

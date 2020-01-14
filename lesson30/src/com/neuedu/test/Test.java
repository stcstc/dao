package com.neuedu.test;

import java.util.Date;

import com.neuedu.dao.impl.EmpDaoImpl;
import com.neuedu.entity.Emp;

public class Test {

	public static void main(String[] args) {
		//测试添加员工
		EmpDaoImpl dao=new EmpDaoImpl();
		
		Emp emp=new Emp();
		emp.setEmpno(9999);
		emp.setEname("测试1");
		emp.setHiredate(new Date());
		emp.setDeptno(10);
		
		System.out.println(emp);
		
		int x=dao.addEmp(emp);
		if(x>0){
			System.out.println("插入成功");
		}else{
			System.out.println("插入失败");
		}

	}

}

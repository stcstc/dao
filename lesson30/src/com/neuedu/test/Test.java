package com.neuedu.test;

import java.util.Date;

import com.neuedu.dao.impl.EmpDaoImpl;
import com.neuedu.entity.Emp;

public class Test {

	public static void main(String[] args) {
		//�������Ա��
		EmpDaoImpl dao=new EmpDaoImpl();
		
		/*Emp emp=new Emp();
		emp.setEmpno(88891);
		emp.setEname("����1");
		emp.setDeptno(10);
		emp.setHiredate(new Date());
		
		
		int x=dao.addEmp(emp);
		if(x>0)System.out.println("����ɹ�");
		else System.out.println("����ʧ��");*/
		int[] arr={8889,8895};
		int x=0;
		x=dao.delEmpByIds(arr);
		if(x>0)System.out.println("����ɾ���ɹ�");
		else System.out.println("����ɾ��ʧ��");
		
		
		
		
	}

}

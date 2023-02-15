package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Employeedao;
import dto.Employeedto;


public class EmployeeControl extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String s1 = req.getParameter("empid");
		int id = Integer.parseInt(s1);
		String s2 = req.getParameter("empname");
		String s3=req.getParameter("dob");
		String s4=req.getParameter("gender");
		
		Employeedto employeedto=new Employeedto();
		employeedto.setEmpid(id);
		employeedto.setEmpname(s2);
		employeedto.setDate(s3);
		employeedto.setGender(s4);
		
		Employeedao employeedao=new Employeedao();
		employeedao.insert(employeedto);
	
		
	}
	

}

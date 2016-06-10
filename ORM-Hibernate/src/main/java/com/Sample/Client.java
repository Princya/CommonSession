package com.Sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee employee1=new Employee();
	employee1.setEmpid(1);
	employee1.setEmpname("Anjali");
	employee1.setEmpsalary(200000);
	employee1.setEmpmobile(900302292);
	session.save(employee1);
	transaction.commit();
	System.out.println("Records added successfully");
	

}
}

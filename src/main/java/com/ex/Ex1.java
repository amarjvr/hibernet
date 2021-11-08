package com.ex;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ex1 {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		/*
		 * SQLQuery query = session.createSQLQuery("select * from Emp_TB");
		 * query.addEntity(Emp.class); List<Emp> list = query.list();
		 * System.out.println(list);
		 */
//		Transaction tx = session.beginTransaction();
//		Address add = new Address();
//		add.setCity("Guntur");
//		add.setSname("1");
//		Emp e = new Emp();
//		e.setName("Eswar");
//		e.setSal(1233333);
//		e.setAdd(add);
//		session.save(e);
//		session.persist(e);
//		tx.commit();
		Emp e = (Emp)session.get(Emp.class, 0);
//		System.out.println(e.getAdd());
	}
}

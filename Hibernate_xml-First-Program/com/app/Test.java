package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		@SuppressWarnings("deprecation")
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		tx.begin();
		Student stu = new Student();
		stu.setStdId(9155);
		stu.setStdName("AAAbbbb");
		stu.setStdFee(54533.42);
		ses.save(stu);
		tx.commit();
		ses.close();
		System.out.println(stu);
		System.out.println("done");

	}
}

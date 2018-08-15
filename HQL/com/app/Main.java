package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// pagination inputs
		int pageSize = 5;
		int pageNumber = 2;
		// common steps -begin
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Transaction tx = null;
		try {
			cfg = new Configuration();
			cfg.configure();
			ses = factory.openSession();
			tx = ses.beginTransaction();
			// common steps end.
			// For HQL with program
			String hql = "from Student.class.getName()";
			Query qry = ses.createQuery(hql);
			qry.setFirstResult((pageNumber - 1) * pageSize);
			qry.setMaxResults(pageSize);

			List<Student0> listObj = qry.list();
			Iterator<Student0> stditr = listObj.iterator();

			// * Display Data
			// display format-1 using with while iterator.

			while (stditr.hasNext()) {
				Student0 student = (Student0) stditr.next();
				System.out.println(student);
			}// while
				// common steps -begin
			tx.commit();
		} catch (Exception e) {
			// tx.rollback();
			e.printStackTrace();
		} finally {
			if (ses != null) {
				ses.close();
			}

		}// finally
			// end-common steps
		System.out.println("Done");
	}
}

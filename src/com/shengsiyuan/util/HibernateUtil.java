package com.shengsiyuan.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static {
		try {
			//sessionFactory = new Configuration().configure().buildSessionFactory();
			// http://stackoverflow.com/questions/8621906/is-buildsessionfactory-deprecated-in-hibernate-4
			Configuration configuration = new Configuration();
		    configuration.configure();
		    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		    sessionFactory = configuration.buildSessionFactory(registry);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static Session openSession() {
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public static void close(Session session) {
		if(null != session) {
			session.close();
		}
	}
}

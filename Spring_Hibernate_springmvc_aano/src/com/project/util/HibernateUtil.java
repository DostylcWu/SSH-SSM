package com.project.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory= null;
	private static Session session=null;
	private static ServiceRegistry serviceRegistry = null;
	private static Configuration config= null;
	/**
	 * 
	 * @return
	 */
	public static  Configuration getConfig() {
		
		config = new Configuration().configure();
		
		return config;
	}
	
	/**
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		 getConfig();
		 serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		 sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		return sessionFactory;
	}
	
	/**
	 * 
	 * @return session
	 */
	public static Session getSession() {
		session = getSessionFactory().openSession();
		return session;
	}
	/**
	 * 
	 */
	public static void closeCon() {
		if(session!=null) {
			session.close();
		}
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
		
	}
}

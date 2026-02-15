package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.keshav.entity.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new  Employee( "Kunal", "male", 22200);
		
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(e);
		tx.commit();
	}

}

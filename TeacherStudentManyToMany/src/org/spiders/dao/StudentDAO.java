package org.spiders.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.Booksdto;
import org.spiders.dto.Librarydto;
import org.spiders.dto.TeacherDTO;

import com.spiders.HibernateUtil;

public class StudentDAO {
	
	public int saveStudent(TeacherDTO teacherdto) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		Session session =  factory.openSession();
		
		session.beginTransaction();
		
		Integer id = (Integer) session.save(librarydto);
		
		session.getTransaction().commit();
		
		return id;
	}
	
public int saveLibraryAndBooks(Librarydto librarydto, List<Booksdto> listOfBooks) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		Session session =  factory.openSession();
		
		session.beginTransaction();
		
		//return primary key
		Integer id = (Integer) session.save(librarydto);
		
		for (Booksdto booksdto : listOfBooks) {
			session.save(booksdto);
		}
		
		session.getTransaction().commit();
		
		return id;
	}

	public Librarydto getLibraryById(int id) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		
		Session session = factory.openSession();
		
		return session.get(Librarydto.class, new Integer(id));
		
	}
	
	public void updateLibrary(Librarydto libFromRunner) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		
		Session session2 = factory.openSession();
		
		//get id by using dto object and use get method to get the object
		Librarydto libraryFromDb = session2.get(Librarydto.class, new Integer(libFromRunner.getId()));
		libraryFromDb.setLibName(libFromRunner.getLibName());
		libraryFromDb.setLocation(libFromRunner.getLocation());
		
		session2.beginTransaction();
		
		// update thr object
		session2.update(libraryFromDb);
		session2.getTransaction().commit();
		session2.close();
	}
	
	public void deleteLibrary(Librarydto dto) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		
		Session session3 = factory.openSession();
		
		session3.delete(dto);
		
		session3.close();
	
	
	
	
	}
}

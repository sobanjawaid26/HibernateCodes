package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.spiders.dao.LibraryDaO;
import org.spiders.dto.Booksdto;
import org.spiders.dto.Librarydto;

import com.spiders.HibernateUtil;

public class Runner {
public static void main(String[] args) {
	
	Librarydto lib1 = new Librarydto();
	lib1.setArea(500);
	lib1.setLibName("Hinduja");
	lib1.setLocation("Koramangala");
	
//	LibraryDaO librarryDaO = new LibraryDaO();
//	librarryDaO.saveLibrary(lib1);
	
	Booksdto b1 = new Booksdto();
	b1.setAuthor("ABC");
	b1.setBookName("abc");
	b1.setIsbn(12345);
	b1.setLibrary(lib1);
	
	Booksdto b2 = new Booksdto();
	b2.setAuthor("DEF");
	b2.setBookName("def");
	b2.setIsbn(34567);
	b2.setLibrary(lib1);
	
	Booksdto b3 = new Booksdto();
	b3.setAuthor("GHI");
	b3.setBookName("ghi");
	b3.setIsbn(56789);
	b3.setLibrary(lib1);
	
	List<Booksdto> listOfBooks = new ArrayList<Booksdto>();
	
	listOfBooks.add(b1);
	listOfBooks.add(b2);
	listOfBooks.add(b3);
	
	lib1.setListOfBooks(listOfBooks);
	
	LibraryDaO libraryDaO = new LibraryDaO();
	libraryDaO.saveLibraryAndBooks(lib1, listOfBooks);
	
	Librarydto librarydto = libraryDaO.getLibraryById(1);
	librarydto.setLibName("Ajanta");
	librarydto.setLocation("Mumbai");
	libraryDaO.updateLibrary(librarydto);

}
	
//	make connection
//	build session
//	mapping classes to table
//	2nd level cache maintainer
	//SessionFactory factory = HibernateUtil.getFactory();
	
//	Configuration configuration = new Configuration();
//	configuration.configure();
//	
//	SessionFactory factory = configuration.buildSessionFactory();
//	
//	
//	//crud operation
//	// 1st level cache maintainer
//	Session session = factory.openSession();
//	
//	session.beginTransaction();
//	
//	Library lib1 = new Library();
//	lib1.setArea(500);
//	lib1.setLibName("Hinduja");
//	lib1.setLocation("Koramangala");
//	
//	List<Books> listOfBooks = new ArrayList<Books>();
//	
//	Books b1 = new Books();
//	b1.setAuthor("ABC");
//	b1.setBookName("abc");
//	b1.setIsbn(12345);
//	b1.setLibrary(lib1);
//	
//	Books b2 = new Books();
//	b2.setAuthor("DEF");
//	b2.setBookName("def");
//	b2.setIsbn(34567);
//	b2.setLibrary(lib1);
//	
//	Books b3 = new Books();
//	b3.setAuthor("GHI");
//	b3.setBookName("ghi");
//	b3.setIsbn(56789);
//	b3.setLibrary(lib1);
//	
//	listOfBooks.add(b1);
//	listOfBooks.add(b2);
//	listOfBooks.add(b3);
//	
//	lib1.setListOfBooks(listOfBooks);
//	
//	session.save(lib1);
//	session.save(b1);
//	session.save(b2);
//	session.save(b3);
//	//session.save(listOfBooks);
//
//
//
//	
//	
//	session.getTransaction().commit();
//	session.close();
//	
//	}
	
}
	


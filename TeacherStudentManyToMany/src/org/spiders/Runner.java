package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.spiders.dao.TeacherDAO;
import org.spiders.dto.StudentDTO;
//import org.spiders.dao.LibraryDaO;
//import org.spiders.dto.Booksdto;
//import org.spiders.dto.Librarydto;
import org.spiders.dto.TeacherDTO;

import com.spiders.HibernateUtil;

public class Runner {
public static void main(String[] args) {
	
	TeacherDTO MrPramod = new TeacherDTO();
	MrPramod.setAge(40);
	MrPramod.setName("Pramod Sharma");
	MrPramod.setTeaching("Science");
	MrPramod.setDegree("BSC MS");
	
	TeacherDTO MrShan = new TeacherDTO();
	MrShan.setAge(50);
	MrShan.setName("Shan Singh");
	MrShan.setTeaching("Maths");
	MrShan.setDegree("MSC Maths");
	
	StudentDTO soban = new StudentDTO();
	soban.setAge(24);
	soban.setName("Muhammad Soban");
	soban.setClassroom("JSP");
	
	
	StudentDTO sufian = new StudentDTO();
	sufian.setAge(21);
	sufian.setName("Muhammad Sufian");
	sufian.setClassroom("SIT");
	
	StudentDTO raju = new StudentDTO();
	raju.setAge(23);
	raju.setName("Raju Kumar");
	raju.setClassroom("QSP");
	
	List<StudentDTO> studentListForMrPramod = new ArrayList<StudentDTO>();
	studentListForMrPramod.add(soban);
	studentListForMrPramod.add(sufian);
	
	List<StudentDTO> studentListForMrShan = new ArrayList<StudentDTO>();
	studentListForMrShan.add(soban);
	studentListForMrShan.add(raju);
	
	List<TeacherDTO> teacherListForSoban = new ArrayList<TeacherDTO>();
	teacherListForSoban.add(MrPramod);
	teacherListForSoban.add(MrShan);
	
	List<TeacherDTO> teacherListForSufian = new ArrayList<TeacherDTO>();
	teacherListForSufian.add(MrPramod);
	
	List<TeacherDTO> teacherListForRaju = new ArrayList<TeacherDTO>();
	teacherListForRaju.add(MrShan);
	
	MrPramod.setListOfStudent(studentListForMrPramod);
	MrShan.setListOfStudent(studentListForMrShan);
	
	soban.setListOfTeacher(teacherListForSoban);
	sufian.setListOfTeacher(teacherListForSufian);
	raju.setListOfTeacher(teacherListForRaju);
	
	
	List<TeacherDTO> listOfAllTeacher = new ArrayList<TeacherDTO>();
	listOfAllTeacher.add(MrPramod);
	listOfAllTeacher.add(MrShan);
	
	List<StudentDTO> listOfAllStudent = new ArrayList<StudentDTO>();
	listOfAllStudent.add(soban);
	listOfAllStudent.add(sufian);
	listOfAllStudent.add(raju);
	
	
	TeacherDAO teacherdao = new TeacherDAO();
	teacherdao.saveTeacherAndStudent(listOfAllTeacher, listOfAllStudent);
	
	
	
	
	
	
//	Librarydto lib1 = new Librarydto();
//	lib1.setArea(500);
//	lib1.setLibName("Hinduja");
//	lib1.setLocation("Koramangala");
//	
////	LibraryDaO librarryDaO = new LibraryDaO();
////	librarryDaO.saveLibrary(lib1);
//	
//	Booksdto b1 = new Booksdto();
//	b1.setAuthor("ABC");
//	b1.setBookName("abc");
//	b1.setIsbn(12345);
//	b1.setLibrary(lib1);
//	
//	Booksdto b2 = new Booksdto();
//	b2.setAuthor("DEF");
//	b2.setBookName("def");
//	b2.setIsbn(34567);
//	b2.setLibrary(lib1);
//	
//	Booksdto b3 = new Booksdto();
//	b3.setAuthor("GHI");
//	b3.setBookName("ghi");
//	b3.setIsbn(56789);
//	b3.setLibrary(lib1);
//	
//	List<Booksdto> listOfBooks = new ArrayList<Booksdto>();
//	
//	listOfBooks.add(b1);
//	listOfBooks.add(b2);
//	listOfBooks.add(b3);
//	
//	lib1.setListOfBooks(listOfBooks);
//	
//	LibraryDaO libraryDaO = new LibraryDaO();
//	libraryDaO.saveLibraryAndBooks(lib1, listOfBooks);
//	
//	Librarydto librarydto = libraryDaO.getLibraryById(1);
//	librarydto.setLibName("Ajanta");
//	librarydto.setLocation("Mumbai");
//	libraryDaO.updateLibrary(librarydto);
//
//}
	
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
	}
	
}
	


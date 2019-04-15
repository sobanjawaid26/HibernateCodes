package jspiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spiders.HibernateUtil;

public class Runner {
public static void main(String[] args) {
	
//	make connection
//	build session
//	mapping classes to table
//	2nd level cache maintainer
	//SessionFactory factory = HibernateUtil.getFactory();
	
	Configuration configuration = new Configuration();
	configuration.configure();
	
	SessionFactory factory = configuration.buildSessionFactory();
	
	
	//crud operation
	// 1st level cache maintainer
	Session session = factory.openSession();
	
	session.beginTransaction();
	
	Human soban = new Human();
	soban.setFirstName("Soban");
	soban.setLastName("Jawaid");
	soban.setAge(24);
	
//	Human sufian = new Human();
//	sufian.setFirstName("Sufian");
//	sufian.setLastName("Jawaid");
//	sufian.setAge(21);
//	
	Heart heart1 = new Heart();
	heart1.setBeatsPerMinute(300);
	heart1.setHadPreviousAttacks(false);
	heart1.setHasDisease(false);
//	
//	Heart heart2 = new Heart();
//	heart2.setBeatsPerMinute(400);
//	heart2.setHadPreviousAttacks(false);
//	heart2.setHasDisease(false);
//
	//soban.setHeart(heart1);
	session.save(soban);
	//session.save(heart1);
//	
//	sufian.setHeart(heart2);
//	session.save(sufian);
//	session.save(heart2);
	
	
	session.getTransaction().commit();
	session.close();
	
	}
	
	
	
}

package stKarens2;

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
	
	School school = new School();
	school.setArea(3000);
	school.setAddress("Patna");
	school.setRooms(300);
	
	Principal principal = new Principal();
	principal.setAnger(3);
	principal.setPatience(4);
	principal.setQualification("Phd");
	
	principal.setSchool(school);
	
	school.setPrincipal(principal);
	
	session.save(principal);
	
	session.save(school);
	
	School s = (School) session.get(School.class, new Integer(1));
	System.out.println(s);
	
	Principal p = (Principal) session.get(Principal.class, new Integer(1));
	System.out.println(p);
	
	session.getTransaction().commit();
	session.close();
	
	}
	
	
	
}

package spiders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Vehicle duke200 = new Vehicle();
		duke200.setMake("duke");
		duke200.setModel("200");
		duke200.setLplate("KA 10 9876");
		
		Engine engine = new Engine();
		engine.setCc("200 cc");
		engine.setHp("1000");
		
		engine.setVehicle(duke200);
		
		session.save(engine);
		session.save(duke200);
		
		session.getTransaction().commit();
		session.close();
	}

}

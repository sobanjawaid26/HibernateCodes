import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	public static void main(String[] args) {
		
		Configuration cnf = new Configuration();
		
		cnf.configure();
		
		SessionFactory fct = cnf.buildSessionFactory();
		Session ssn = fct.openSession();
		Transaction trns = ssn.beginTransaction();
		
		Shop s = new Shop();
		
		
		// associated 1
		Eatable e =  new Eatable();
		
		//associated 2
		SportsProduct sp =  new SportsProduct();
		
		e.setName("Muffin");
		e.setPrice(80);
		s.setEatable(e);
		
		sp.setName("Bat");
		sp.setPrice(2000);
		s.setSportsproducts(sp);
		
		
		ssn.save(s);
		trns.commit();
		ssn.close();
	}
}

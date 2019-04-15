import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	// saving logic

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		System.out.println("conf entered");
		SessionFactory factory = configuration.buildSessionFactory(); // create connections
		
		Session session = factory.openSession(); // for link update create dllete
		
		Transaction transaction = session.beginTransaction();  //
//		
	ClassRoom classRoom = new ClassRoom();
//		classroom.setId(2); 
//		classroom.setFloorName(2);
//		classroom.setNoOfStudent(30);
//		classroom.setRoomName("A1");
//	
//		session.save(classroom);
//		
//		transaction.commit();
		
		//ClassRoom classRoom = session.get(ClassRoom.class, new Integer(2));
		System.out.println(classRoom);
		classRoom.setFloorName(2);
		classRoom.setNoOfStudent(30);
		
		session.save(classRoom);
		
		transaction.commit();
		
		session.close();
		
		}
}

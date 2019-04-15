package org.karens.dao;

import java.util.List;

import org.hibernate.Session;
import org.karens.dto.FacultyDto;

import com.spiders.HibernateUtil;

public class StudentDao {

	public int saveFaculty(List<FacultyDto> listOfFaculty) {
		
		Session session = HibernateUtil.getFactory().openSession();
		
		session.beginTransaction();
		
		for (FacultyDto facultyDto : listOfFaculty) {
			session.save(listOfFaculty);
		}
		session.getTransaction().commit();

		return 0;
	}


}

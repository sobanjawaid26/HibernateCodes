package org.karens.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.karens.dto.FacultyDto;
import org.karens.dto.StudentDto;

import com.spiders.HibernateUtil;

public class FacultyDao {

	public int saveStudent( List<StudentDto>listOfStudent) {
		
		Session session = HibernateUtil.getFactory().openSession();
		
		session.beginTransaction();
		
		for (StudentDto studentDto : listOfStudent) {
			session.save(studentDto);
		}
		session.getTransaction().commit();

		return 0;
	}

}

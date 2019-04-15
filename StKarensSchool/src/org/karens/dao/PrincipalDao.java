package org.karens.dao;

import java.util.List;

import org.hibernate.Session;
import org.karens.dto.StudentDto;

import com.spiders.HibernateUtil;

public class PrincipalDao {

	public int saveFacultyForPrincipal(List<FacultyDao> facultyListForPrincipal) {
		
		Session session = HibernateUtil.getFactory().openSession();
		session.beginTransaction();
		
		for (FacultyDao facultyDao : facultyListForPrincipal) {
			session.save(facultyListForPrincipal);
		}
		session.getTransaction().commit();

		return 0;
	}
	
	public int saveStudentForPrincipal(List<StudentDto> studentListForPrincipal) {
		Session  session = HibernateUtil.getFactory().openSession();
		session.beginTransaction();
		
		for (StudentDto studentDto : studentListForPrincipal) {
			session.save(studentListForPrincipal);
		}
		
		return 0;
	}

}

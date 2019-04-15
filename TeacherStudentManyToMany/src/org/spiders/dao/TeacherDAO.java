package org.spiders.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.StudentDTO;
import org.spiders.dto.TeacherDTO;

import com.spiders.HibernateUtil;

public class TeacherDAO {
	
	public int saveTeacherAndStudent(List<TeacherDTO> listOfTeacher, List<StudentDTO> listOfStudent) {
		
		SessionFactory sessionfactory = HibernateUtil.getFactory();
		Session session = sessionfactory.openSession();
		
		session.beginTransaction();
		
		for (StudentDTO studentDTO : listOfStudent) {
			session.save(studentDTO);
		}
		
		for (TeacherDTO teacherDTO : listOfTeacher) {
			session.save(teacherDTO);
		}
		
		
		session.getTransaction().commit();
		session.close();
		
		return 0;
		
	}
}

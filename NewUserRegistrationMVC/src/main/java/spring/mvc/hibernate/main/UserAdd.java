package spring.mvc.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import spring.mvc.hibernate.utils.HibernateUtils;
import spring.mvc.model.Registrationn;



public class UserAdd {

	public static void createNewUser() {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session session = factory.openSession();
				){
				
				
//				Class<Registrationn> registrationType = Registrationn.class;
//				Serializable id = 103;
//				
//				
//				Registrationn foundRestaurant = session.find(registrationType, id);	//Finding the restaurant against some ID
				
				
			}
	}
	

}

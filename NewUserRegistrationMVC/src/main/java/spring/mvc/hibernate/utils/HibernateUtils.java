package spring.mvc.hibernate.utils;


import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import spring.mvc.model.Registrationn;


public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
	
		Configuration conf = new Configuration();
		
		Class<Registrationn> enitiyClass = Registrationn.class;
		
		conf.addAnnotatedClass(enitiyClass); // similar to Restaurant.hbm.xml
		
		Properties configProps =new Properties();
		
		configProps.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		configProps.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/student?useSSL=false");
		configProps.put("hibernate.connection.username", "root");
		configProps.put("hibernate.connection.password", "password");
		configProps.put("hibernate.show_sql", "true");
		configProps.put("hibernate.hbm2ddl.auto", "update");
		
		
		conf.setProperties(configProps);
		
		SessionFactory factory=conf.buildSessionFactory();
		return factory;
	}
}

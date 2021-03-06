package bbdd.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import bbdd.entity.Admin;
import bbdd.entity.Answers;
import bbdd.entity.Contest;
import bbdd.entity.Kahoot;
import bbdd.entity.Participant;
import bbdd.entity.Questions;
import bbdd.entity.User;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/kahoot_db");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "toor");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "create");

				configuration.setProperties(settings);

				// configuration.addAnnotatedClass(Table1.class);

				configuration.addAnnotatedClass(Admin.class);
				configuration.addAnnotatedClass(User.class);
				configuration.addAnnotatedClass(Contest.class);
				configuration.addAnnotatedClass(Participant.class);
				configuration.addAnnotatedClass(Kahoot.class);
				configuration.addAnnotatedClass(Questions.class);
				configuration.addAnnotatedClass(Answers.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
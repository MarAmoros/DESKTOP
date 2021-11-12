package bbdd.util;

import bbdd.dao.UserDao;
import bbdd.entity.User;
import login.LoginFrame;

public class App {
	public static void main(String[] args) {

		// Insert Users
		UserDao UserDao = new UserDao();
		User user = new User("Ram", "contraseña12");
		User user1 = new User("Marta", "gato1234");
		User user2 = new User("Laura", "burro5678");
		User user3 = new User("Carmen", "camello0987");
		UserDao.saveUser(user);
		UserDao.saveUser(user1);
		UserDao.saveUser(user2);
		UserDao.saveUser(user3);

		// Login Frame
		LoginFrame loginFrame = new LoginFrame();
		loginFrame.setVisible(true);

	}
}
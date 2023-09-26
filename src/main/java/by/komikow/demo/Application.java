package by.komikow.demo;

import by.komikow.demo.controllers.UserController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(by.komikow.demo.config.AppConfig.class);
		UserController userController =
				applicationContext.getBean(UserController.class);
		System.out.println(userController.getCountChars("application"));
	}
}

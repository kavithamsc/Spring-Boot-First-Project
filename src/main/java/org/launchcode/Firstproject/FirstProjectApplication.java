package org.launchcode.Firstproject;

import org.launchcode.Firstproject.MyProject.Home;
import org.launchcode.Firstproject.MyProject.InternetConnection;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=  SpringApplication.run(FirstProjectApplication.class, args);
		Home h = context.getBean(Home.class);
      h.connect();
	  //Bean of Spring
		Home h2 = context.getBean(Home.class);
		h2.connect();

	}

}

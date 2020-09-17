package app.creaps.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import app.creaps.dependencyinjection.atributos.*;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {


	ConfigurableApplicationContext context= SpringApplication.run(DependencyinjectionApplication.class, args);

Coche coche=	context.getBean(Coche.class);

		System.out.println(coche);
	}

}

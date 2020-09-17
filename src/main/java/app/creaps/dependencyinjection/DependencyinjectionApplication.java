package app.creaps.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyinjectionApplication.class, args);

	Motor motor = new Motor("x11", 1981);
	Coche	coche = new Coche ("VW",1986, motor);

		System.out.println(coche);

	}

}

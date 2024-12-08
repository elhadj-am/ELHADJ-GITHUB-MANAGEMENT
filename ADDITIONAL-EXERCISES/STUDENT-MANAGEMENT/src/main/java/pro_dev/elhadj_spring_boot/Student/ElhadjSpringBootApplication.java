package pro_dev.elhadj_spring_boot.Student;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro_dev.elhadj_spring_boot.MyFirstClass;

@SpringBootApplication
public class ElhadjSpringBootApplication {

	public static void main(String[] args) {
		var ctx =  SpringApplication.run(ElhadjSpringBootApplication.class, args);
		MyFirstClass myFirstClass = new MyFirstClass("myVar");

		System.out.println("Here in CleanUp1");

	}
}

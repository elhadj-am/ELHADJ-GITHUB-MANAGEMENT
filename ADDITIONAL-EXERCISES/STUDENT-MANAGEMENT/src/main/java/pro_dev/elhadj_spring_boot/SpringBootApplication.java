package pro_dev.elhadj_spring_boot;


import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {
		var ctx =  SpringApplication.run(SpringBootApplication.class, args);

		System.out.println("Here in CleanUp1");

	}
}

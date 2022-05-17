package demoWeb.com.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Web2Application {

	public static void main(String[] args) {
		SpringApplication.run(Web2Application.class, args);
	}

	@GetMapping("/swa")
	public String display(){
		return "okbe swa shakila";
	}
	@GetMapping("/ekula")
	public String display2(){
		return "ekula akilna";
	}

}

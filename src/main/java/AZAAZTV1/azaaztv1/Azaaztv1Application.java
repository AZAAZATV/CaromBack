package AZAAZTV1.azaaztv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.reactive.HiddenHttpMethodFilter;

@SpringBootApplication
public class Azaaztv1Application {
	public static void main(String[] args) {
		SpringApplication.run(Azaaztv1Application.class, args);
	}

	/*@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
		return new HiddenHttpMethodFilter();
	}*/
}

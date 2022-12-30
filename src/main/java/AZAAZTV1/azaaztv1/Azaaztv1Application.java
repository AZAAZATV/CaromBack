package AZAAZTV1.azaaztv1;

import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.reactive.HiddenHttpMethodFilter;

@SpringBootApplication
@Configuration
public class Azaaztv1Application {
	public static void main(String[] args) {
		SpringApplication.run(Azaaztv1Application.class, args);
	}

//	@Bean
//	public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//		return new HiddenHttpMethodFilter();
//	}
}


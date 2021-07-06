package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is an example of bootstrap initialization using ApplicationListener<ContextRefreshedEvent>.
 */
@SpringBootApplication
public class Spring5webappApplication {

  public static void main(String[] args) {
    SpringApplication.run(Spring5webappApplication.class, args);
  }
}

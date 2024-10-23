package co.com.rudas.microservice.resolveEnigmaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class SwaggerSpringBootApplication  {

    

    public static void main(String[] args) throws Exception {
        new SpringApplication(SwaggerSpringBootApplication.class).run(args);
    }

    
}

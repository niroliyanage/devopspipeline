package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}

@EnableConfigurationProperties({MyProperties.class})
public class ApplicationConfiguration {
 
    @Autowired
    private MyProperties myProperties;
 
    public MyProperties getMyProperties() {
        return myProperties;
    }
 
    public void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }
}


@ConfigurationProperties(prefix = "my")
public class MyProperties {
 
    /**
     * String property used to configure my app.
     */
    private String property;
 
    /**
     * Configuration for file operations.
     */
    private StandardCopyOption copyOption;
 
    public String getProperty() {
        return property;
    }
 
    public void setProperty(String property) {
        this.property = property;
    }
 
    public StandardCopyOption getCopyOption() {
        return copyOption;
    }
 
    public void setCopyOption(StandardCopyOption copyOption) {
        this.copyOption = copyOption;
    }
    
}
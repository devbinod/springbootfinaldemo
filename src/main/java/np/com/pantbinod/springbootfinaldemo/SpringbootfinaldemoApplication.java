package np.com.pantbinod.springbootfinaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootfinaldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfinaldemoApplication.class, args);
    }

}

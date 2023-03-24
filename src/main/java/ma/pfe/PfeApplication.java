package ma.pfe;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class PfeApplication {
    private  final static Logger LOGGER= LoggerFactory.getLogger(PfeApplication.class);

    public static void main(String[] args)
    {
        SpringApplication app=new SpringApplication(PfeApplication.class);
        ConfigurableEnvironment environment=app.run(args).getEnvironment();
        LOGGER.info("Access URLs:\n-------------------------------------------------------\n" +
                "Local: \t\thttp://localhost:{}/swagger-ui/\n\t" ,environment.getProperty("server.port"));
    }
}

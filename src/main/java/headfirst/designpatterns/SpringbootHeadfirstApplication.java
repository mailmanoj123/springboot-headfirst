package headfirst.designpatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;


@SpringBootApplication
@AllArgsConstructor
public class SpringbootHeadfirstApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringbootHeadfirstApplication.class);
	
	private RunStrategy runStrategy;
	
	private RunNewsBroker runNewsBroker;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHeadfirstApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("Hello Head First Design in Springboot World !!!");
		
		
		//runStrategy.run();
		
		runNewsBroker.run();
		
		
		LOG.info("------------Bye----------");
	}

}

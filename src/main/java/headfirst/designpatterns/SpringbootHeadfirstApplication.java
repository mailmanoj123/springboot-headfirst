package headfirst.designpatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import headfirst.designpatterns.strategy.DecoyDuck;
import headfirst.designpatterns.strategy.FlyBehavior;
import headfirst.designpatterns.strategy.FlyRocketPowered;
import headfirst.designpatterns.strategy.MallardDuck;
import headfirst.designpatterns.strategy.ModelDuck;
import headfirst.designpatterns.strategy.QuackBehavior;
import headfirst.designpatterns.strategy.RubberDuck;
import lombok.AllArgsConstructor;


@SpringBootApplication
@AllArgsConstructor
public class SpringbootHeadfirstApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringbootHeadfirstApplication.class);

	private MallardDuck mallardDuck;
	
	private ModelDuck modelDuck;
	
	private FlyBehavior flyRocketPowered;
	
	private RubberDuck rubberDuckie;
	
	private DecoyDuck decoy;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHeadfirstApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("Hello Head First Design in Springboot World !!!");
		
		
		
		// --- MiniDuckSimulator
		
		
		FlyBehavior cantFly = () -> System.out.println("I can't fly, from args");
		QuackBehavior squeak = () -> System.out.println("Squeak,  from args");
		RubberDuck	rubberDuckieArgs = new RubberDuck(cantFly, squeak);
		
		rubberDuckieArgs.performFly();
		rubberDuckieArgs.performQuack();
		
		rubberDuckie.performFly();
		rubberDuckie.performQuack();
		
		//DecoyDuck	decoy = new DecoyDuck();

		
		mallardDuck.performQuack();
		
		decoy.performQuack();
   
		modelDuck.performFly();	
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
		
		// --- MiniDuckSimulator1
		
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		modelDuck.performFly();
		modelDuck.setFlyBehavior(flyRocketPowered);
		modelDuck.performFly();
		
		
		LOG.info("------------Bye----------");
	}

}

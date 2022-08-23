package headfirst.designpatterns;

import org.springframework.stereotype.Component;

import headfirst.designpatterns.strategy.DecoyDuck;
import headfirst.designpatterns.strategy.FlyBehavior;
import headfirst.designpatterns.strategy.FlyWithWings;
import headfirst.designpatterns.strategy.MallardDuck;
import headfirst.designpatterns.strategy.ModelDuck;
import headfirst.designpatterns.strategy.QuackBehavior;
import headfirst.designpatterns.strategy.RubberDuck;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RunStrategy {

	private MallardDuck mallardDuck;

	private ModelDuck modelDuck;

	private FlyBehavior flyRocketPowered;

	private RubberDuck rubberDuckie;

	private DecoyDuck decoy;

	public void run() {

		// --- MiniDuckSimulator

		FlyBehavior cantFly = () -> System.out.println("I can't fly, from args");
		QuackBehavior squeak = () -> System.out.println("Squeak,  from args");
		RubberDuck rubberDuckieArgs = new RubberDuck(cantFly, squeak);

		rubberDuckieArgs.performFly();
		rubberDuckieArgs.performQuack();

		rubberDuckie.performFly();
		rubberDuckie.performQuack();

		// DecoyDuck decoy = new DecoyDuck();

		decoy.performQuack();

		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithWings());
		modelDuck.performFly();

		// --- MiniDuckSimulator1

		modelDuck.setFlyBehavior(flyRocketPowered);
		modelDuck.performFly();

		mallardDuck.performQuack();
		mallardDuck.performFly();
	}

}

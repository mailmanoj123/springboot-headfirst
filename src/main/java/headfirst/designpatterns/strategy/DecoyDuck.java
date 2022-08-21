package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class DecoyDuck extends Duck<FlyWithWings, Quack> {
	
	public DecoyDuck(FlyWithWings flyBehavior, Quack quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}


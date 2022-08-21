package headfirst.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Qualifier;

public class RedHeadDuck extends Duck<FlyBehavior, QuackBehavior> {
	
	public RedHeadDuck(@Qualifier("flyWithWings") final FlyBehavior flyBehavior, 
			@Qualifier("quack") final QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}


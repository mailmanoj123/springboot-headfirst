package headfirst.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RubberDuck extends Duck<FlyBehavior, QuackBehavior> {
	/* 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	*/
	
	public RubberDuck(@Qualifier("flyNoWay") final FlyBehavior flyBehavior, 
			@Qualifier("quack") final QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}

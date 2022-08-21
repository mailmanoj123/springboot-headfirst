package headfirst.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ModelDuck extends Duck<FlyBehavior, QuackBehavior> {

	public ModelDuck(@Qualifier("flyNoWay") final FlyBehavior flyBehavior, 
			@Qualifier("quack") final QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
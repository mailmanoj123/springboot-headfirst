package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component("flyWithWings")
public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with Wings !!");
	}
}

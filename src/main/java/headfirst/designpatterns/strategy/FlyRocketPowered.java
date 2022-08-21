package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component("flyRocketPowered")
public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}

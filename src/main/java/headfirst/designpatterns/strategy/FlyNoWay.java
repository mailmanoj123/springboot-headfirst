package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component("flyNoWay")
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}

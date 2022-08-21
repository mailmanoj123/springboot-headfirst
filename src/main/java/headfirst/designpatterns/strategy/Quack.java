package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component("quack")
public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}

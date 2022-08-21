package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
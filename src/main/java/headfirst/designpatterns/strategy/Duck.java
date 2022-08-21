package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public abstract class Duck<T extends FlyBehavior, U extends QuackBehavior> {
	
	T flyBehavior;
	U quackBehavior;
	
	
	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior(T flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(U quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


}

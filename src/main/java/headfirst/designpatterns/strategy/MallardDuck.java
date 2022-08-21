package headfirst.designpatterns.strategy;

import org.springframework.stereotype.Component;


@Component
public class MallardDuck extends Duck<FlyWithWings, Quack> {
	

	public MallardDuck(FlyWithWings flyBehavior, Quack quackBehavior) {
		super(flyBehavior, quackBehavior);
	}


	/*
	@Autowired
	@Qualifier("flyWithWings")
	@Override
	public void setFlyBehavior(FlyBehavior flyBehavior) {
	}


	@Autowired
	@Qualifier("quack")
	@Override
	public void setQuackBehavior(QuackBehavior quackBehavior) {
	}
	*/
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
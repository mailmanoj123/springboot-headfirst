package headfirst.designpatterns.state.gumballstatewinner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GumballMachine {
 
	@Autowired
    @Qualifier("soldOutState")
	State soldOutState;
	
	@Autowired
    @Qualifier("noQuarterState")
	State noQuarterState;
	
	@Autowired
    @Qualifier("hasQuarterState")
	State hasQuarterState;
	
	@Autowired
    @Qualifier("soldState")
	State soldState;
	
	@Autowired
    @Qualifier("winnerState")
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
	
	public void loadGumballs(int numberGumballs) {
		
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}

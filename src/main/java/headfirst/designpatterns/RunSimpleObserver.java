package headfirst.designpatterns;

import org.springframework.stereotype.Component;

import headfirst.designpatterns.observer.simple.SimpleObserver;
import headfirst.designpatterns.observer.simple.SimpleSubject;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RunSimpleObserver {
	
	SimpleSubject simpleSubject;
	
	SimpleObserver simpleObserver;

	public void run() {
	
		simpleSubject.setValue(80);
		
		simpleSubject.removeObserver(simpleObserver);
	}

}

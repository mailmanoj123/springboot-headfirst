package headfirst.designpatterns.observer.news;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Subscriber {

	private String name;
	
	public void update(News news) {
	
		System.out.println("New recieved by "+ this.getName() +"     news was related to  "+ news.getNewPayLoad());		
	}
}

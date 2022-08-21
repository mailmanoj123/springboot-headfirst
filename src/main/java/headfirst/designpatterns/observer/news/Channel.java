package headfirst.designpatterns.observer.news;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;


@Getter
public class Channel {
	
	NewsType newsType;
	
	List<Subscriber> subscribers;
	
	public Channel(NewsType newsType) {
		super();
		this.newsType = newsType;
		 subscribers = new ArrayList<>();
	}
	
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void updateClient(News news){
		
		subscribers.stream().forEach(s -> s.update(news));
		
	}

}

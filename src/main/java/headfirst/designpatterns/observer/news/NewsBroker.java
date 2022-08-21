package headfirst.designpatterns.observer.news;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NewsBroker {
	
	private List<Channel> channels = new ArrayList<>();
	
	public void addChannel(Channel channel) {
		this.channels.add(channel);
	}
	
	public void registerUser(NewsType newsType, Subscriber subscriber) {
		
		channels
		.stream()
		.filter(c -> c.getNewsType().equals(newsType))
		.findAny()
		.orElseThrow(()-> new IllegalArgumentException("Not supported news type "+ newsType))
		.addSubscriber(subscriber);		
	}
	
	public void unRegisterUser(NewsType newsType, Subscriber subscriber) {	
		
		channels
		.stream()
		.filter(c -> c.getNewsType().equals(newsType))
		.findAny()
		.orElseThrow(()-> new IllegalArgumentException("Not supported news type "+ newsType))
		.removeSubscriber(subscriber);	
	}
		
	public void pushNews(News news){
		
		channels
		.stream()
		.filter(c -> c.getNewsType().equals(news.newsType))
		.findAny()
		.orElseThrow(()-> new IllegalArgumentException("Not supported news type "+ news.newsType))
		.updateClient(news);
		
	}
}

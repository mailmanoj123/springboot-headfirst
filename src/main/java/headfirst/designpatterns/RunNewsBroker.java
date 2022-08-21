package headfirst.designpatterns;

import org.springframework.stereotype.Component;

import headfirst.designpatterns.observer.news.Channel;
import headfirst.designpatterns.observer.news.News;
import headfirst.designpatterns.observer.news.NewsBroker;
import headfirst.designpatterns.observer.news.NewsType;
import headfirst.designpatterns.observer.news.Subscriber;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RunNewsBroker {
	
	private NewsBroker newsBroker;
	
	public void run() {
		Channel CRIME =  new Channel(NewsType.CRIME);
		Channel POLITICES =  new Channel(NewsType.POLITICES);
		
		newsBroker.addChannel(POLITICES);
		newsBroker.addChannel(CRIME);
		
		Subscriber s1 = new Subscriber("s1_CRIME");
		Subscriber s2 = new Subscriber("s2_POLITICES");
		
		newsBroker.registerUser(NewsType.CRIME, s1);
		newsBroker.registerUser(NewsType.POLITICES, s2);
		newsBroker.registerUser(NewsType.POLITICES, new Subscriber("s2_POLITICES_02"));
		
		News news01 = new News(NewsType.CRIME, "This a crime news !!!");		
		newsBroker.pushNews(news01);
		
		
		newsBroker.pushNews(new News(NewsType.POLITICES, "This a POLITICES news !!!"));
		
		newsBroker.unRegisterUser(NewsType.POLITICES, s2);
		
		newsBroker.pushNews(new News(NewsType.POLITICES, "This a POLITICES news 02 !!!"));
		
	}
}

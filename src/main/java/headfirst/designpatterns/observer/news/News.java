package headfirst.designpatterns.observer.news;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class News {
	
	NewsType newsType;
	
	String newPayLoad;

}

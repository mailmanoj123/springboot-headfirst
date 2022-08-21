package headfirst.designpatterns.strategy.invokeProxyCall;

import lombok.Getter;

@Getter
public class Request {
	
	private RequestType requestType;
	
	private String requestPayLoad;

	public Request(RequestType requestType, String requestPayLoad) {
		super();
		this.requestType = requestType;
		this.requestPayLoad = requestPayLoad;
	}

	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", requestPayLoad=" + requestPayLoad + "]";
	} 
}

package headfirst.designpatterns.strategy.invokeProxyCall;

import org.springframework.stereotype.Component;

@Component
public class GetRequestHandler implements RequestHandler {

	@Override
	public RequestType supportedRequestType() {
		return RequestType.GET;
	}

	@Override
	public Response handle(Request request) {
		
		
		return new Response("Returned from GET");
	}

}

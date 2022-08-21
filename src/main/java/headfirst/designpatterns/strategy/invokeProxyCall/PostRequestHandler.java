package headfirst.designpatterns.strategy.invokeProxyCall;

import org.springframework.stereotype.Component;


@Component
public class PostRequestHandler implements RequestHandler {

	@Override
	public RequestType supportedRequestType() {
		return RequestType.POST;
	}

	@Override
	public Response handle(Request request) {
		return new Response("Returned from POST");
	}

}

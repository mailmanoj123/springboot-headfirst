package headfirst.designpatterns.strategy.invokeProxyCall;

interface RequestHandler {
	
    Response handle(Request request);

    RequestType supportedRequestType();
}

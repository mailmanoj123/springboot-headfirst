package headfirst.designpatterns.strategy.invokeProxyCall;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class InvokeProxyCall {
	
	private List<RequestHandler> handlers;

	public Response process(Request request) {

		Response response = handlers.stream().filter(h -> h.supportedRequestType().equals(request.getRequestType()))
				.findAny()
				.orElseThrow(
						() -> new IllegalStateException("Not found proper handler for " + request.getRequestType()))
				.handle(request);

		return response;
	}

}

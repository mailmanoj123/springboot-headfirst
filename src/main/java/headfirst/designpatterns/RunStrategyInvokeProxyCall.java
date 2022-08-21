package headfirst.designpatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import headfirst.designpatterns.strategy.invokeProxyCall.InvokeProxyCall;
import headfirst.designpatterns.strategy.invokeProxyCall.Request;
import headfirst.designpatterns.strategy.invokeProxyCall.RequestType;
import headfirst.designpatterns.strategy.invokeProxyCall.Response;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RunStrategyInvokeProxyCall {
	
private static Logger LOG = LoggerFactory.getLogger(RunStrategyInvokeProxyCall.class);
	
	private InvokeProxyCall  invokeProxyCall;
	
	public void run() {
		Request request01 = new Request(RequestType.GET, "Calling get method");
		Response response01 = invokeProxyCall.process(request01);
		
		LOG.info("request01   ==== "+ request01);
		LOG.info("response01 ==== " + response01);
		
		
		Request request02 = new Request(RequestType.POST, "Calling post method");
		Response response02 = invokeProxyCall.process(request02);
		
		LOG.info("request02   ==== "+ request02);
		LOG.info("response02 ==== " + response02);
	}

}

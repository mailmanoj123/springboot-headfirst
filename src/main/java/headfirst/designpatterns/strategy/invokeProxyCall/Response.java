package headfirst.designpatterns.strategy.invokeProxyCall;

public class Response {
	
	String retVal;

	public Response(String retVal) {
		super();
		this.retVal = retVal;
	}
	
	public String getRetVal() {
		return retVal;
	}

	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}

	@Override
	public String toString() {
		return "Response [retVal=" + retVal + "]";
	}
}

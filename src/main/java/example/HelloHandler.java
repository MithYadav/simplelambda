package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloHandler implements RequestHandler<Object,String> {
	

	@Override
	public String handleRequest(Object input, Context context) {
		// This will show up in CloudWatch Logs
		context.getLogger().log("Lambda Function invoked");
		return "Hello world from java 21";
	}

}

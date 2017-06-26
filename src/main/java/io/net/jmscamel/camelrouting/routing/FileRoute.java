package io.net.jmscamel.camelrouting.routing;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
	
	static final Logger log = LoggerFactory.getLogger(FileRoute.class);
	
	@Override
	public void configure() throws Exception {
		
		from("file:C:/camelInputFolder?noop=true")
		.to("file:C:/camelOutputFolder");
	}
}

package in.italent.service;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.italent.request.MessageRequest;
import reactor.core.publisher.Mono;
@Service
public class MessageService {

	
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MessageService.class);
	 
	    private final WebClient webClient;

	    
	    public MessageService() {
	        // Create a WebClient with the base URL
	        this.webClient = WebClient.create("https://techzone-dev2.cisco.com/api/2.0/");
	    }

	    public String createAMessage(MessageRequest message) {
	    	logger.debug("Method exceuted succesfully");
	        Mono<String> response = webClient.post()
	                .uri("messages?restapi.session_key=pZigVvoVp5k0T2OtyYlQtlJVeP8BxQ5jxG3CqguG9yM.&restapi.response_format=json")
	                .header("Content-Type", "application/json")
	                .header("Accept","application/json")
	                .body(BodyInserters.fromValue(message))
	                .retrieve()
	                .bodyToMono(String.class);

	        return response.block(); // Blocking for simplicity, consider using reactive programming.
	    }
}

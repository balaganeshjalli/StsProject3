package in.italent.RestController;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.italent.request.MessageRequest;

	 

	@RestController
	public class MessageController {

	 


	 

		@PostMapping(path="/create" ,produces="application/json")
		public String createAMessage(@RequestBody MessageRequest message) {

	 

			System.out.println(message);

			 String json=null;
			 HttpResponse<String> response =null;

			ObjectMapper objectMapper = new ObjectMapper();
	        try {
	             json = objectMapper.writeValueAsString(message);

	        } catch (Exception e) {
	            e.printStackTrace(); // Handle the exception according to your requirements

	        }

	 

			try {
				/*
				 creating HttpRequest object
				 */
				HttpRequest request = HttpRequest.newBuilder()
					    .uri(URI.create("https://techzone-dev2.cisco.com/api/2.0/messages?restapi.session_key=pZigVvoVp5k0T2OtyYlQtlJVeP8BxQ5jxG3CqguG9yM.&restapi.response_format=json"))
					    .header("accept", "application/json")
					    .header("content-type", "application/json")
					    .method("POST", HttpRequest.BodyPublishers.ofString(json))
					    .build();
				/*
				  Getting the response object
				 */
					 response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
					System.out.println(response.body());

	 

	 

			} catch (Exception e) {
				e.printStackTrace();
			}
	        return response.body();

	 
		}

	}
	



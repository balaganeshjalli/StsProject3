package in.italent.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.italent.request.MessageRequest;
import in.italent.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController2 {

	

	

	    private final MessageService messageService;

	    @Autowired
	    public MessageController2(MessageService messageService) {
	        this.messageService = messageService;
	    }

	    @PostMapping("/create")
	    public String createMessage(@RequestBody MessageRequest message) {
	        String response = messageService.createAMessage(message);
	        return response;
	    }
	}



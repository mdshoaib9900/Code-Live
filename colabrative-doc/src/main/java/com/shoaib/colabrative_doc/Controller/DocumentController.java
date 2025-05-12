package com.shoaib.colabrative_doc.Controller;

import com.shoaib.colabrative_doc.Model.DocumentMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DocumentController {

    private  String document="Start Typing Here...";

    @MessageMapping("/update")
    @SendTo("/topic/editor")
    public DocumentMessage updateDocument(DocumentMessage message){
        document=message.getContent();
        return new DocumentMessage(document);
    }
    @MessageMapping("/update/{roomId}")
    @SendTo("/topic/editor/{roomId}")
    public DocumentMessage updateDocument(@DestinationVariable String roomId, DocumentMessage message) {
        return message;
    }

}

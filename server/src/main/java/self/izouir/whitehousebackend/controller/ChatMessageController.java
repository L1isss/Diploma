package self.izouir.whitehousebackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import self.izouir.whitehousebackend.entity.chat.ChatMessage;
import self.izouir.whitehousebackend.service.chat.ChatMessageService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/messages")
public class ChatMessageController {
    private final ChatMessageService chatMessageService;

    @PostMapping
    public void saveMessage(@Validated @RequestBody final ChatMessage chatMessage) {
        chatMessageService.save(chatMessage);
    }
}

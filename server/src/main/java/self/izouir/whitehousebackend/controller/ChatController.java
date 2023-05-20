package self.izouir.whitehousebackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import self.izouir.whitehousebackend.entity.chat.Chat;
import self.izouir.whitehousebackend.service.chat.ChatService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/chats")
public class ChatController {
    private final ChatService chatService;

    @GetMapping("/{chatId}")
    public Chat find(@PathVariable("chatId") final Long chatId) {
        return chatService.find(chatId);
    }

    @PostMapping
    public void save(@Validated @RequestBody final Chat chat,
                     @RequestParam("firstUserId") final Long firstUserId,
                     @RequestParam("secondUserId") final Long secondUserId) {
        chatService.save(chat, firstUserId, secondUserId);
    }
}
